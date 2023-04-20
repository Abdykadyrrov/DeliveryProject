package com.example.deliveryproject.controller;

import com.example.deliveryproject.entity.User;
import com.example.deliveryproject.service.UserService;
import com.example.deliveryproject.utils.PersonValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {
    private final UserService personService;
    private final PersonValidator personValidator;



    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

    @GetMapping("/register")
    public String registrationPage(@ModelAttribute("user") User user) {
        return "auth/registration";
    }

    @PostMapping("/register")
    public String performRegistration(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {

        personValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors())
            return "auth/registration";

        personService.save(user);
        return "redirect:/auth/login";
    }

}
