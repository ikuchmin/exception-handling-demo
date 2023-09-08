package com.haulmont.exceptionhandlingdemo.user.exception;

public class UserNotAcceptedByModeratorException extends UserBaseException {

    public static final Integer EXCEPTION_CODE = 1005;

    public UserNotAcceptedByModeratorException() {
        super();
    }

    public UserNotAcceptedByModeratorException(String message) {
        super(message);
    }

    public UserNotAcceptedByModeratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotAcceptedByModeratorException(Throwable cause) {
        super(cause);
    }
}
