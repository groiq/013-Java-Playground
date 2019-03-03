package at.bfi.assignments.conditionals.taxCalculator.v4;

import java.util.Arrays;

public class TaxCalculator {
	
	private static int[] rates = {20,35,45,50};
	private static int[] thresholds = {0,1500,2500,3500};
	
	public static int[] asArray(int i) {
//		System.out.println("one-liner: asArray(" + i + ")");
		return calculateTaxes(i);
	}

	public static String asString(int gross) {
//		System.out.println("one-liner: calculateTaxes(" + gross + ")");
		return asString(calculateTaxes(gross));
	}
	
	public static String asString(int[] stats) {
//		System.out.println("asString(int[])");
		String theString;
		if (stats.length == 3) {
			theString = "gross: " + stats[0] + ", tax: " + stats[1] + ", net: " + stats[2];
		} else {
			theString = "Error: malformed array (needs to be of length three).";
		}
//		System.out.println("returning: " + theString);
//		System.out.println("/asSTring(int[])");
		return theString;
	}
	
	private static int[] calculateTaxes(int gross) {
		
//		System.out.println("calculateTaxes(" + gross + ")");
		
		int[] stats = new int[3];
		stats[0] = gross;
		
		int totalTax = 0;
		int totalNet = 0;
		
		int remainingGross = gross; // could even use gross itself, but I'll use a better name
		
		int curGrossChunk;
		int i;
		for (i = 0; i < thresholds.length; i++) {
			System.out.println("remaining gross: " + remainingGross + ", cur threshold: " + thresholds[i] + 
					", next threshold: " + thresholds[i+1]);
			if (i < thresholds.length - 1) {
				curGrossChunk = thresholds[i+1] - thresholds[i];
				
			}
					
		}
		
		
		
		
		totalNet = gross - totalTax;
		stats[1] = totalTax;
		stats[2] = totalNet;
		
//		System.out.println("returning: " + Arrays.toString(stats));
//		System.out.println("/calculateTaxes(int)");
		return stats;
	}

}
