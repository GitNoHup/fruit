package com.carbonic.acid.service;

import com.carbonic.acid.common.VariableConstant;
import com.carbonic.acid.common.enums.AuthorityEnum;
import com.carbonic.acid.common.enums.StatusEnum;
import com.carbonic.acid.dto.login.LoginDto;
import com.carbonic.acid.dto.login.RegisterDto;
import com.carbonic.acid.mapper.UserMapper;
import com.carbonic.acid.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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

    public Boolean register(RegisterDto registerDto){
        User user = userMapper.selectByPrimaryKey(registerDto.getAddUserName());

        if(user == null){
            User registerMsg = new User();
            registerMsg.setUserName(registerDto.getAddUserName());
            registerMsg.setPassword(registerDto.getAddPassword());
            registerMsg.setAuthority(AuthorityEnum.CUNSUMER.getCode());
            registerMsg.setStatus(StatusEnum.EFFECTIVE.getCode());
            Date sysTime = new Date();
            registerMsg.setCreateTime(sysTime);
            registerMsg.setModifyTime(sysTime);

            userMapper.insertSelective(registerMsg);
            return true;
        }

        return false;
    }
}
