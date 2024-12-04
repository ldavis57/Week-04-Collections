package Week4CodingProject;

import java.util.ArrayList;

/* Write a method that takes two arrays of double and returns 
 * true if the average of the elements in the first array is greater 
 * than the average of the elements in the second array.
 */

import java.util.List;

public class Step11 {

	public static void main(String[] args) {
		// Test ArrayLists
        List<Double> list1 = new ArrayList<>();
        list1.add(10.5);
        list1.add(20.0);
        list1.add(30.25);

        List<Double> list2 = new ArrayList<>();
        list2.add(15.0);
        list2.add(25.5);
        list2.add(35.0);

        // Test the method
        boolean result = isFirstListAverageGreater(list1, list2);
        
        // Print the result
        System.out.println("Is the average of the first list greater? " + result); 
    }

    public static boolean isFirstListAverageGreater(List<Double> list1, List<Double> list2) {

    	// Calculate the average of the first list
        double average1 = calculateAverage(list1);

        // Calculate the average of the second list
        double average2 = calculateAverage(list2);

        // Compare the averages
        return average1 > average2;
    }

     private static double calculateAverage(List<Double> list) {
        
    	 // Handle empty list to avoid dividing by zero
    	 if (list.isEmpty()) {
            return 0.0; 
        }

    	 // Loop through list array.
        double sum = 0.0;
        for (double num : list) {
            sum += num;
        }

        return sum / list.size();
	}
}
