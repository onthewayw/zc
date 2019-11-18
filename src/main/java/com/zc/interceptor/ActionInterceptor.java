package com.zc.interceptor;

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
                    throw new WapNoLoginException("用户没有登录!");
                }
                //将登录时间重置
                this.redisTokenOper.updateExpireTime(token);
            } catch (Exception e) {
                throw new WapNoLoginException("用户没有登录!");
            }
        } else {
            logger.info("没进登录拦截器");
        }

        return true;
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
