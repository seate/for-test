package com.example.demoApplication;

import org.springframework.stereotype.Component;

@Component
public class TestForTest {

    public void successTest() {
        System.out.println("TestForTest success");
    }

    public void failTest() {
        throw new RuntimeException("TestForTest failed");
    }
}
