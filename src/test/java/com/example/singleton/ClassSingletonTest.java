package com.example.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClassSingletonTest {
    @Test
    void test_singleton_ok() {

            ClassSingleton singleton1 = ClassSingleton.getInstance();
            ClassSingleton singleton2 = ClassSingleton.getInstance();
            ClassSingleton singleton3 = ClassSingleton.getInstance();

            singleton1.setDescription("First Singleton");

            assertEquals("First Singleton", singleton1.getDescription());
            assertEquals("First Singleton", singleton2.getDescription());
            assertEquals("First Singleton", singleton3.getDescription());
    }
}
