package com.example.singleton;

import lombok.Data;

@Data
public final class ClassSingleton {
    private static ClassSingleton instance;
    private String description;

    public static ClassSingleton getInstance() {
        if (instance == null) {
            instance = new ClassSingleton();
        }
        return instance;
    }
}
