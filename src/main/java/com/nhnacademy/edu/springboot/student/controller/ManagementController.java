package com.nhnacademy.edu.springboot.student.controller;

import com.nhnacademy.edu.springboot.student.configure.actuator.health.CustomHealthIndicator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ManagementController {
    private final CustomHealthIndicator customHealthIndicator;

    @PostMapping("/management/fail")
    public String fail() {
        customHealthIndicator.setUp(false);
        return "OK..";
    }

    @PostMapping("/management/success")
    public String success() {
        customHealthIndicator.setUp(true);
        return "OK!!";
    }


}
