package com.competency.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.competency.demo.greeting.HelloController;

public class HelloControllerTest {

	HelloController controller;
	
	@BeforeEach
	void setup() {
		controller = new HelloController();
	}

	@Test
	public void getMessageTest() {
		assertEquals("Hello there!!", controller.getMessage());
	}

	@Test
	public void getMessageWithInputTest() {
		String expected = "Hello, John";
		String actual = controller.getMessageWithInputName("John");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMessageWithNameTest() {
		String expected = "Hello, Pewdipie";
		String actual = controller.getMessageWithInputName("Pewdipie");
		assertEquals(expected, actual);
	}
}
