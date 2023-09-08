package com.haulmont.exceptionhandlingdemo.order.dto;

import java.io.Serializable;

public record OrderItemDto(
        Integer position
) implements Serializable {
}
