package com.haulmont.exceptionhandlingdemo.user.exception_handler;

import com.haulmont.exceptionhandlingdemo.common.exception_handler.ExceptionDto;
import com.haulmont.exceptionhandlingdemo.user.exception.UserAgeLessThan18Exception;
import com.haulmont.exceptionhandlingdemo.user.exception.UserNotAcceptedByModeratorException;
import com.haulmont.exceptionhandlingdemo.user.exception.UserProfileNotFulfilledException;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@Order(100)
@RestControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionDto> handleUserAgeLessThan18Exception(UserAgeLessThan18Exception ex) {
        return ResponseEntity.badRequest().body(new ExceptionDto(ex.getExceptionCode(), "User age is less than 18"));
    }
}
