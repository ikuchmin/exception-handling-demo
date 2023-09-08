package com.haulmont.exceptionhandlingdemo.user;

import com.haulmont.exceptionhandlingdemo.user.dto.UserDto;
import com.haulmont.exceptionhandlingdemo.user.dto.UserRegistrationDto;
import com.haulmont.exceptionhandlingdemo.user.exception.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDto registerUser(UserRegistrationDto userRegistrationDto) {
        checkUsernameExist(userRegistrationDto);

        // never be achieved
        return null;
    }

    public void checkUserAllowedForOperations(String login) {
        checkUserIsBlocked(login);
        checkUserAcceptedByMaintainer(login);
        checkUserProfileIsFilled(login);
        checkUserOlderThan18(login);
    }

    private void checkUserOlderThan18(String login) {
        if (login.startsWith("18_")) {
            throw new UserAgeLessThan18Exception("User age less than 18");
        }
    }

    private void checkUserAcceptedByMaintainer(String login) {
        if (login.startsWith("ac_")) {
            throw new UserNotAcceptedByModeratorException("Not acceptable by maintainer");
        }
    }

    private void checkUsernameExist(UserRegistrationDto userRegistrationDto) {
        throw new UserAlreadyExistException("User already exist");
    }

    private void checkUserIsBlocked(String login) {
        if (login.startsWith("bl_")) {
            throw new UserBlockedException("User is banned");
        }
    }

    private void checkUserProfileIsFilled(String login) {
        if (login.startsWith("fl_")) {
            throw new UserProfileNotFulfilledException("User profile is not fulfilled");
        }
    }

}
