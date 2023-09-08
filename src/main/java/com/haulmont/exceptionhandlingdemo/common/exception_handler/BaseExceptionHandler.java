package com.haulmont.exceptionhandlingdemo.common.exception_handler;

import com.haulmont.exceptionhandlingdemo.common.exception.BaseProjectException;
import com.haulmont.exceptionhandlingdemo.user.exception.UserBaseException;
import com.haulmont.exceptionhandlingdemo.user.exception.UserBlockedException;
import com.haulmont.exceptionhandlingdemo.user.exception.UserProfileNotFulfilledException;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@Order(Integer.MAX_VALUE)
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(BaseProjectException.class)
    public ResponseEntity<ExceptionDto> handleException(BaseProjectException ex) {

        return ResponseEntity.badRequest().body(new ExceptionDto(ex.getExceptionCode(),
                ex.getMessage() != null ? ex.getMessage() : "Unknown error"));
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionDto> handleUserProfileIsNotFulfilledException(UserProfileNotFulfilledException ex) {
        return ResponseEntity.badRequest().body(new ExceptionDto(ex.getExceptionCode(), "Redirect to profile page"));
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionDto> handleUserBlockedException(UserBlockedException ex) {
        return ResponseEntity.badRequest().body(new ExceptionDto(ex.getExceptionCode(), "User is blocked"));
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionDto> handleUserBaseException(UserBaseException ex) {
        return ResponseEntity.badRequest().body(new ExceptionDto(ex.getExceptionCode(), "User base exception"));
    }
}
