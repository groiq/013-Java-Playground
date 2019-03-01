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

package at.bfi.assignments.conditionals;

public class TaxCalculator {
	
	private static int[] thresholds = {1500,2500,3500};
	private static int[] rates = {20,35,45,50};
	private static boolean useFields = true;
	
	/**
	 * Takes a gross income value and calculates the progressive tax.
	 * @param gross - an int, the gross value
	 * @return an array of four integers containing, in that order, gross value, tax rate, tax, and net value
	 */
	public static int[] taxStats(int gross) {
		int[] stats = new int[4];
		stats[0] = gross;
		int rate;
		if (useFields == true) {
			int pos = 0;
			while(pos < thresholds.length && thresholds[pos] < gross) {
				pos += 1;
			}
//			System.out.println("gross: " + gross + ", pos: " + pos + ", threshold: " + 
//			( pos < thresholds.length ? thresholds[pos] : "(surpassed)" ) + ", rate: " + rates[pos]);
			rate = rates[pos];
		} else {
			if (gross <= 1500) {
				rate = 20;
			} else if (gross <= 2500) {
				rate = 35;
			} else if (gross <= 3500) {
				rate = 45;
			} else {
				rate = 50;
			}
		}
		stats[1] = rate;
		stats[2] = (gross * rate) / 100;
		stats[3] = gross - stats[2];
		return stats;
	}

	// no wait, that way I won't get to the if-else part! Gotta do it some other way.
	// So, implement two functions: a short one and a proper one.
	
	// another method that toStrings() that thing
	public static String statsAsString(int[] stats) {
		return "gross: " + stats[0] + ", tax rate: " + stats[1] + ", tax: " + stats[2] + ", net: " + stats[3] + ".";
	}
	public static String statsAsString(int gross) {
		return statsAsString(taxStats(gross));
	}
	

	public static void main(String[] args) {
		
		testWithVariousValues(true);
		testWithVariousValues(false);
		
	}

	private static void testWithVariousValues(boolean fieldsToggler) {
		// test getTax method with representative values
		useFields = fieldsToggler;
		for (int i = 1000; i < 5000; i += 1000) {
//			System.out.println(i);
			System.out.println(statsAsString(i));
		}
		System.out.println();
	}

}
