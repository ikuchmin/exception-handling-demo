package com.haulmont.exceptionhandlingdemo.order;

import com.haulmont.exceptionhandlingdemo.order.dto.OrderCreateDto;
import com.haulmont.exceptionhandlingdemo.order.dto.OrderDto;
import com.haulmont.exceptionhandlingdemo.order.dto.OrderItemDto;
import com.haulmont.exceptionhandlingdemo.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final UserService userService;

    public OrderService(UserService userService) {
        this.userService = userService;
    }

    public OrderDto createOrder(String userId, OrderCreateDto orderCreateDto) {
        userService.checkUserAllowedForOperations(userId);

        // never be achieved
        return null;
    }

    public OrderDto addOrderItem(String userId, OrderDto orderDto, OrderItemDto orderItemDto) {
        userService.checkUserAllowedForOperations(userId);

        return null;
    }

}
