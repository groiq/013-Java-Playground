/**
 * Implements a tax calculator.
 * 
 * Provides a method that takes a gross value and calculates tax and net value.
 * 
 * The following progressive tax rates are hard-coded:
 * 0 - 1500 EUR -> 20% 
 * 1501 - 2500 EUR -> 35% 
 * 2501 - 3500 EUR -> 45% 
 * 3501 and above -> 50%
 * 
 * The calculator uses marginal tax rate or whatever it's called.
 * The principle is as follows:
 * If gross value is 4000 Eur, then taxes are
 * the first 1500 Eur are taxed with 20%,
 * the next 1000 Eur (1501-2500) are taxed with 35%,
 * the next 1000 Eur (2501-3500) are taxed with 45%,
 * and the rest (3501-4000) with 50%.
 * 
 * Provides an array of four integers containing, in that order, the gross value, tax, net value and overall tax rate.
 * 
 * Also provides methods to render the data into formatted strings.
 * 
 * Compared to v3, this version is simplified. Works with static methods rather than objects.
 * 
 * Debug output has been left in as comments.
 */

/*
 * Adding overall tax rate was a last-minute change. There might probably be some errors in the code, 
 * such as comments talking about a three-element array or something.
 * 
 * Apart from using static methods, some internals have been refined.
 * The thresholds field corresponds to the rates field more closely.
 * Also, the loop in the actual calculation method is structured differently.
 */

package at.bfi.assignments.conditionals.taxCalculator.v4;

import java.util.Arrays;

public class TaxCalculator {
	
	private static final int[] rates = {20,35,45,50};
	private static final int[] thresholds = {0,1500,2500,3500};
	
	/**
	 * for later: think of a better way to represent the rates and thresholds in some kind of interconnected manner (hashmap?).
	 * For now I've set the two fields to final and left out the getters and setters.
	 */
	
	/**
	 * Takes a gross value and calculates taxes. Returns an array.
	 * @param gross an int, the gross value
	 * @return an array of four integers, containing, in that order, the gross value, tax, net value and overall tax rate
	 */
	public static int[] asArray(int gross) {
//		System.out.println("one-liner: asArray(" + i + ")");
		return calculateTaxes(gross);
	}

	/**
	 * Takes a gross value and calculates taxes. Returns a string.
	 * @param gross an int, the gross value
	 * @return a String, containing the gross value, tax, net value and overall tax rate with labels.
	 */
	public static String asString(int gross) {
//		System.out.println("one-liner: calculateTaxes(" + gross + ")");
		return asString(calculateTaxes(gross));
	}
	
	/**
	 * Formats the array generated by asArray() as a string.
	 * Throws IllegalArgumentException if the array doesn't have exactly four elements.
	 * @param stats an array of four integers, containing, in that order, the gross value, tax, net value and overall tax rate
	 * @return a String, containing the gross value, tax, net value and overall rate with labels.
	 */
	public static String asString(int[] stats) {
//		System.out.println("asString(int[])");
		String theString;
		if (stats.length == 4) {
			theString = "gross: " + stats[0] + ", tax: " + stats[1] + ", net: " + stats[2] + ", overall tax rate: " + stats[3] + "%";
		} else {
			throw new IllegalArgumentException("int[] stats must be four elements long (gross value, tax, net value and overall tax rate).");
		}
//		System.out.println("returning: " + theString);
//		System.out.println("/asSTring(int[])");
		return theString;
	}
	
	
	private static int[] calculateTaxes(int gross) {
		
		/*
		 * The method that does all the calculations.
		 * It loops through the various tax brackets and calculates taxes on corresponding chunks of the gross value.
		 */
		
//		System.out.println("calculateTaxes(" + gross + ")");
		
		/*
		 * Set up the return int[].
		 * The first position is gross, that can be filled out immediately.
		 */
		int[] stats = new int[4];
		stats[0] = gross;
		
		/*
		 * while looping through tax brackets, we need to track how much tax we have so far
		 * and how much of the gross value hasn't been taxed yet
		 */
		int totalTax = 0;
		int remainingGross = gross;
		
		/*
		 * loop through the arrays for rates and thresholds. The counter variable i will be the index of both the current rate
		 * and the threshold we last passed.
		 */
		for (int i = 0; i < thresholds.length; i++) {
			
			/*
			 * First, calculate the chunk of money for the current tax bracket.
			 */
			
			int currChunk;

			if (i < thresholds.length - 1) {
				/*
				 * We're not on the last entry in the thresholds list yet, which means that the current tax bracket
				 * applies between the current and the next threshold.
				 */
				currChunk = thresholds[i+1] - thresholds[i];
				if (currChunk > remainingGross) {
					/*
					 * The current chunk exceeds the remaining gross value, so we can tax that money and finish.
					 */
					currChunk = remainingGross;
				}
			} else {
				/*
				 * We've reached the end of the threshold list, so the remaining money will be taxed at the current rate.
				 */
				currChunk = remainingGross;
			}
			
			/*
			 * Now that we have determined the current chunk, we can tax it with the appropriate rate.
			 * The current chunk of tax is determined from the current gross chunk and the current rate
			 * and added to the total tax.			
			 */
			int currTax = (currChunk * rates[i]) / 100;
//			System.out.println("current threshold: " + thresholds[i] + ", current rate: " + rates[i] + 
//					", current gross chunk: " + currChunk + ", tax on that: " + currTax);
			totalTax += currTax;
			
			/*
			 * Gross value is reduced by the current chunk. If there is no money left, break out of the loop.
			 */
			remainingGross -= currChunk;
			if (remainingGross <= 0) {
				break;
			}
			
		}
		
		/*
		 * Total tax is written to stats[1]. 
		 * Net amount (stats[2]) is the difference of gross value and tax.
		 * Tax rate in percent (stats[3]) is calculated from gross value and total tax.
		 * gross * rate / 100 = tax -> rate * gross = 100 * tax -> rate = 100 * tax / gross
		 */
		stats[1] = totalTax;
		int totalNet = gross - totalTax;
		stats[2] = totalNet;
		int taxRate = (totalTax * 100) / gross; 
		stats[3] = taxRate;
		
//		System.out.println("returning: " + Arrays.toString(stats));
//		System.out.println("/calculateTaxes(int)");
		return stats;
	}

}
