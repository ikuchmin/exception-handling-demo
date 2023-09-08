package com.haulmont.exceptionhandlingdemo.common;

import com.haulmont.exceptionhandlingdemo.common.resolver.AdvancedExceptionHandlerExceptionResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import java.util.List;

// @Configuration
public class ExtendedWebMvcConfigurationSupport extends WebMvcConfigurationSupport {

    @Override
    protected ExceptionHandlerExceptionResolver createExceptionHandlerExceptionResolver() {
        return new AdvancedExceptionHandlerExceptionResolver();
    }
}
