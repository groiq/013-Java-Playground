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
 * 
 * This class contains two implementation. In one, the thresholds and tax rates are stored in two fields.
 * That makes the entire thing more configurable, but since the assignment was about conditional statements, it misses the point.
 * So, the second implementation uses an if-else chain.
 * 
 * Contains a main method for testing.
 * 
 * Note that this is a simplified model of tax progression. In reality, a higher tax rate is not applied to the total amount,
 * but only to the amount above the threshold. I have implemented that model in the other versions of the tax calculator.
 */

package at.bfi.assignments.conditionals.taxCalculator.v2;

import java.util.Arrays;

public class TaxCalculator {
	
	
	private static int[] thresholds = {1500,2500,3500};
	private static int[] rates = {20,35,45,50};
	private static boolean useFields = true; // determines whether to use the fields or the if-else chain
	
	
	
	/**
	 * @return the thresholds
	 */
	public static int[] getThresholds() {
		return thresholds;
	}

	/**
	 * @param thresholds the thresholds to set
	 */
	public static void setThresholds(int[] thresholds) {
		TaxCalculator.thresholds = thresholds;
	}

	/**
	 * @return the rates
	 */
	public static int[] getRates() {
		return rates;
	}

	/**
	 * @param rates the rates to set
	 */
	public static void setRates(int[] rates) {
		TaxCalculator.rates = rates;
	}

	/**
	 * Takes a gross income value and calculates the progressive tax.
	 * @param gross - an int, the gross value
	 * @return an array of four integers containing, in that order, gross value, tax rate, tax, and net value
	 */
	public static int[] taxStats(int gross) {
//		System.out.println("Method taxStats: takes a gross value and calculates tax. Gross value is " + gross);
		int[] stats = new int[4];
		stats[0] = gross;
		int rate;
		if (useFields == true) {
			/*
			 * Calculate tax rate using fields for rates and thresholds.
			 * This supposedly makes the code more editable, but misses the actual assignment.
			 */
//			System.out.println("Calculating tax rate using fields.");
			int pos = 0;
			while(pos < thresholds.length && thresholds[pos] < gross) {
				pos += 1;
			}
//			System.out.println("gross: " + gross + ", pos: " + pos + ", threshold: " + 
//			( pos < thresholds.length ? thresholds[pos] : "(surpassed)" ) + ", rate: " + rates[pos]);
			rate = rates[pos];
		} else {
			/*
			 * Calculate tax rate using an if-else chain.
			 * This requires the thresholds to be hard-coded, but fits what the assignment acutally asked for.
			 */
//			System.out.println("Calculating tax rate using an if-else chain.");
			if (gross <= 1500) {
				rate = 20;
			} else if (gross <= 2500) {
				rate = 35;
			} else if (gross <= 3500) {
				rate = 45;
			} else {
				rate = 50;
			}
//			System.out.println("gross: " + gross + ", rate: " + rate);
		}
		stats[1] = rate;
		stats[2] = (gross * rate) / 100;
		stats[3] = gross - stats[2];
//		System.out.println("return value: " + Arrays.toString(stats));
//		System.out.println("/taxStats");
		return stats;
	}
	
	/**
	 * Prints the array generated by taxStats() in an explaining format.
	 * @param stats an array of four integers, containing, in that order, gross value, tax rate, tax, and net value.
	 * @return a string, containing the four numbers with labels.
	 */
	public static String statsAsString(int[] stats) {
//		System.out.println("generating formatted string from array...");
		if (stats.length != 4) {
			return "Malformed array: required length: 4 elements. Actual length: " + stats.length + " elements.";
			
		}
		return "gross: " + stats[0] + ", tax rate: " + stats[1] + ", tax: " + stats[2] + ", net: " + stats[3] + ".";
	}
	/**
	 * Generates tax stats from a gross value and formats them for printing.
	 * @param gross an integer, the gross value
	 * @return a string, the explained tax stats
	 */
	public static String statsAsString(int gross) {
//		System.out.println("generating formatted string from gross value...");
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
			System.out.println("Testing the tax stats function with value " + i + ", useFields is " + useFields + ".");
			System.out.println(statsAsString(i));
			System.out.println();
		}
		System.out.println("-----------");
		System.out.println();
	}

}
