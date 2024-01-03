package com.dac.emtt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.dac.emtt.modal.User;
import com.dac.emtt.service.UserService;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login"; // Assuming you have a login.html template
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String authenticateUser(Model model, User user) {
        // Perform user authentication using UserService
        if (userService.authenticate(user.getEmail(), user.getPassword()).isPresent()) {
            // Successful authentication, redirect to home page
            return "redirect:/home";
        } else {
            // Failed authentication, display error message
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
}
