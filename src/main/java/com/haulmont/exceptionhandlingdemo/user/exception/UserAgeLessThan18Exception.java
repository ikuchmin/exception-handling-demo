package com.haulmont.exceptionhandlingdemo.user.exception;

public class UserAgeLessThan18Exception extends UserBaseException {

    public static final Integer EXCEPTION_CODE = 1006;

    public UserAgeLessThan18Exception() {
        super();
    }

    public UserAgeLessThan18Exception(String message) {
        super(message);
    }

    public UserAgeLessThan18Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAgeLessThan18Exception(Throwable cause) {
        super(cause);
    }
}
