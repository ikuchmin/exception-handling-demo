package com.haulmont.exceptionhandlingdemo.user.dto;

import java.io.Serializable;

/**
 * DTO for {@link UserDto}
 */
public record UserRegistrationDto(String username, String email) implements Serializable {
}