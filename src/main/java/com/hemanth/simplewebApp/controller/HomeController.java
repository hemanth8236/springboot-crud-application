package com.hemanth.simplewebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling home-related requests.
 * Provides endpoints for greeting and about information.
 */
@RestController
public class HomeController {

    /**
     * Returns a greeting message.
     * @return A string containing "Hello World".
     */
    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }

    /**
     * Returns information about the application.
     * @return A string describing the application.
     */
    @RequestMapping("/about")
    public String about(){
        return "This is a simple web app";
    }
}
