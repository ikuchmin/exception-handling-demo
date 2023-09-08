package com.haulmont.exceptionhandlingdemo.common.exception;

import io.vavr.control.Try;

public class BaseProjectException extends RuntimeException {

    public static final Integer EXCEPTION_CODE = 1;

    public BaseProjectException() {
        super();
    }

    public BaseProjectException(String message) {
        super(message);
    }

    public BaseProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseProjectException(Throwable cause) {
        super(cause);
    }

    public Integer getExceptionCode() {
        return Try.of(() -> (Integer) getClass().getField("EXCEPTION_CODE").get(this))
                .getOrElse(EXCEPTION_CODE);
    }
}
