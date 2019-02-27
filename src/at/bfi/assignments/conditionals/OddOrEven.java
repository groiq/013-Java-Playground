package at.bfi.assignments.conditionals;

public class OddOrEven {
	
	/**
	 * Checks whether a number is odd or even.
	 * @param num - an int
	 * @return - a boolean. true if num is odd, false if num is even.
	 */
	public static boolean isOdd(int num) {
		boolean result;
		if (num % 2 != 0) {
			result = true;
			System.out.println(num + " % 2 != 0, so this number must be odd");
		} else {
			result = false;
			System.out.println(num + " % 2 == 0, so this number must be even");
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(isOdd(2));
		System.out.println(isOdd(3));
		

	}

}
