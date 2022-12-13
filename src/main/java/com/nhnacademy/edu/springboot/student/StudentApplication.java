package com.nhnacademy.edu.springboot.student;

import com.nhnacademy.edu.springboot.student.config.SystemDeveloperProperties;
import com.nhnacademy.edu.springboot.student.config.SystemVersionProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value =
    { SystemDeveloperProperties.class, SystemVersionProperties.class })
//@ConfigurationProperties
public class StudentApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(StudentApplication.class);
        springApplication.run(args);
    }

}
