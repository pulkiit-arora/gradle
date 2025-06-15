package com.gradle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RestController
public class GradleController {

    @PostMapping("/gradle")
    public String handleGradleRequest(@Valid @RequestBody MyObject object) {
        // Handle the request and return a response
        return "Gradle request handled successfully!";
    }

    // Define the MyObject class with validation annotations
    public static class MyObject {
        @NotNull
        private String name;

        @Min( 1)
        private int age;

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
