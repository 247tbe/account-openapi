package com.nhnacademy.edu.springboot.student.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(Map<String, String> model) {
        model.put("message", "hello");
        return "welcome";
    }
}