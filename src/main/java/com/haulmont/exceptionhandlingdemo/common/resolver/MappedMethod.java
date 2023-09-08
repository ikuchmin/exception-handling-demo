package com.haulmont.exceptionhandlingdemo.common.resolver;

import java.lang.reflect.Method;

public record MappedMethod(Class<? extends Throwable> type, Method method) {
}
