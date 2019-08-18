package com.example.springboot.interceptor;

import com.example.springboot.exception.InvalidFieldException;
import com.example.springboot.exception.InvalidHeaderException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class ApplicationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(StringUtils.isEmpty(request.getHeader("auth_key"))){
            throw new InvalidHeaderException("Invalid request");
        }
        return super.preHandle(request, response, handler);
    }
}
