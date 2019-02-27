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
	
	private static int[] thresholds = {1500,2500,3500};
	private static int[] rates = {20,35,45,50};
	
	// method that calculates tax and returns an int[] containing gross, tax rate, tax and net
	public static int[] taxStats(int gross) {
		int[] stats = new int[4];
		stats[0] = gross;
		
		return stats;
	}

	
	
	// another method that toStrings() that thing
	public static String statsAsString(int[] stats) {
		return "gross: " + stats[0] + ", tax rate: " + stats[1] + ", tax: " + stats[2] + ", net: " + stats[3] + ".";
	}
	public static String statsAsString(int gross) {
		return statsAsString(taxStats(gross));
	}
	

	public static void main(String[] args) {
		
		// test getTax method with representative values
		for (int i = 1000; i < 5000; i += 1000) {
//			System.out.println(i);
			System.out.println(statsAsString(i));
		}
		

	}

}
