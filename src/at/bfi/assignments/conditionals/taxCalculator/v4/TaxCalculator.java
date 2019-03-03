package at.bfi.assignments.conditionals.taxCalculator.v4;

public class TaxCalculator {
	
	private int[] rates = {20,35,45,50};
	private int[] thresholds = {0,1500,2500,3500};
	
	public static int[] asArray(int i) {
		return calculateTaxes(i);
	}

	public static String asString(int i) {
		return asString(calculateTaxes(i));
	}
	
	public static String asString(int[] i) {
		String answer;
		if (i.length == 3) {
			answer = "gross: " + i[0] + ", tax: " + i[1] + ", net: " + i[2];
		} else {
			answer = "Error: malformed array (needs to be of length three).";
		}
		return answer;
	}
	
	private static int[] calculateTaxes(int i) {
		
		int[] stats = new int[3];
		
		return stats;
	}

}
