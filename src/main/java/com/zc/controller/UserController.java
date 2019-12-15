package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcUser;
import com.zc.constant.SecretConstant;
import com.zc.constant.StatusEnum;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcUserService;
import com.zc.utils.CodecUtils;
import com.zc.utils.RedisTokenOper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired(required = false)
    private ZcUserService zcUserService;
    @Autowired(required = false)
    private HttpServletRequest request;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    /**
     * 验证密码并且修改密码
     */
    @RequestMapping("/changePwd")
    public Map<String, Object> changePwd(ZcUser zcUser) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser user = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != user) {
                user = zcUserService.queryById(user.getId());
                //验证登录密码是否正确  表示需要修改的是登录密码
                if (!StringUtils.isEmpty(zcUser.getPassword())) {
                    String pwd = CodecUtils.md5Hex(zcUser.getPassword(), SecretConstant.SLAT);
                    //验证登录密码是否一致
                    if (!StringUtils.equals(user.getPassword(), pwd)) {
                        returnObject.put("code", StatusEnum.LOGIN_PWD_CHANGE_ERROR.getCode());
                        returnObject.put("message", StatusEnum.LOGIN_PWD_CHANGE_ERROR.getName());
                        return returnObject;
                    } else {
                        if (!StringUtils.isEmpty(zcUser.getChangePwd())) {
                            //一致则修改当前登录密码
                            ZcUser changeUserInfo = new ZcUser();
                            String changePwd = CodecUtils.md5Hex(zcUser.getChangePwd(), SecretConstant.SLAT);
                            changeUserInfo.setPassword(changePwd);
                            changeUserInfo.setId(user.getId());
                            int i = zcUserService.updateZcUser(changeUserInfo);
                            if (i != 0) {
                                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                            }
                        } else {
                            //表示没有change密码
                            returnObject.put("code", StatusEnum.CHANGE_PWD_NO_ERROR.getCode());
                            returnObject.put("message", StatusEnum.CHANGE_PWD_NO_ERROR.getName());
                            return returnObject;
                        }
                    }
                } else if (!StringUtils.isEmpty(zcUser.getCashOutPwd())) {
                    //表示更改提现密码  两者不会同时存在，所以这样
                    String pwd = CodecUtils.md5Hex(zcUser.getCashOutPwd(), SecretConstant.SLAT);
                    //验证登录密码是否一致
                    if (!StringUtils.equals(user.getCashOutPwd(), pwd)) {
                        returnObject.put("code", StatusEnum.CASH_OUT_PWD_CHANGE_ERROR.getCode());
                        returnObject.put("message", StatusEnum.CASH_OUT_PWD_CHANGE_ERROR.getName());
                        return returnObject;
                    } else {
                        if (!StringUtils.isEmpty(zcUser.getChangePwd())) {
                            //一致则修改当前登录密码
                            ZcUser changeUserInfo = new ZcUser();
                            String changePwd = CodecUtils.md5Hex(zcUser.getChangePwd(), SecretConstant.SLAT);
                            changeUserInfo.setCashOutPwd(changePwd);
                            changeUserInfo.setId(user.getId());
                            int i = zcUserService.updateZcUser(changeUserInfo);
                            if (i != 0) {
                                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                            }
                        } else {
                            //表示没有change密码
                            returnObject.put("code", StatusEnum.CHANGE_PWD_NO_ERROR.getCode());
                            returnObject.put("message", StatusEnum.CHANGE_PWD_NO_ERROR.getName());
                            return returnObject;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    @RequestMapping("/info")
    public ZcUser queryUserInfo() {
        String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
        ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
        return zcUser;
    }

    /**
     * 新增人员
     */
    @RequestMapping("/addOrUpdate")
    public Map<String, Object> addRecord(ZcUser zcUser) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser user = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                //将密码加密后创建
                if (!StringUtils.isEmpty(zcUser.getPassword())) {
                    String pw = CodecUtils.md5Hex(zcUser.getPassword(), SecretConstant.SLAT);
                    zcUser.setPassword(pw);
                }
                /*if (!StringUtils.isEmpty(zcUser.getCashOutPwd())) {
                    String pw = CodecUtils.md5Hex(zcUser.getCashOutPwd(), SecretConstant.SLAT);
                    zcUser.setCashOutPwd(pw);
                }*/
                if (null != zcUser.getId()) {
                    int i = zcUserService.updateZcUser(zcUser);
                    if (i != 0) {
                        returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    }
                } else {
                    //是有本人创建的
                    zcUser.setParentId(user.getId());
                    Long id = zcUserService.insertZcUser(zcUser);
                    if (null != id) {
                        returnObject.put("id", id);
                        returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 分页查询
     */
    @RequestMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, ZcUser zcUser) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser user = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != user) {
                zcUser.setParentId(user.getId());
                PageInfo<ZcUser> pageInfo = zcUserService.queryByPage(page, size, zcUser);
                returnObject.put("data", pageInfo);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }
}
