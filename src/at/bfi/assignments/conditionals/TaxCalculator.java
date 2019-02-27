package at.bfi.assignments.conditionals;

/**
 * assignment:
 * 
 * Implement an income tax calculator. You should print the correct tax rate and
 * the resulting net income. the following progressive tax rates apply (numbers
 * are gross income): 
 * 0 - 1500 EUR -> 20% 
 * 1501 - 2500 EUR -> 35% 
 * 2501 - 3500 EUR -> 45% 
 * 3501 and above -> 50%
 */


public class TaxCalculator {
	
	static int[] thresholds = {1500,2500,3500};
	static int[] rates = {20,35,45,50};
	
	// method that calculates tax and returns an int[] containing gross, tax rate, tax and net
	
	// another method that toStrings() that thing
	
	// alternative: just make a void method that prints everything

	public static void main(String[] args) {
		
		// test getTax method with representative values

	}

}
