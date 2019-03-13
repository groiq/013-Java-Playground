/**
 * Approximates pi using the formula:
 * pi = 4x ( 1 - 1/3 + 1/5 - 1/7 + 1/9 ... )
 * 
 * Prints intermediate steps for demonstration.
 * 
 * Main method for testing included.
 */

package at.bfi.variousStuff.var;

public class CalculatePi {
	
	/**
	 * approximates pi using the given algorithm.
	 * @param denominator - 
	 * @return pi - double
	 */
	public static double calcPi(int denominator) {
		double pi = 0.0;
		for (int i = 1; i <= denominator; i += 2) {
			double value = 1 / (double)i;
			int factor = ((i/2)%2==0) ? 1 : -1 ;
			value *= factor;
			System.out.println("i is increased by " + factor + "*(1/" + i + "), that's " + value);
			pi += value;
			System.out.println("pi is now " + pi);
		}
		System.out.println("finally, multiply by four and return");
		pi *= 4;
		return pi;
	}
	
	/**
	 * variant of the above. This time, each number is multiplied by four before it is added.
	 * This makes the approximation comprehensible.
	 * @param denominator
	 * @return
	 */
	public static double approxPi(int denominator) {
		double pi = 0.0;
		for (int i = 1; i <= denominator; i +=2 ) {
			double value = 1 / (double)i;
			int factor = ((i/2)%2==0) ? 4 : -4 ;
			value *= factor;
			pi += value;
			System.out.println("pi is " + pi + " after processing i=" + i);
		}
		return pi;
	}

	public static void main(String[] args) {
		
		int denominator;
		denominator = 100;
		
		double pi;
//		pi = calcPi(denominator);
		pi = approxPi(denominator);
		
		System.out.println(pi);
		

	}

}
