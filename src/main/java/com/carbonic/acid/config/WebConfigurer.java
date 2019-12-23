package com.carbonic.acid.config;

import com.carbonic.acid.config.intercepors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description WebConfigurer
 * @Date 2019-03-18 18:08
 * @Created Mr.zhang
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }

    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // addPathPatterns("/**") 表示拦截的请求，
        // excludePathPatterns("/login", "/register") 白名单
        //registry.addInterceptor(loginInterceptor).addPathPatterns("/login").excludePathPatterns("/index");
    }

}
