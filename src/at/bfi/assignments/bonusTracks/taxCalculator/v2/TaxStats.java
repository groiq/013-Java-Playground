package at.bfi.assignments.bonusTracks.taxCalculator.v2;

import java.util.ArrayList;
import java.util.Arrays;

public class TaxStats {
	
	private int gross;
	private final int[] thresholds = {1500,2500,3500};
	private final int[] rates = {20,35,45,50};
	
	private TaxChunk[] taxChunks;
	int totalNet;
	int totalTax;
	
	/*
	 * for later: make rates-thresholds data editable, store in a decent format (hashmap?)
	 */

	
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
	 * @param rates
	 * @param thresholds
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
	
	// TODO long output variant
	public String verbose() {
		String verbose = "Gross: " + gross + ", tax: " + totalTax + ", net: " + totalNet + "\n";
		verbose += "Tax chunks:\n";
		for (TaxChunk taxChunk : taxChunks) {
			verbose += taxChunk.toString() + "\n";
		}
		return verbose;
	}

	
	
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
	
	
	private void calculateChunks() {
		
//		System.out.println("<method calculateChunks()>");
		
		int rest = gross;
		int pos = 0;
		int currGrossChunk = thresholds[0];
		
		totalNet = 0;
		totalTax = 0;
		
		ArrayList<TaxChunk> interimChunkList = new ArrayList<TaxChunk>();
		
		while (rest > currGrossChunk) {
			rest -= currGrossChunk;
			
//			System.out.print("currGrossChunk: " + currGrossChunk + ", rest: " + rest + ", pos: " + pos);
//			System.out.println(". Create new chunk with gross " + currGrossChunk + " and rate " + rates[pos]);
			TaxChunk newTaxChunk = new TaxChunk(currGrossChunk,rates[pos]);
			totalTax += newTaxChunk.getTax();
			interimChunkList.add(newTaxChunk);
			
			pos += 1;
			if (pos >= thresholds.length) break;
			currGrossChunk = thresholds[pos] - thresholds[pos-1];
			// for later: start thresholds with 0, that might make loops like this one more elegant
		}
		
//		System.out.print("currGrossChunk: " + currGrossChunk + ", rest: " + rest + ", pos: " + pos);
//		System.out.println(". Create final chunk with gross " + rest + " and rate " + rates[pos]);
		TaxChunk newTaxChunk = new TaxChunk(rest,rates[pos]);
		totalTax += newTaxChunk.getTax();
		interimChunkList.add(newTaxChunk);
		
		totalNet = gross - totalTax;
		
		taxChunks = interimChunkList.toArray(new TaxChunk[0]);
		
//		System.out.println("printing the contents of taxChunks in seperate lines...");
//		for (TaxChunk taxChunk : taxChunks) {
//			System.out.println(taxChunk);
//		}
		
//		System.out.println("</method calculateChunks()>");
		
	}

}
