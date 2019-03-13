/**
 * Constructs an object providing various statistical information out of an array of doubles.
 * All the statistical data are calculated in the constructor.
 */
package at.bfi.assignments.arrays;

import java.util.Arrays;

public class Statistics {
	
	private final double[] input;
	
	private final double minimum;
	private final double maximum;
	private final double sum;
	private final double average;
	private final double standardDeviation;
	private final double variance;

	public Statistics(double[] input) {
		super();
		this.input = input;
		
		double minimum = input[0];
		double maximum = input[0];
		double sum = 0;
		
		for (double d : input) {
			if (d < minimum) minimum = d;
			if (d > maximum) maximum = d;
			sum += d;
		}
		this.minimum = minimum;
		this.maximum = maximum;
		this.sum = sum;
		this.average = sum / input.length;
		
		double varianceCounter = 0;
		
		for (double d : input) {
			double i = d - this.average;
			i = i*i;
			varianceCounter += i;
			
		}
		this.variance = varianceCounter / input.length;
		
		this.standardDeviation = Math.sqrt(this.variance);

	}

	/**
	 * @return the input
	 */
	public double[] getInput() {
		return input;
	}

	/**
	 * @return the minimum
	 */
	public double getMinimum() {
		return minimum;
	}

	/**
	 * @return the maximum
	 */
	public double getMaximum() {
		return maximum;
	}

	/**
	 * @return the sum
	 */
	public double getSum() {
		return sum;
	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * @return the standardDeviation
	 */
	public double getStandardDeviation() {
		return standardDeviation;
	}




	/**
	 * @return the variance
	 */
	public double getVariance() {
		return variance;
	}




	@Override
	public String toString() {
		return "Statistics [input=" + Arrays.toString(input) + ", minimum=" + minimum + ", maximum=" + maximum
				+ ", sum=" + sum + ", average=" + average + ", standardDeviation=" + standardDeviation + ", variance="
				+ variance + "]";
	}
	
	
	
	// TODO toString() - once all the fields are ready
	

}
