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
	
	/**
	 * Pads out a String of a given minimum length by repeating the same snippet.
	 * (Note that the resulting String won't be <space> chars long, but the next multiple of snippet.length().)
	 * @param snippet the string to 
	 * @param space
	 * @return
	 */
	public static String fillSpaceProper(String snippet, int space) {
		String paddedString = snippet;
		while(paddedString.length() < space) {
			paddedString += snippet;
		}
		return paddedString;
	}
	
	/**
	 * Pads out a String of a given minimum length by repeating the same snippet.
	 * (Note that the resulting String won't be <space> chars long, but the next multiple of snippet.length().)
	 * This is to test a loop where the counter is a String.
	 * @param snippet the string to 
	 * @param space
	 * @return
	 */
	public static String fillSpaceUsingFor(String snippet, int space) {
		String paddedString;
		for (paddedString = snippet; paddedString.length() < space; paddedString += snippet) {}
		return paddedString;
	}

	

	public static void main(String[] args) {

		int roundUpAmount;
		int roundUpThreshold;
		roundUpAmount = 18;
		roundUpThreshold = 5;
		
		System.out.println(roundUpProper(roundUpAmount, roundUpThreshold));
		System.out.println(roundUpUsingFor(roundUpAmount, roundUpThreshold));

		System.out.println(fillSpaceProper("bla", 8));
		System.out.println(fillSpaceUsingFor("bla", 8));
		

	}

}
