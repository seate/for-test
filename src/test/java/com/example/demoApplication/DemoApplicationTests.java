package com.example.demoApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests extends UsingTestContainerTest {

	@Value("${my.name}")
	String yes;

	@Autowired
	TestForTest testForTest;

	@Test
	void success1() {
		testForTest.successTest();
		testForTest.repoTest();

		System.out.println("yes: " + yes);
		throw new RuntimeException("fail for graphql test");
	}


}
