package at.bfi.exercises.arrays;

public class StatisticsInMethods {

	public static void main(String[] args) {
		
		double[] minMax;
		minMax = new double[] {3.0,4.0,1.0,2.0};
		System.out.println("minimum: " + minimum(minMax));
		System.out.println("maximum: " + maximum(minMax));
		
		double[] avg;
		avg = new double[] {2.0,4.0};
		System.out.println(avg);
		System.out.println("sum: " + sum(avg));
		System.out.println("average: " + average(avg));
		
		double[] noVarianceData = {2.0,2.0,2.0,2.0};
		double[] lowVarianceData = {2.0,2.0,6.0,6.0};
		double[] higherVarianceData = {4.0,4.0,12.0,12.0};
		

	}

	private static double minimum(double[] input) {
		double result = input[0];
		for (double d : input) {
			if (d < result) {
				result = d;
			}
		}
		return result;
	}
	
	private static double maximum(double[] input) {
		double result = input[0];
		for (double d : input) {
			if (d > result) {
				result = d;
			}
		}
		return result;
	}
	
	private static double sum(double[] input) {
		double result = 0;
		for (double d : input) {
			result += d;
		}
		return result;
	}
	
	private static double average(double[] input) {
		return (sum(input) / input.length);
	}
	
	private static double variance(double[] input) {
		double varianceCounter = 0;
		double average = average(input);
		for (double d : input) {
			double i = d - average;
			i = i*i;
			varianceCounter += i;
			
		}
		double variance = varianceCounter / input.length;
		
		return variance;
		
	}
	
	private static double standardDeviation(double[] input) {
		return Math.sqrt(variance(input));
	}
	
}
