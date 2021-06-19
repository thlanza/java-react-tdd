package com.weCode.bookStore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
@SpringBootTest
class BookStoreApplicationTests {

	@Test
	void contextLoads() {
	}

}
