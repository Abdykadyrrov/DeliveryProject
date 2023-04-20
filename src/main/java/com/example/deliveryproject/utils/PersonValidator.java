package com.example.deliveryproject.utils;

import com.example.deliveryproject.entity.User;
import com.example.deliveryproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {
    private final UserService personService;
    @Autowired
    public PersonValidator(UserService personService) {
        this.personService = personService;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User person = (User) target;

        if (personService.findPersonByUsername(person.getUsername()).isPresent())
            errors.rejectValue("username", "", "Username is already exist");
    }

}
