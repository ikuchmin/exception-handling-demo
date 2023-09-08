package com.haulmont.exceptionhandlingdemo.order.exception;

public class OrderCanceledException extends OrderBaseException {

    public static final Integer EXCEPTION_CODE = 2002;

    public OrderCanceledException() {
        super();
    }

    public OrderCanceledException(String message) {
        super(message);
    }

    public OrderCanceledException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderCanceledException(Throwable cause) {
        super(cause);
    }
}
