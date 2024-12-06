package Week4CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Week4CodingProject {

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

		System.out.println("1. Contents of ages is " + ages);

		/*
		 * 1.a. Programmatically subtract the value of the first element in the array
		 * from the value in the last element of the array (i.e. do not use ages[7] in
		 * your code). Print the result to the console. Result should be 90.
		 */
		System.out.println("1.a. ages subtraction result is " + (ages.get(ages.size() - 1) - (ages.get(0))));

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
		System.out.println("1.b. Contents of ages2 is " + ages2);

		// 1.b.i. Make sure that there are 9 elements of type int in this new array.
		System.out.println("1.b.i. Size of ages2 is " + ages2.size());

		/*
		 * 1.b.ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		 * value of the first element in the new array ages2 from the last element of
		 * ages2).
		 */
		// Result should be 11.
		System.out.println("1.b.ii. ages2 subtraction result is " + (ages2.get(ages2.size() - 1) - (ages2.get(0))));

		/*
		 * 1.b.iii. Show that using the index values for the elements is dynamic (works
		 * for arrays of different lengths).
		 */
		System.out.println("1.b.iii. Sending ages list to the calculateDiff method; result should be 90.");
		calculateDiff(ages);

		System.out.println("1.b.iii. Sending ages2 list to the calculateDiff method; result should be 11.");
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
		System.out.println("1.c. Average age in sumAge is " + avgAge + "\n");

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
		System.out.println("2. Names in names list are " + names.toString());

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
		System.out.println("2.a. Average number of letters per name: " + averageLetters);

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
		System.out.println("2.b. Concatenated names: " + concatenatedNames + "\n");

		/*
		 * 3. How do you access the last element of any array?
		 */
		System.out.println("3. To access the last element in any array, use list.get(list.size() - 1");
		System.out.println("3. Example: ages.get(ages.size() - 1) is " + ages.get(ages.size() - 1) + "\n");

		/*
		 * 4. How do you access the first element of any array? Use list.get(0); For
		 * example:
		 */
		System.out.println("4. To access the first element in any array, use list.get(0).");
		System.out.println("4. Example: ages.get(0) is " + ages.get(0) + "\n");

		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */

		List<Integer> nameLengths = new ArrayList<>();
		for (String name : names) {
			nameLengths.add(name.length());
		}
		System.out.println("5. List nameLengths contains: " + nameLengths + "\n");

		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */
		int nameSum = 0;
		for (int i = 0; i < nameLengths.size(); i++) {
			nameSum += nameLengths.get(i);
		}
		System.out.println("6. Sum of the length of each name in nameLengths is " + nameSum + "\n");

		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */

		// Create variable to store result.
		String result = repeatWord("Hello", 3);
		System.out.println("7. Hello concatenated 3 times is " + result + "\n"); // Output: HelloHelloHello

		/*
		 * 
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns
		 * a full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */
		
		// Crate first and last name variables.
		String firstName = "John";
		String lastName = "Doe";

		// Pass parameters first/lastname to method, createFullName.
		String fullName = createFullName(firstName, lastName);
		System.out.println("8. Concatenated Full Name is " + fullName + "\n"); // Output: Full Name: John Doe
		
		/*
		 * 9. Write a method that takes an array of int and returns true if the sum of
		 * all the ints in the array is greater than 100.
		 */
		
		// Create basic array of numbers and add elements to it.
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(40);
		
		// Call the method to evaluate true/false result.
		boolean resultOver100 = isSumGreaterThan100(integers);
		System.out.println("9. First sum of numbers is 100, so should return false.");
		System.out.println("9. Is the sum of numbers in integer list greater than 100? " + resultOver100); // Output: false

		integers.add(50);
		
		
		resultOver100 = isSumGreaterThan100(integers);
		System.out.println("9. Added 50 to list, now sum is 150 so should return true.");
		System.out.println("9. Is the sum of numbers in integer list greater than 100? " + resultOver100 + "\n"); // Output: true
		
		/* 10. Write a method that takes an array of double and 
		 * returns the average of all the elements in the array.
		 */
		
		// Create and populate the list.
		List<Double> calcNumbers = new ArrayList<>();
		calcNumbers.add(10.5);
		calcNumbers.add(20.0);
		calcNumbers.add(30.25);
		calcNumbers.add(40.75);

		// Call the method, calculateAverage, passing the numbers ArrayList.
		double average = calculateAverage(calcNumbers);

		// Print the average.
		System.out.println("10. Calculated average of numbers is " + average + "\n"); // Output: Average: 25.375
		
		/* 11. Write a method that takes two arrays of double and returns 
		 * true if the average of the elements in the first array is greater 
		 * than the average of the elements in the second array.
		 */
		
		// Create to lists of double.
		List<Double> list1 = new ArrayList<>();
		list1.add(10.5);
		list1.add(20.0);
		list1.add(30.25);

		List<Double> list2 = new ArrayList<>();
		list2.add(15.0);
		list2.add(25.5);
		list2.add(35.0);

		// Test the method resultDouble
		boolean resultDouble = isFirstListAverageGreater(list1, list2);

		// Print the result
		System.out.println("11. Is the average of the first list greater than the second? " + resultDouble); // Output: false
		
		// Add a value to list2 and test again.
		list1.add(70.00);

		// Test the method resultDouble with new list2 values.
		resultDouble = isFirstListAverageGreater(list1, list2);

		// Print the result
		System.out.println("11. Added a value to list1, calculate again.");
		System.out.println("11. Is the average of the first list greater than the second? " + resultDouble + "\n"); // Output: true
		
		/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
		 * and a double moneyInPocket, and returns true if it is hot outside and if
		 *  moneyInPocket is greater than 10.50.
		 */
		
		// Create variables
		boolean isHotOutside = true;
		double moneyInPocket = 15.00;

		// Test the method willBuyDrink
		boolean resultBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("12. Will buy drink? " + resultBuyDrink + "\n"); // Output: true
		
		/*
	     * 13. This method takes a list of strings and a specific string to find.
	     * It counts and returns the number of times the string appears in the list.
	     * 
	     * Why I created this method:
	     * In many scenarios, such as inventory or data analysis, you might need to count
	     * how often a specific item appears. This method provides a way to count occurrences
	     * of a given element in a list. I like Dr. Who and have a number of iconic items
	     * from the series. With this method, I can add items and know if I have too many 
	     * (or not enough) of a particular item.
	     */
		
		// Create the list of items 
		List<String> drWhoItems = new ArrayList<>();
		
		// Add items to list of strings.
		drWhoItems.add("Tardis");
		drWhoItems.add("Sonic Screwdriver");
		drWhoItems.add("Dalek");
		drWhoItems.add("Companion");
		drWhoItems.add("Psychic Paper");
		drWhoItems.add("Machine that goes Ding");
		drWhoItems.add("Sonic Sunglasses");
		drWhoItems.add("Scarf");
		drWhoItems.add("Tardis");
		drWhoItems.add("Machine that goes Ding");
				
		// Print the original list
        System.out.println("13. List of Doctor Who Items: " + drWhoItems);

        // Call the custom method to count occurrences
        String itemToCount = "Tardis";
        int count = countOccurrences(drWhoItems, itemToCount);
        
        // Print the result
        System.out.println("13. The item " + "'" + itemToCount + "'" + " appears " + count + " times.");
	}

	/*
	 * 1.b.iii. Show that using the index values for the elements is dynamic (works
	 * for arrays of different lengths).
	 */
	private static void calculateDiff(List<Integer> list) {
		System.out.println(
				"1.b.iii. Method calculateDiff Subtraction result is " + (list.get(list.size() - 1) - (list.get(0))));
	}

	/*
	 * 7. Write a method that takes a String, word, and an int, n, as arguments and
	 * returns the word concatenated to itself n number of times. (i.e. if I pass in
	 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */
	public static String repeatWord(String word, int n) {

		// Use StringBuilder for efficient string concatenation
		StringBuilder repeatedWord = new StringBuilder();

		// Loop to add word n times to repeatedWord.
		for (int i = 0; i < n; i++) {
			repeatedWord.append(word);
		}

		// Return the result.
		return repeatedWord.toString();
	}

	/*
	 * 
	 * 8. Write a method that takes two Strings, firstName and lastName, and returns
	 * a full name (the full name should be the first and the last name as a String
	 * separated by a space).
	 */
	private static String createFullName(String firstName, String lastName) {

		StringBuilder fullNameBuilder = new StringBuilder();
		fullNameBuilder.append(firstName).append(" ").append(lastName);

		// Convert StringBuilder to String and return
		return fullNameBuilder.toString();
	}
	
	/*
	 * 9. Write a method that takes an array of int and returns true if the sum of
	 * all the ints in the array is greater than 100.
	 */
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
	
	/* 10. Write a method that takes an array of double and 
	 * returns the average of all the elements in the array.
	 */
	public static double calculateAverage(List<Double> calcNumbers) {
		// Check to avoid division by zero
		if (calcNumbers.isEmpty()) {
			return 0.0;
		}

		// Initiate the variable, sum, to hold the return value.
		double sum = 0.0;

		// Calculate the sum of all elements in the ArrayList
		for (double num : calcNumbers) {
			sum += num;
		}

		// Calculate and return the average
		return sum / calcNumbers.size();
	}
	
	/* 11. Write a method that takes two arrays of double and returns 
	 * true if the average of the elements in the first array is greater 
	 * than the average of the elements in the second array.
	 */
	public static boolean isFirstListAverageGreater(List<Double> list1, List<Double> list2) {

		// Calculate the average of the first list
		double average1 = calculateAverage(list1);

		// Calculate the average of the second list
		double average2 = calculateAverage(list2);

		// Compare the averages
		return average1 > average2;
	}
	
	/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
	 * and a double moneyInPocket, and returns true if it is hot outside and if
	 *  moneyInPocket is greater than 10.50.
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	/*
     * 13. This method takes a list of strings and a specific string to find.
     * It counts and returns the number of times the string appears in the list.
     * 
     * Why I created this method:
     * In many scenarios, such as inventory or data analysis, you might need to count
     * how often a specific item appears. This method provides a way to count occurrences
     * of a given element in a list. I like Dr. Who and have a number of iconic items
     * from the series. With this method, I can add items and know if I have too many 
     * (or not enough) of a particular item.
     */
    public static int countOccurrences(List<String> list, String item) {
        int count = 0;

        // Loop through the list and count matches
        for (String listItem : list) {
            if (listItem.equals(item)) {
                count++;
            }
        }

        return count;
    }
}
