package Week4CodingProject;

/*
 * 7. Write a method that takes a String, word, and an int, n, as arguments and
 * returns the word concatenated to itself n number of times. (i.e. if I pass in
 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
 */

public class Step07 {

	public static void main(String[] args) {

		// Create variable to store result.
		String result = repeatWord("Hello", 3);
		System.out.println(result); // Output: HelloHelloHello
	}

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
}
