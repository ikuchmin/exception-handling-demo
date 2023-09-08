package com.haulmont.exceptionhandlingdemo.order.exception;

import com.haulmont.exceptionhandlingdemo.common.exception.BaseProjectException;

public class OrderInProcessingException extends OrderBaseException {

    public static final Integer EXCEPTION_CODE = 2001;

    public OrderInProcessingException() {
        super();
    }

    public OrderInProcessingException(String message) {
        super(message);
    }

    public OrderInProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderInProcessingException(Throwable cause) {
        super(cause);
    }
}
