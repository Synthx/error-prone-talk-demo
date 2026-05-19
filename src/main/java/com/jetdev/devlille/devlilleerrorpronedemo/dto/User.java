package com.jetdev.devlille.devlilleerrorpronedemo.dto;

public record User(String name) {
    public User {
        if (name().isBlank()) {
            throw new IllegalArgumentException();
        }
    }
}
