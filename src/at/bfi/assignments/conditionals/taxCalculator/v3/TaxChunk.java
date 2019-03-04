package at.bfi.assignments.conditionals.taxCalculator.v3;

public class TaxChunk {
	
	private final int gross;
	private final int rate;
	private final int tax;
	private final int net;
	/**
	 * @return the gross
	 */
	public int getGross() {
		return gross;
	}
	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}
	/**
	 * @return the tax
	 */
	public int getTax() {
		return tax;
	}
	/**
	 * @return the net
	 */
	public int getNet() {
		return net;
	}
	
	/**
	 * @param gross
	 * @param rate
	 */
	public TaxChunk(int gross, int rate) {
//		System.out.println("Creating tax chunk...");
		this.gross = gross;
		this.rate = rate;
		this.tax = (this.gross * this.rate) / 100;
		this.net = this.gross - this.tax;
//		System.out.println("created tax chunk: " + this.toString());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TaxChunk [gross=" + gross + ", rate=" + rate + ", tax=" + tax + ", net=" + net + "]";
	}
	
	

}