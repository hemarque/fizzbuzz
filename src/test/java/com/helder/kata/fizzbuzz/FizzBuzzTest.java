package com.bbva.katas.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	public String fizzBuzz(int number){
		return "";
	}

	@Test
	public void returnNothingWith1() {
		assertEquals("Not the expected response", "", fizzBuzz(1));
	}
}