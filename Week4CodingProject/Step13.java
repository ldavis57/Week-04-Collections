package Week4CodingProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step13 {

	public static void main(String[] args) {
		
		// Create the list of strings 
		List<String> drWhoItems = new ArrayList<>();
		
		// Add items to list of strings.
		drWhoItems.add("Tardis");
		drWhoItems.add("Sonic Screwdriver");
		drWhoItems.add("Dalek");
		drWhoItems.add("Companion");
		drWhoItems.add("Paradox");
		drWhoItems.add("Psychic Paper");
		drWhoItems.add("Paradox");
		drWhoItems.add("Machine that goes Ding");
		drWhoItems.add("Sonic Sunglasses");
		drWhoItems.add("Scarf");
		drWhoItems.add("Tardis");
				
		// Print the original list
        System.out.println("Doctor Who Items: " + drWhoItems);

        // Call the custom method to count occurrences
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter search item: ");
        String itemToCount = in.nextLine();
        int count = countOccurrences(drWhoItems, itemToCount);
        
        // Print the result
        System.out.println("The item " + "'" + itemToCount + "'" + " appears " + count + " times.");
     }

	/*
     * This method takes a list of strings and a specific string to find.
     * It counts and returns the number of times the string appears in the list.
     * 
     * Why I created this method:
     * In many scenarios, such as inventory or data analysis, you might need to count
     * how often a specific item appears. This method provides a way to count occurrences
     * of a given element in a list. I like Dr. Who and have a number of iconic items
     * from the series. With this method, I can add items and, as the list grows, 
     * find erroneous duplicates.
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
