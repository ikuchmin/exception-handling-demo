package com.haulmont.exceptionhandlingdemo.user.exception;

import com.haulmont.exceptionhandlingdemo.common.exception.BaseProjectException;

public class UserAlreadyExistException extends UserBaseException {

    public static final Integer EXCEPTION_CODE = 1002;

    public UserAlreadyExistException() {
        super();
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }

    public UserAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyExistException(Throwable cause) {
        super(cause);
    }
}
