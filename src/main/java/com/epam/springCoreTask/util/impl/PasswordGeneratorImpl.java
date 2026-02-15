package com.epam.springCoreTask.util.impl;

import org.springframework.stereotype.Component;

import com.epam.springCoreTask.util.PasswordGenerator;

@Component
public class PasswordGeneratorImpl implements PasswordGenerator{
    
    public String generatePassword(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * chars.length());
            password.append(chars.charAt(index));
        }
        return password.toString();
    }
}
