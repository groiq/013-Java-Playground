package at.bfi.assignments.conditionals.taxCalculator.v4;

public class TaxCalculator {
	
	private int[] rates = {20,35,45,50};
	private int[] thresholds = {0,1500,2500,3500};
	
	public static int[] asArray(int i) {
		return calculateTaxes(i);
	}

	public static String asString(int gross) {
		return asString(calculateTaxes(gross));
	}
	
	public static String asString(int[] stats) {
		String theString;
		if (stats.length == 3) {
			theString = "gross: " + stats[0] + ", tax: " + stats[1] + ", net: " + stats[2];
		} else {
			theString = "Error: malformed array (needs to be of length three).";
		}
		return theString;
	}
	
	private static int[] calculateTaxes(int gross) {
		
		int[] stats = new int[3];
		stats[0] = gross;
		
		int remainingGross = gross; // could use gross itself, but I'll use a better name
		
		return stats;
	}

}
