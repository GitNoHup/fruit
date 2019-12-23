package com.carbonic.acid.controller;

import com.carbonic.acid.dto.LoginDto;
import com.carbonic.acid.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 登录
 * @Date 2019-03-18 14:10
 * @Created Mr.zhang
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/validate")
    public String loginValidate(LoginDto loginDto){
        boolean validate = loginService.validate(loginDto);

        if(validate){
            return "/common/preview";
        } else {
            return "fail";
        }
    }
}
