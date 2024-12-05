package Week4CodingProject;

/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
 * and a double moneyInPocket, and returns true if it is hot outside and if
 *  moneyInPocket is greater than 10.50.
 */

public class Step12 {

	public static void main(String[] args) {

		// Test the method
		boolean isHotOutside = true;
		double moneyInPocket = 5.00;

		boolean result = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Will buy drink? " + result); // Output: true
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
}
