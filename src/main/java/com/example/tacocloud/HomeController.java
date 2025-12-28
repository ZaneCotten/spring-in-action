package com.example.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// The controller
@Controller
public class HomeController {

    // Handles requests for the root path /
    @GetMapping("/")
    // Returns the view name
    public String home(){
        return "home";
    }
}
