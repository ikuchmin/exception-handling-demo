package com.haulmont.exceptionhandlingdemo.user.dto;

import java.io.Serializable;

public record UserDto(
        String id,
        String username,
        String firstName,
        String lastName,
        String email
) implements Serializable {
}
