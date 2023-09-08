package com.haulmont.exceptionhandlingdemo.user;

import com.haulmont.exceptionhandlingdemo.user.UserService;
import com.haulmont.exceptionhandlingdemo.user.dto.UserDto;
import com.haulmont.exceptionhandlingdemo.user.dto.UserRegistrationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/user"})
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = {"/register"})
    public ResponseEntity<UserDto> registerUser(@RequestBody UserRegistrationDto userRegistrationDto) {
        UserDto userDto = userService.registerUser(userRegistrationDto);
        return ResponseEntity.ok(userDto);
    }
}

