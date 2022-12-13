package com.nhnacademy.edu.springboot.student.configure.actuator.health;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    private final AtomicBoolean up = new AtomicBoolean(false);

    public void setUp(boolean up) {
        this.up.set(up);
    }

    @Override
    public Health health() {
        if (this.up.get()) {
           return Health.up().build();
        }
        return Health.down()
            .withDetails(Map.of("Custom", "failed"))
            .build();
    }
}
