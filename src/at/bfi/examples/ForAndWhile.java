package at.bfi.examples;

public class ForAndWhile {
	
	/**
	 * an example for a while loop
	 * @param start
	 * @param divisor
	 * @return
	 */
	public static int searchForDividible (int start, int divisor) {
		while (start % divisor != 0) {
			start++;
		}
		return start;
	}
	
	// Sell this example as a rounding up one
	
	// other example: three numbers divisible by four

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
