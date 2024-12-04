package Week4CodingProject;

/* 10. Write a method that takes an array of double and 
 * returns the average of all the elements in the array.
 */

import java.util.ArrayList;
import java.util.List;

public class Step10 {

    public static double calculateAverage(List<Double> numbers) {
        // Check to avoid division by zero
        if (numbers.isEmpty()) {
            return 0.0;
        }

        // Initiate the variable, sum, to hold the return value.
        double sum = 0.0;

        // Calculate the sum of all elements in the ArrayList
        for (double num : numbers) {
            sum += num;
        }

        // Calculate and return the average
        return sum / numbers.size();
    }
    
	public static void main(String[] args) {
        // Create and populate the list.
		List<Double> numbers = new ArrayList<>();
        numbers.add(10.5);
        numbers.add(20.0);
        numbers.add(30.25);
        numbers.add(40.75);

        // Call the method, calculateAverage, passing the numbers ArrayList.
        double average = calculateAverage(numbers);
        
        // Print the average.
        System.out.println("Average: " + average); // Output: Average: 25.375
    }
}
