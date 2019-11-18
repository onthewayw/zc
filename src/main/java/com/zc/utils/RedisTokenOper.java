package com.zc.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author wangjiangtao
 */
@Component
public class RedisTokenOper {
    @Autowired(required = false)
    public StringRedisTemplate stringRedisTemplate;
    @Autowired(required = false)
    private HttpServletRequest request;

    /**
     * redis中key的前缀
     */
    private final String redisKeyPrefix = "zc:user:token:";

    /**
     * 按秒来算  半个小时过期时间
     */
    private final long expireTime = 1800L;


    public void setInfo(Object key, Object info) {
        String token = getToken();
        if (StringUtils.isNotBlank(token)) {
            stringRedisTemplate.opsForHash().put(redisKeyPrefix + token, key, JSONObject.toJSONString(info));
            stringRedisTemplate.expire(redisKeyPrefix + token, expireTime, TimeUnit.SECONDS);
        }
    }

    public void setInfo(Object key, Object info, Long time) {
        String token = getToken();
        if (StringUtils.isNotBlank(token)) {
            stringRedisTemplate.opsForHash().put(redisKeyPrefix + token, key, JSONObject.toJSONString(info));
            stringRedisTemplate.expire(redisKeyPrefix + token, time, TimeUnit.SECONDS);
        }
    }

    public void setInfo(String token, Object key, Object info) {
        if (StringUtils.isNotBlank(token)) {
            stringRedisTemplate.opsForHash().put(redisKeyPrefix + token, key, JSONObject.toJSONString(info));
            stringRedisTemplate.expire(redisKeyPrefix + token, expireTime, TimeUnit.SECONDS);
        }
    }

    public void updateExpireTime() {
        String token = getToken();
        if (StringUtils.isNotBlank(token)) {
            stringRedisTemplate.expire(redisKeyPrefix + token, expireTime, TimeUnit.SECONDS);
        }
    }

    public void updateExpireTime(String token) {
        if (StringUtils.isNotBlank(token)) {
            stringRedisTemplate.expire(redisKeyPrefix + token, expireTime, TimeUnit.SECONDS);
        }
    }

    public String getInfo(Object key) {
        String token = getToken();
        if (StringUtils.isNotBlank(token)) {
            Object obj = stringRedisTemplate.opsForHash().get(redisKeyPrefix + token, key);
            if (obj != null) {
                return obj.toString();
            }
        }
        return null;
    }

    public <T> T getInfo(Object key, Class<T> tClass) {
        String token = getToken();
        if (StringUtils.isNotBlank(token)) {
            Object obj = stringRedisTemplate.opsForHash().get(redisKeyPrefix + token, key);
            if (obj != null) {
                return JSONObject.parseObject(JSON.toJSON(obj).toString(), tClass);
            }
        }
        return null;
    }

    public <T> List<T> getListInfo(Object key, Class<T> tClass) {
        String token = getToken();
        if (StringUtils.isNotBlank(token)) {
            Object obj = stringRedisTemplate.opsForHash().get(redisKeyPrefix + token, key);
            if (obj != null) {
                return JSONObject.parseArray(JSON.toJSON(obj).toString(), tClass);
            }
        }
        return null;
    }

    public <T> List<T> getListInfo(String token, Object key, Class<T> tClass) {
        if (StringUtils.isNotBlank(token)) {
            Object obj = stringRedisTemplate.opsForHash().get(redisKeyPrefix + token, key);
            if (obj != null) {
                return JSONObject.parseArray(JSON.toJSON(obj).toString(), tClass);
            }
        }
        return null;
    }

    public <T> T getInfo(String token, Object key, Class<T> tClass) {
        if (StringUtils.isNotBlank(token)) {
            Object obj = stringRedisTemplate.opsForHash().get(redisKeyPrefix + token, key);
            if (obj != null) {
                return JSONObject.parseObject(JSON.toJSON(obj).toString(), tClass);
            }
        }
        return null;
    }

    public void deleteInfo() {
        String token = getToken();
        if (StringUtils.isNotBlank(token)) {
            stringRedisTemplate.delete(redisKeyPrefix + token);
        }
    }

    public void deleteInfo(String token) {
        if (StringUtils.isNotBlank(token)) {
            stringRedisTemplate.delete(redisKeyPrefix + token);
        }
    }

    private String getToken() {
        String token = null;
        if (request != null) {
            token = request.getHeader("Authorization");
        }
        return token;
    }
}
