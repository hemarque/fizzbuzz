package com.bbva.katas.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	public String fizzBuzz(int number){
		if(number%3==0)
			return "fizz";
		return "";
	}

	@Test
	public void returnNothingWith1() {
		assertEquals("Not the expected response", "", fizzBuzz(1));
	}

	@Test
	public void returnNothingWith2() {
		assertEquals("Not the expected response", "", fizzBuzz(2));
	}

	@Test
	public void returnFizzWith3() {
		assertEquals("Not the expected response", "fizz", fizzBuzz(3));
	}

	@Test
	public void returnNothingWith4() {
		assertEquals("Not the expected response", "", fizzBuzz(4));
	}
}