package nl.eleven;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void testGetFizzBuzzForNegative() {
		testGetFizzBuzzNumber("Fizz", -9999999);
	}

	@Test
	public void testGetFizzBuzzForNumberFifteen() {
		testGetFizzBuzzNumber("FizzBuzz", 15);
	}

	@Test
	public void testGetFizzBuzzForNumberFive() {
		testGetFizzBuzzNumber("Buzz", 5);
	}

	@Test
	public void testGetFizzBuzzForNumberOne() {
		testGetFizzBuzzNumber("1", 1);
	}

	@Test
	public void testGetFizzBuzzForNumberThree() {
		testGetFizzBuzzNumber("Fizz", 3);
	}

	@Test
	public void testGetFizzBuzzForNumberTwo() {
		testGetFizzBuzzNumber("2", 2);
	}

	private void testGetFizzBuzzNumber(String expected, int input) {
		assertEquals(expected, fizzBuzz.getFizzBuzzOrNumber(input));

	}
}