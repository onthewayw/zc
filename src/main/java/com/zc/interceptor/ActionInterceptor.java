package com.zc.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.utils.RedisTokenOper;
import com.zc.web.exception.WapNoLoginException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wangjiangtao
 */
public class ActionInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ActionInterceptor.class);

    @Autowired
    private RedisTokenOper redisTokenOper;

    public ActionInterceptor() {
    }

    /**
     * 在请求前调用
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
        logger.info("拦截器token================" + token);
        logger.info("拦截器redisOper=============" + this.redisTokenOper);
        if (handler instanceof HandlerMethod) {
            try {
                ZcUser bean = this.redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
                if (null == bean) {
                    //表示用户没有登录

                    /**
                     * 拦截目录下请求，是否为ajax请求
                     *   是：无需登录，直接访问（因为我是用于首页的ajax登录请求）
                     *   否：跳转至登录界面
                     */
                    if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
                        //如果是ajax请求响应头会有，x-requested-with
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("code", 400);
                        jsonObject.put("message", "ajax请求没有登录");
                        returnJson(response, jsonObject.toJSONString());
                        return false;
                        //response.setHeader("sessionstatus", "timeout");//在响应头设置session状态
                    } else {
                        String loginUrl = request.getContextPath() + "/index";
                        response.sendRedirect(loginUrl);
                        return false;
                    }
                }
                //将登录时间重置
                this.redisTokenOper.updateExpireTime(token);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            logger.info("没进登录拦截器");
        }
        return true;
    }

    /*返回客户端数据*/
    private void returnJson(HttpServletResponse response, String json) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/json; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        try {
            boolean b = handler instanceof HandlerMethod;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
