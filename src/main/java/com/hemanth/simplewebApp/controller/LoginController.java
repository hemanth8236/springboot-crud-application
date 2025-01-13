package com.hemanth.simplewebApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for handling login-related requests.
 * Provides an endpoint for the login page.
 */
@RestController
public class LoginController {

    /**
     * Returns the login page message.
     * @return A string indicating the login page.
     */
    @RequestMapping("/login")
    public String login(){
        return "Login Page";
    }
}
