package at.bfi.assignments.bonusTracks.taxCalculator;

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
	 * for later: make rates-thresholds data editable, store in a decent format
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
		System.out.println("<Constructor: TaxStats(gross), gross: " + gross + ">");
		this.gross = gross;
		calculateChunks();
		System.out.println("</Constructor: TaxStats()>");
	}


	private void calculateChunks() {
		
		System.out.println("<method calculateChunks()>");
		
		int rest = gross;
		int pos = 0;
		int currGrossChunk = thresholds[0];
		
		totalNet = 0;
		totalTax = 0;
		
		ArrayList<TaxChunk> interimChunkList = new ArrayList<TaxChunk>();
		
		while (rest > currGrossChunk) {
			rest -= currGrossChunk;
			
			System.out.println("currGrossChunk: " + currGrossChunk + ", rest: " + rest + ", pos: " + pos);
			
//			TaxChunk newTaXChunk = new TaxChunk(currGrossChunk,rates[pos]);
//			interimChunkList.add(newTaXChunk);
			
			pos += 1;
			if (pos >= thresholds.length) break;
			currGrossChunk = thresholds[pos] - thresholds[pos-1];
			// for later: start thresholds with 0, that might make loops like this one more elegant
		}
		
		System.out.println("currGrossChunk: " + currGrossChunk + ", rest: " + rest + ", pos: " + pos);
		
		taxChunks = interimChunkList.toArray(new TaxChunk[0]);
		
		System.out.println("</method calculateChunks()>");
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TaxStats [gross=" + gross + ", rates=" + Arrays.toString(rates) + ", thresholds="
				+ Arrays.toString(thresholds) + ", taxChunks=" + Arrays.toString(taxChunks) + ", totalNet=" + totalNet
				+ ", totalTax=" + totalTax + "]";
	}
	
	
}
