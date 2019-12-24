package com.carbonic.acid.controller;

import com.carbonic.acid.common.Result;
import com.carbonic.acid.common.RetUtils;
import com.carbonic.acid.common.enums.ResultEnum;
import com.carbonic.acid.dto.login.RegisterDto;
import com.carbonic.acid.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录、权限等校验
 */
@Slf4j
@RestController
@RequestMapping("/authority")
public class LoginController {

    @Autowired
    LoginService loginService;

    /**
     * 注册
     */
    @RequestMapping("/register")
    public Result register(@RequestBody RegisterDto registerDto){
        try {
            Boolean register = loginService.register(registerDto);

            if(register){
                return RetUtils.succRet();
            } else {
                return RetUtils.failRet(ResultEnum.SERVICE_BIZ_INVALID.getCode(), "用户已存在");
            }
        } catch (Exception e) {
            log.error("注册异常", e);
            return RetUtils.failRet(ResultEnum.SERVICE_UNKNOWN_ERROR);
        }
    }

    @RequestMapping("/loginSystem")
    public void loginSystem(){

    }
}
