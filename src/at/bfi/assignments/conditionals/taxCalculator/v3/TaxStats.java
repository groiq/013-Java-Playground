/**
 * Calculates taxes for a given gross value and stores them in an object.
 * Creates a helper object for each tax bracket (a "tax chunk").
 * Provides methods to retrieve tax information.
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
 * Debug output has been left in as comments.
 */


package at.bfi.assignments.conditionals.taxCalculator.v3;

import java.util.ArrayList;
import java.util.Arrays;

public class TaxStats {
	
	/*
	 * for later: implement overall tax rate like I did in v4.
	 */
	
	private int gross;
	private final int[] thresholds = {1500,2500,3500};
	private final int[] rates = {20,35,45,50};
	/*
	 * for later: think of a better way to represent the rates and thresholds in some kind of interconnected manner (hashmap?).
	 * For now I've set the two fields to final.
	 */
	
	private TaxChunk[] taxChunks;
	private int totalNet;
	private int totalTax;

	
	/**
	 * @return the rates
	 */
	public int[] getRates() {
		return rates;
	}


	/**
	 * @return the thresholds
	 */
	public int[] getThresholds() {
		return thresholds;
	}
	
	/**
	 * @return the tax rates and thresholds in a halfway decent formatting as a multi-line string.
	 */
	public String getRatesOverview() {
		String overview = "";
		int curThreshold = 0;
		for (int i = 0; i < rates.length; i++) {
			overview += curThreshold + " - ";
			if (i < thresholds.length) {
				curThreshold = thresholds[i];
				overview += curThreshold;
			} else {
				overview += "(any)";
			}
			curThreshold += 1;
			overview += ": " + rates[i];
			overview += " %\n";
		}
		return overview;
	}
	/*
	 * for later: get rid of the last line break etc.
	 * Again, this will be more elegant if I set rates[0] to 0.
	 */

	/**
	 * @return the gross
	 */
	public int getGross() {
		return gross;
	}

	/**
	 * sets a new gross value and recalculates taxes.
	 * @param gross the gross to set
	 */
	public void setGross(int gross) {
		this.gross = gross;
		calculateChunks();
	}

	/**
	 * @return the taxChunks
	 */
	public TaxChunk[] getTaxChunks() {
		return taxChunks;
	}

	/**
	 * @return the totalNet
	 */
	public int getTotalNet() {
		return totalNet;
	}

	/**
	 * @return the totalTax
	 */
	public int getTotalTax() {
		return totalTax;
	}

	/**
	 * @param gross
	 */
	public TaxStats(int gross) {
//		System.out.println("<Constructor: TaxStats(gross), gross: " + gross + ">");
		this.gross = gross;
		calculateChunks();
//		System.out.println("</Constructor: TaxStats()>");
	}

	@Override
	public String toString() {
		return "TaxStats [gross=" + gross + ", totalNet=" + totalNet + ", totalTax=" + totalTax + "]";
	}
	
	/**
	 * Provides detailed information.
	 * @return everything you never wanted to know about your taxes in a multi-line string.
	 */
	public String verbose() {
		String verbose = "Gross: " + gross + ", tax: " + totalTax + ", net: " + totalNet + "\n";
		verbose += "Tax chunks:\n";
		for (TaxChunk taxChunk : taxChunks) {
			verbose += taxChunk.toString() + "\n";
		}
		return verbose;
	}

	
	/**
	 * Prints the content of all three output methods to console.
	 */
	public void printAllOutputs() {
		System.out.println("printing all output methods...");
		System.out.println();
		System.out.println("tax rates:");
		System.out.println(this.getRatesOverview());
		System.out.println("basic toString(): ");
		System.out.println(this.toString());
		System.out.println();
		System.out.println("verbose information:");
		System.out.println(this.verbose());
		
	}
	
	/*
	 * Calculate tax data based on a gross value. Used by setGross() and the constructor.
	 */
	private void calculateChunks() {
		
//		System.out.println("<method calculateChunks()>");
		
		int rest = gross; // track chunks of money that haven't been taxed yet
		int pos = 0; // track position in thresholds list and rates list
		int currGrossChunk = thresholds[0]; // track the chunk to be taxed at the current rate. Starts with a chunk from 0 to the first threshold.
		
		totalTax = 0; // track the tax calculated so far
		
		// track a growing list of tax chunks
		ArrayList<TaxChunk> interimChunkList = new ArrayList<TaxChunk>();
		// for later: possible alternative: track tax chunks in an array the size of the rates list.
		// when writing to field, copy over all non-null entries.
		
		/*
		 * repeat calculating chunks until the money left doesn't reach the next threshold.
		 * If the rest is equal to the next chunk, the loop will be finished.
		 */
		while (rest > currGrossChunk) {
			rest -= currGrossChunk; // take the current chunk from the untaxed amount
			
//			System.out.print("currGrossChunk: " + currGrossChunk + ", rest: " + rest + ", pos: " + pos);
//			System.out.println(". Create new chunk with gross " + currGrossChunk + " and rate " + rates[pos]);
			/*
			 * Calculate tax for current chunk using current tax rate. Store data in the list of tax chunks.
			 * Increase total tax.
			 */
			TaxChunk newTaxChunk = new TaxChunk(currGrossChunk,rates[pos]);
			totalTax += newTaxChunk.getTax();
			interimChunkList.add(newTaxChunk);
			
			/*
			 * move forward in thresholds list. If end of list reached, break out of loop.
			 * Otherwise, calculate next gross chunk.
			 */
			pos += 1;
			if (pos >= thresholds.length) break;
			currGrossChunk = thresholds[pos] - thresholds[pos-1];
			// for later: start thresholds with 0, that might make loops like this one more elegant
		}
		
//		System.out.print("currGrossChunk: " + currGrossChunk + ", rest: " + rest + ", pos: " + pos);
		
		/*
		 * Create final chunk with the rest. This rest must be smaller or equal to the last calculated chunk.
		 */
//		System.out.println(". Create final chunk with gross " + rest + " and rate " + rates[pos]);
		TaxChunk newTaxChunk = new TaxChunk(rest,rates[pos]);
		totalTax += newTaxChunk.getTax();
		interimChunkList.add(newTaxChunk);
		
		/*
		 * Calculate total net value. Write total net and chunk list to fields.
		 */
		totalNet = gross - totalTax;
		taxChunks = interimChunkList.toArray(new TaxChunk[0]);
		
//		System.out.println("printing the contents of taxChunks in seperate lines...");
//		for (TaxChunk taxChunk : taxChunks) {
//			System.out.println(taxChunk);
//		}
		
//		System.out.println("</method calculateChunks()>");
		
	}

}
