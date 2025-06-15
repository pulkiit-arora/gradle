package com.gradle;

public class ValidationConflictTest {
    public static void main(String[] args) {
        javax.validation.ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
        System.out.println("ValidatorFactory implementation: " + factory.getClass().getName());

    }
}