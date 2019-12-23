package com.carbonic.acid.service;

import com.carbonic.acid.common.VariableConstant;
import com.carbonic.acid.dto.login.SingleLoginResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.Cookie;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Service
public class SingleLoginService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 根据cookie名称获取值
     *
     * @param name
     * @param cookies
     * @return
     */
    private String getCookieByName(String name, Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    /**
     * 根据cookie获取登录用户信息
     *
     * @param request
     * @return
     */
    public SingleLoginResult getSingleLoginUser(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String token = getCookieByName("token", cookies);
        if (StringUtils.isBlank(token)) {
            return null;
        }
        return getCacheUserInfo(token);
    }

    public SingleLoginResult getCacheUserInfo(String code) {
        String key = VariableConstant.PREFIX_KEY_USER_INFO + code;

        String value = stringRedisTemplate.boundValueOps(key).get();
        if (StringUtils.isBlank(value)) {
            return null;
        }

//        return jsonMapper.fromJson(value, SingleLoginResult.class);
        return null;
    }

}
