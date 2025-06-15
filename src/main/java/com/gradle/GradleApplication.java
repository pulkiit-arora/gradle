package com.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc // Specify the base package for component scanning
@SpringBootApplication
@ComponentScan(basePackages = "com.gradle") // Ensure that Spring scans the correct package
public class GradleApplication {
    public static void main(String[] args) {
        // Application entry point
        System.out.println("Gradle Application is running with Spring MVC enabled.");
        SpringApplication.run(GradleApplication.class, args);
    }
}
