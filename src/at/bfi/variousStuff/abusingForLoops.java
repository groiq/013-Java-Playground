/**
 * a class for testing the limits of for loops.
 */
package at.bfi.variousStuff;

public class abusingForLoops {
	
	/**
	 * rounds up a number to a multiple of another one.
	 * @param amount the number to be rounded up
	 * @param roundTo the number to whose multiple amount is to be rounded
	 * @return the rounded number
	 */
	public static int roundUpProper(int amount, int roundTo) {
		while (amount % roundTo != 0) {
			amount++;
		}
		return amount;
	}
	
	/**
	 * rounds up a number to a multiple of another one using an empty for loop.
	 * @param amount the number to be rounded up
	 * @param roundTo the number to whose multiple amount is to be rounded
	 * @return the rounded number
	 */
	public static int roundUpUsingFor(int amount, int roundTo) {
		for (amount = amount; amount % roundTo != 0; amount++) {}
		return amount;
	}

	public static void main(String[] args) {

		int roundUpAmount;
		int roundUpThreshold;
		roundUpAmount = 18;
		roundUpThreshold = 5;
		
		System.out.println(roundUpProper(roundUpAmount, roundUpThreshold));
		System.out.println(roundUpUsingFor(roundUpAmount, roundUpThreshold));

		

	}

}
