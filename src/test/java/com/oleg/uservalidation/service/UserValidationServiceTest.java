package com.oleg.uservalidation.service;

import com.oleg.uservalidation.bean.User;
import com.oleg.uservalidation.exceptions.UserValidationException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserValidationServiceTest {

    @Test(expected = UserValidationException.class)
    public void checkUserFirstAndLastNameLength() throws UserValidationException {
        User user = new User();
        UserValidationService service = new UserValidationService(user);
        service.checkUserFirstAndLastNameLength("oleg","ko");
    }

    @Test(expected = UserValidationException.class)
    public void checkMinUserAgeSide() throws UserValidationException {
        User user = new User();
        UserValidationService service = new UserValidationService(user);
        service.checkUserAge(0);
    }
    @Test(expected = UserValidationException.class)
    public void checkMaxUserAgeSide() throws UserValidationException {
        User user = new User();
        UserValidationService service = new UserValidationService(user);
        service.checkUserAge(121);
    }
}