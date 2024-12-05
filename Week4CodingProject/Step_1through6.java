package Week4CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Step_1through6 {

	public static void main(String[] args) {

		/*
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93.
		 */
		// Create an array of all seven numbers.
		int[] numbers = { 3, 9, 23, 64, 2, 8, 28, 93 };

		// Create a List of int called ages
		List<Integer> ages = new ArrayList<>();

		// Add each element in the numbers array to the ArrayList ages.
		for (int number : numbers) {
			ages.add(number);
		}

		// Print contents of ages as a checkpoint.
		System.out.println("Ages contains " + ages);

		/*
		 * 1.a. Programmatically subtract the value of the first element in the array
		 * from the value in the last element of the array (i.e. do not use ages[7] in
		 * your code). Print the result to the console. Result should be 90.
		 */
		System.out.println("Ages result is " + (ages.get(ages.size() - 1) - (ages.get(0))));

		/*
		 * 1.b. Create a new array of int called ages2 with 9 elements (ages2 will be
		 * longer than the ages array, and have more elements).
		 */
		// Create an array of nine elements.
		int[] numbers2 = { 34, 49, 2, 99, 86, 50, 40, 7, 45 };

		// Create an ArrayList called ages2
		List<Integer> ages2 = new ArrayList<>();

		// Add each element in the numbers array to the ArrayList ages.
		for (int number2 : numbers2) {
			ages2.add(number2);
		}

		// Print contents of ages2 as a checkpoint.
		System.out.println("Ages2 contains " + ages2);

		// 1.b.i. Make sure that there are 9 elements of type int in this new array.
		System.out.println("Ages2 size is " + ages2.size());

		/*
		 * 1.b.ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		 * value of the first element in the new array ages2 from the last element of
		 * ages2).
		 */
		// Result should be 11.
		System.out.println("Ages2 result is " + (ages2.get(ages2.size() - 1) - (ages2.get(0))));

		/*
		 * 1.b.iii. Show that using the index values for the elements is dynamic (works
		 * for arrays of different lengths).
		 */
		System.out.println("Sending ages list to the calculateDiff method; result should be 90.");
		calculateDiff(ages);

		System.out.println("Sending ages2 list to the calculateDiff method; result should be 11.");
		calculateDiff(ages2);

		/*
		 * 1.c. Use a loop to iterate through the array and calculate the average age.
		 * Print the result to the console.
		 */
		// Add each number to a variable sumAge
		int sumAge = 0;
		for (int age : ages) {
			sumAge += age;
		}

		// Calculate the average age
		double avgAge = (double) sumAge / ages.size();
		System.out.println("Average age is " + avgAge);

		/*
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */

		// Array of names
		String[] listNames = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		List<String> names = new ArrayList<>();
		for (String listName : listNames) {
			names.add(listName);
		}
		System.out.println("List of Names: " + names.toString());

		/*
		 * 2.a. Use a loop to iterate through the array and calculate the average number
		 * of letters per name. Print the result to the console.
		 */
		// Create a variable of int to hold the total number of letters.
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}

		/*
		 * Create a variable of double to hold the calculation of the average number of
		 * letters per name.
		 */
		double averageLetters = (double) totalLetters / names.size();
		System.out.println("Average number of letters per name: " + averageLetters);

		/*
		 * 2.b. Use a loop to iterate through the array again and concatenate all the
		 * names together, separated by spaces, and print the result to the console.
		 */
		// Concatenate all names separated by spaces using StringBuilder
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) {
			concatenatedNames.append(name).append(" ");
		}

		// Remove the trailing space at the end
		if (concatenatedNames.length() > 0) {
			concatenatedNames.setLength(concatenatedNames.length() - 1);
		}
		// Print result to console.
		System.out.println("Concatenated names: " + concatenatedNames);

		/*
		 * 3. How do you access the last element of any array? Use list.get(list.size()
		 * -1); For example:
		 */
		System.out.println("Last element in ages: " + ages.get(ages.size() - 1));

		/*
		 * 4. How do you access the first element of any array? Use list.get(0); For
		 * example:
		 */
		System.out.println("First element in ages: " + ages.get(0));

		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */

		List<Integer> nameLengths = new ArrayList<>();
		for (String name : names) {
			nameLengths.add(name.length());
		}
		System.out.println("Name Lengths is " + nameLengths);

		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */
		int nameSum = 0;
		for (int i = 0; i < nameLengths.size(); i++) {
			nameSum += nameLengths.get(i);
		}
		System.out.println("Sum of name lengths is " + nameSum);
	}

	// 2.b.iii Method that takes an ArrayList of any size and returns the correct
	// value
	private static void calculateDiff(List<Integer> list) {
		System.out.println("Result is " + (list.get(list.size() - 1) - (list.get(0))));
	}
}
