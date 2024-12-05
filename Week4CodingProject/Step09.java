package Week4CodingProject;

/*
 * 9. Write a method that takes an array of int and returns true if the sum of
 * all the ints in the array is greater than 100.
 */

import java.util.ArrayList;
import java.util.List;

public class Step09 {

	public static void main(String[] args) {

		// Create basic array of numbers.
		int[] integers = { 10, 20, 30, 40 };

		// Loop through integers array and add each element to ArrayList numbers.
		List<Integer> numbers = new ArrayList<>();
		for (int integer : integers) {
			numbers.add(integer);
		}

		// Call the method to evaluate true/false result.
		boolean result = isSumGreaterThan100(numbers);
		System.out.println("Is the sum greater than 100? " + result); // Output: true
	}

	public static boolean isSumGreaterThan100(List<Integer> numbers) {

		// Create variable to store sum of numbers.
		int sum = 0;

		// Calculate the sum of all elements in the list
		for (int number : numbers) {
			sum += number;
		}

		// Return true if sum is greater than 100, otherwise false
		return sum > 100;
	}
}