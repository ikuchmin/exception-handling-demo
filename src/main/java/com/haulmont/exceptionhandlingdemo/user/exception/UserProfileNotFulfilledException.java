package com.haulmont.exceptionhandlingdemo.user.exception;

public class UserProfileNotFulfilledException extends UserBaseException {

    public static final Integer EXCEPTION_CODE = 1001;

    public UserProfileNotFulfilledException() {
        super();
    }

    public UserProfileNotFulfilledException(String message) {
        super(message);
    }

    public UserProfileNotFulfilledException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserProfileNotFulfilledException(Throwable cause) {
        super(cause);
    }
}
