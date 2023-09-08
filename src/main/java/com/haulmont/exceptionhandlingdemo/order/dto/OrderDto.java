package com.haulmont.exceptionhandlingdemo.order.dto;

import java.io.Serializable;
import java.util.List;

public record OrderDto(
        String number,
        List<OrderItemDto> orderItems
) implements Serializable {
}
