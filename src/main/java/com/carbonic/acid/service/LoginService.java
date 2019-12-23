package com.carbonic.acid.service;

import com.carbonic.acid.common.VariableConstant;
import com.carbonic.acid.dto.login.LoginDto;
import com.carbonic.acid.mapper.UserMapper;
import com.carbonic.acid.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 登录业务
 * @Date 2019-03-18 14:43
 * @Created Mr.zhang
 */
@Service
public class LoginService {

    @Autowired
    UserMapper userMapper;

    public boolean validate(LoginDto loginDto){
        User user = userMapper.selectByPrimaryKey(loginDto.getUsername());

        /**
         * 密码正确且用户有效
         */
        if(user != null && StringUtils.equals(loginDto.getPassword(),user.getPassword()) && StringUtils.equals(user.getStatus(), VariableConstant.STATUS)){
            return true;
        } else {
            return false;
        }
    }
}
