package com.epam.springCoreTask.util.impl;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.epam.springCoreTask.util.PasswordGenerator;

@Component
public class PasswordGeneratorImpl implements PasswordGenerator {

    private static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    Random random = new Random();

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }
        return password.toString();
    }
}
