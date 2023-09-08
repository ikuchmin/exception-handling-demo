package com.haulmont.exceptionhandlingdemo.user.exception;

import com.haulmont.exceptionhandlingdemo.common.exception.BaseProjectException;

public class UserBlockedException extends UserBaseException {

    public static final Integer EXCEPTION_CODE = 1003;

    public UserBlockedException() {
        super();
    }

    public UserBlockedException(String message) {
        super(message);
    }

    public UserBlockedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserBlockedException(Throwable cause) {
        super(cause);
    }
}
