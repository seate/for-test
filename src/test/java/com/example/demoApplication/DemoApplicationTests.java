package com.example.demoApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TestForTest testForTest;

	@Test
	void success1() {
		testForTest.successTest();

	}


}
