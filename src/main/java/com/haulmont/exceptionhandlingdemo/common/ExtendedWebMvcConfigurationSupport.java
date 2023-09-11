package com.haulmont.exceptionhandlingdemo.common;

import com.haulmont.exceptionhandlingdemo.common.resolver.AdvancedExceptionHandlerExceptionResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

// @Configuration
public class ExtendedWebMvcConfigurationSupport extends DelegatingWebMvcConfiguration {

    @Override
    protected ExceptionHandlerExceptionResolver createExceptionHandlerExceptionResolver() {
        return new AdvancedExceptionHandlerExceptionResolver();
    }
}
