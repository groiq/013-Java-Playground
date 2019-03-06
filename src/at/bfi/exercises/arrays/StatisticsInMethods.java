/**
 * assignment:
 * Collect various statistics calculations on a double[] in one class.
 * 
 * Write a class with methods that each take a double[] as input and return
 * - the minimum
 * - the maximum
 * - the sum
 * - the average
 * - the variance
 * - the standard deviation
 * 
 * Contains a main method for testing.
 * 
 * Explanation of deviation and standard variance taken from:
 * https://www.mathsisfun.com/data/standard-deviation.html
 * I am also using their example for testing.
 */

package at.bfi.exercises.arrays;

import java.util.Arrays;

public class StatisticsInMethods {

	/**
	 * test stuff
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		double[] testArr;
		
		System.out.println("basic tests:");
		testArr = new double[] {3.0,4.0,1.0,2.0};
		show(testArr);
		System.out.println("minimum: " + minimum(testArr));
		System.out.println("maximum: " + maximum(testArr));
		
		testArr = new double[] {2.0,4.0};
		show(testArr);
		System.out.println("sum: " + sum(testArr));
		System.out.println("average: " + average(testArr));
		System.out.println();
		
		System.out.println("Testing variance and standard deviation with three samples.");
		System.out.println("One with no variance, one with lower and one with higher.");
		double[] noVarianceData = {2.0,2.0,2.0,2.0};
		printVariance(noVarianceData);
		double[] lowVarianceData = {2.0,2.0,6.0,6.0};
		printVariance(lowVarianceData);
		double[] higherVarianceData = {4.0,4.0,12.0,12.0};
		printVariance(higherVarianceData);
		System.out.println();
		
		System.out.println("Testing with sample data from the mathisfun page.");
		System.out.println("Values should be: ");
		System.out.println("average: 394; variance: 21704, standard deviation: 147,32...");
		testArr = new double[] {600,470,170,430,300};
		printVariance(testArr);
		

	}

	/**
	 * Looks up the smallest number in a double[].
	 * @param input a double[]
	 * @return a double, the smallest number from input
	 */
	private static double minimum(double[] input) {
		double result = input[0];
		for (double d : input) {
			if (d < result) {
				result = d;
			}
		}
		return result;
	}
	
	/**
	 * Looks up the largest number in a double[].
	 * @param input a double[]
	 * @return a double, the largest number from input
	 */
	private static double maximum(double[] input) {
		double result = input[0];
		for (double d : input) {
			if (d > result) {
				result = d;
			}
		}
		return result;
	}
	
	/**
	 * Calculates the sum of the values in a double[].
	 * @param input a double[]
	 * @return a double, the sum of the elements in input
	 */
	private static double sum(double[] input) {
		double result = 0;
		for (double d : input) {
			result += d;
		}
		return result;
	}
	
	/**
	 * Calculates the average of the values in a double[].
	 * @param input a double[]
	 * @return a double, the average of the values in input
	 */
	private static double average(double[] input) {
		return (sum(input) / input.length);
	}
	
	/**
	 * Calculates the variance of the values in a double[].
	 * @param input a double[]
	 * @return a double, the variance of the values in input
	 */
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
	
	/**
	 * Calculates the standard deviation of the values in a double[].
	 * @param input a double[]
	 * @return a double, the standard deviation of the values in input
	 */
	private static double standardDeviation(double[] input) {
		return Math.sqrt(variance(input));
	}
	
	/**
	 * helper method for printing a new array before calling methods on it. Prints the contents.
	 * @param input a double[]
	 */
	private static void show(double[] input) {
		System.out.println("new input: " + Arrays.toString(input));
	}

	/**
	 * Helper method for printing statistical data in one go.
	 * Prints, in succession, the input, its average, variance and standard deviation.
	 * @param input a double[]
	 */
	private static void printVariance(double[] input) {
		show(input);
		System.out.println("average: " + average(input));
		System.out.println("variance: " + variance(input));
		System.out.println("standard deviation: " + standardDeviation(input));
	}
	
}
