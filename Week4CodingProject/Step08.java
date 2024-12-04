package Week4CodingProject;
/*
 * 
 * 8. Write a method that takes two Strings, firstName and lastName, and returns
 * a full name (the full name should be the first and the last name as a String
 * separated by a space).
 */

public class Step08 {

	public static void main(String[] args) {

		// Crate first and last name variables.
		String firstName = "John";
		String lastName = "Doe";

		// Pass parameters first/lastname to method, createFullName.
		String fullName = createFullName(firstName, lastName);
		System.out.println("Full Name: " + fullName); // Output: Full Name: John Doe
	}
	
	private static String createFullName(String firstName, String lastName) {

		StringBuilder fullNameBuilder = new StringBuilder();
		fullNameBuilder.append(firstName).append(" ").append(lastName);

		// Convert StringBuilder to String and return
		return fullNameBuilder.toString();
	}
}
