package com.example.testrepo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Testrepo1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFailed() {
		assert 1 == 1;
	}

}
