package com.haulmont.exceptionhandlingdemo.order.dto;

import java.io.Serializable;

/**
 * DTO for {@link OrderDto}
 */
public record OrderCreateDto(String number) implements Serializable {
}