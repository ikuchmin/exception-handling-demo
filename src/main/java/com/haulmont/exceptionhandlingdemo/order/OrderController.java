package com.haulmont.exceptionhandlingdemo.order;

import com.haulmont.exceptionhandlingdemo.common.exception_handler.ExceptionDto;
import com.haulmont.exceptionhandlingdemo.order.dto.OrderCreateDto;
import com.haulmont.exceptionhandlingdemo.order.dto.OrderDto;
import com.haulmont.exceptionhandlingdemo.user.exception.UserBlockedException;
import com.haulmont.exceptionhandlingdemo.user.exception.UserNotAcceptedByModeratorException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/order")
public class OrderController {

    protected final Log logger = LogFactory.getLog(getClass());

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionDto> handleException(UserBlockedException ex) {
        return new ResponseEntity<>(new ExceptionDto(ex.getExceptionCode(),
                "Order cannot be placed because user is banned"), HttpStatus.BAD_REQUEST);
    }

    // todo exceptions can not be re-thrown
//    @ExceptionHandler
//    public ResponseEntity<ExceptionDto> handleException(UserNotAcceptedByModeratorException ex) {
//        logger.warn("User not moderated");
//
//        throw ex;
//    }


    @PostMapping(path = "/create")
    public OrderDto createOrder(@RequestParam String userId, @RequestBody OrderCreateDto orderCreateDto) {
        return orderService.createOrder(userId, orderCreateDto);
    }
}

