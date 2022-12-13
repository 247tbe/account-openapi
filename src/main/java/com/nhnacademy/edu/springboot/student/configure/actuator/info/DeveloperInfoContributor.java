package com.nhnacademy.edu.springboot.student.configure.actuator.info;

import java.util.Map;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class DeveloperInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("developer", Map.of("name", "Kendrick"));
    }
}
