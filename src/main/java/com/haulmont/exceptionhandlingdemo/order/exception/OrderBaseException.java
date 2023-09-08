package com.haulmont.exceptionhandlingdemo.order.exception;

import com.haulmont.exceptionhandlingdemo.common.exception.BaseProjectException;

public class OrderBaseException extends BaseProjectException {

    public static final Integer EXCEPTION_CODE = 2000;

    public OrderBaseException() {
        super();
    }

    public OrderBaseException(String message) {
        super(message);
    }

    public OrderBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderBaseException(Throwable cause) {
        super(cause);
    }
}
