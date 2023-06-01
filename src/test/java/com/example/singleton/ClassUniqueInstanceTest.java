package com.example.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClassUniqueInstanceTest {
    @Test
    public void test_unique_ok() {
        ClassUniqueInstance unique1 = ClassUniqueInstance.INSTANCE.getInstance();
        ClassUniqueInstance unique2 = ClassUniqueInstance.INSTANCE.getInstance();

        unique1.setClick(2);

        assertEquals(2, unique1.getClick());
        assertEquals(2, unique2.getClick());
    }
}
