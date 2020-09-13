package com.oleg.uservalidation.service;

import com.oleg.uservalidation.bean.User;
import com.oleg.uservalidation.exceptions.UserValidationException;

public class UserValidationService {
    private User user;

    public UserValidationService(User user) {
        this.user = user;
    }

    public void checkUserFirstAndLastNameLength(String firstName,String lastName) throws UserValidationException {

        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();

        if ((firstNameLength > 15 || lastNameLength > 15) ||
                (firstNameLength < 3) || (lastNameLength < 3)) {
            throw new UserValidationException();
        } else {
            System.out.println("Данные введены корректно!");
            user.setFirstName(firstName);
            user.setLastName(lastName);
        }
    }

    public void checkUserAge(int age) throws UserValidationException {
        if ((age > 0) && (age <= 120)){
            user.setAge(age);
        } else {
            throw new UserValidationException();
        }
    }
}
