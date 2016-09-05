package nl.eleven;


import java.util.stream.IntStream;

import static java.lang.System.out;

public class FizzBuzz {

	private static final int BUZZ_NUMBER = 5;

	private static final int FIZZ_NUMBER = 3;

	public static void main(String... args) {
		IntStream.rangeClosed(1, 10000)
				.limit(100)
				.forEach(FizzBuzz::printFizzBuzz);
	}

	static String getFizzBuzzOrNumber(int number) {
		if (number == 0) {
			return "0";
		}

		StringBuilder result = new StringBuilder();

		if (number % FIZZ_NUMBER == 0) {
			result.append("Fizz");
		}

		if (number % BUZZ_NUMBER == 0) {
			result.append("Buzz");
		}

		if (result.length() > 0) {
			return result.toString();
		}

		return String.valueOf(number);

	}

	private static void printFizzBuzz(int i) {
		out.println(String.format("%d %s", i, getFizzBuzzOrNumber(i)));
	}
}