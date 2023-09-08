package com.haulmont.exceptionhandlingdemo.user.exception;

import com.haulmont.exceptionhandlingdemo.common.exception.BaseProjectException;

public class UserBaseException extends BaseProjectException {

    public static final Integer EXCEPTION_CODE = 1000;

    public UserBaseException() {
        super();
    }

    public UserBaseException(String message) {
        super(message);
    }

    public UserBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserBaseException(Throwable cause) {
        super(cause);
    }
}
