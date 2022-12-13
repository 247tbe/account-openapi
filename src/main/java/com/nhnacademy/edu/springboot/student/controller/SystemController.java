package com.nhnacademy.edu.springboot.student.controller;

import com.nhnacademy.edu.springboot.student.config.SystemDeveloperProperties;
import com.nhnacademy.edu.springboot.student.config.SystemVersionProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SystemController {

//    @Value("${google.developer.name}")
//    private String name;

    private final SystemDeveloperProperties systemDeveloperProperties;
    private final SystemVersionProperties versionProperties;

    @GetMapping("/system/developer")
    public String getDeveloper() {
//        return name;
        return "Developer of the year is...................dugudugudugu " + systemDeveloperProperties.getName() + " !!!!!!!!!";
    }

    @GetMapping("/system/version")
    public String getVersion() {
        return "{\"version\": \"" + versionProperties.getVersion() + "\"}";
    }


}
