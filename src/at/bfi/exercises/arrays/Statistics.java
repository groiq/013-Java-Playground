package at.bfi.exercises.arrays;

public class Statistics {
	
	private final double[] input;
	
	private final double minimum;
	private final double maximum;
	private final double sum;
	private final double average;
//	private final double standardDeviation;
//	private final double variance;

	public Statistics(double[] input) {
		super();
		this.input = input;
		
//		double minimum, maximum, sum = input[0];
		
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
		
		
		
		// calculate standard deviation
		
		// calculate variance

	}

	public double[] getInput() {
		return input;
	}

//	public double getMinimum() {
//		return minimum;
//	}
//
//	public double getMaximum() {
//		return maximum;
//	}
//
//	public double getAverage() {
//		return average;
//	}
//
//	public double getStandardDeviation() {
//		return standardDeviation;
//	}
//
//	public double getVariance() {
//		return variance;
//	}
	
	// TODO toString() - once all the fields are ready
	

}
