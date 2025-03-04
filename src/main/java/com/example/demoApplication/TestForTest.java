package com.example.demoApplication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestForTest {

    private final TestRepos testRepos;

    public void successTest() {
        System.out.println("TestForTest success");
    }

    public void repoTest() {
        testRepos.save(new TestEntity());
    }
}
