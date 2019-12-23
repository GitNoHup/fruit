package com.carbonic.acid.intercept;

import com.carbonic.acid.dto.login.SingleLoginResult;
import com.carbonic.acid.service.SingleLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Component
public class AuthLoginIntercept implements HandlerInterceptor {

    @Autowired
    private SingleLoginService singleLoginService;

    private static Set<String> URL_SET = new HashSet<>();

    static {
        URL_SET.add("/mdmweb/loginByCode");
        URL_SET.add("/fastLogin/1");
        URL_SET.add("/fastLogin/2");
        URL_SET.add("/fastLogin/3");
        URL_SET.add("/error/jurisdiction");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String url = request.getServletPath();

        if (URL_SET.contains(url)) {
            return true;
        }

        SingleLoginResult singleLoginResult = singleLoginService.getSingleLoginUser(request);

        if (singleLoginResult == null) {
            response.sendRedirect("/error/jurisdiction");
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
