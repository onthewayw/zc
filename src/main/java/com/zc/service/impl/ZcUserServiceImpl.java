package com.zc.service.impl;

import com.zc.bean.ZcUser;
import com.zc.constant.SecretConstant;
import com.zc.constant.StatusEnum;
import com.zc.constant.WebUserConstant;
import com.zc.mapper.ZcUserMapper;
import com.zc.service.ZcUserService;
import com.zc.utils.CodecUtils;
import com.zc.utils.RedisTokenOper;
import com.zc.utils.TokenUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ZcUserServiceImpl implements ZcUserService {
    @Autowired(required = false)
    private ZcUserMapper zcUserMapper;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    @Override
    public Long insertZcUser(ZcUser object) {
         zcUserMapper.insertZcUser(object);
        return object.getId();
    }

    @Override
    public int updateZcUser(ZcUser object) {
        return zcUserMapper.updateZcUser(object);
    }

    @Override
    public List<ZcUser> queryZcUser(ZcUser object) {
        return zcUserMapper.queryZcUser(object);
    }


    @Override
    public ZcUser queryById(Long id) {
        return zcUserMapper.queryById(id);
    }

    @Override
    public Map<String, Object> login(String phonenum, String password, HttpServletRequest request) {
        Map<String, Object> returnMap = new HashMap<>(8);
        int status = StatusEnum.LOGIN_STATUS_SYSTEM_ERR.getCode();
        String message = StatusEnum.LOGIN_STATUS_SYSTEM_ERR.getName();
        returnMap.put("status", status);
        returnMap.put("message", message);
        try {
            //1 根据手机号查询
            ZcUser user = new ZcUser();
            user.setPhoneNum(phonenum);
            ZcUser zcUser = zcUserMapper.selectOne(user);
            // 2 判断是否存在
            if (null == zcUser) {
                //用户名 错误
                status = StatusEnum.LOGIN_STATUS_NO_ACCOUNT.getCode();
                message = StatusEnum.LOGIN_STATUS_NO_ACCOUNT.getName();
                returnMap.put("status", status);
                returnMap.put("message", message);
                return returnMap;
            }
            // 3校验密码
            //3.1 对用户输入的密码进行加密
            String pw = CodecUtils.md5Hex(password, SecretConstant.SLAT);
            //3.2 判断与数据库是否一致
            if (!StringUtils.equals(zcUser.getPassword(), pw)) {
                status = StatusEnum.LOGIN_STATUS_PASSWORD_ERR.getCode();
                message = StatusEnum.LOGIN_STATUS_PASSWORD_ERR.getName();
                returnMap.put("status", status);
                returnMap.put("message", message);
                return returnMap;
            }
            //表示可以登录
            String userAgent = request.getHeader("user-agent");
            String token = TokenUtils.generateJWT(zcUser.getId() + "", zcUser.getUserName(), userAgent);
            //将信息放入redis
            redisTokenOper.setInfo(token, WebUserConstant.SESSIONUSERINFO, zcUser);
            returnMap.put("token", token);
            returnMap.put("userInfo", zcUser);
            returnMap.put("status", StatusEnum.LOGIN_STATUS_SUCCESS.getCode());
            returnMap.put("message", StatusEnum.LOGIN_STATUS_SUCCESS.getName());
            return returnMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnMap;
    }
}
