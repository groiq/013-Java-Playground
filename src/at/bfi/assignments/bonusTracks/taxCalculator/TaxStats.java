package at.bfi.assignments.bonusTracks.taxCalculator;

public class TaxStats {
	
	private int gross;
	private int[] rates;
	private int[] thresholds;
	
	/*
	 * for later: create a handy input format for rates/thresholds (Hashmap?)
	 */

	private TaxChunk[] taxChunks;

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
	}

	/**
	 * @return the rates
	 */
	public int[] getRates() {
		return rates;
	}

	/**
	 * @param rates the rates to set
	 */
	public void setRates(int[] rates) {
		this.rates = rates;
	}

	/**
	 * @return the thresholds
	 */
	public int[] getThresholds() {
		return thresholds;
	}

	/**
	 * @param thresholds the thresholds to set
	 */
	public void setThresholds(int[] thresholds) {
		this.thresholds = thresholds;
	}

	/**
	 * @return the taxChunks
	 */
	public TaxChunk[] getTaxChunks() {
		return taxChunks;
	}
	

	/**
	 * @param gross
	 * @param rates
	 * @param thresholds
	 */
	public TaxStats(int gross, int[] rates, int[] thresholds) {
		this.gross = gross;
		this.rates = rates;
		this.thresholds = thresholds;
		calculatePackets();
	}


	private void calculatePackets() {
		
	}
	
	
}
