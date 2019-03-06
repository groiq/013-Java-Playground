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
 * Explanation of deviation and standard variance taken from:
 * https://www.mathsisfun.com/data/standard-deviation.html
 * I am also using their example for testing.
 */

package at.bfi.exercises.arrays;

import java.util.Arrays;

public class StatisticsInMethods {

	public static void main(String[] args) {
		
		double[] testArr;
		testArr = new double[] {3.0,4.0,1.0,2.0};
		show(testArr);
		System.out.println("minimum: " + minimum(testArr));
		System.out.println("maximum: " + maximum(testArr));
		
		testArr = new double[] {2.0,4.0};
		show(testArr);
		System.out.println("sum: " + sum(testArr));
		System.out.println("average: " + average(testArr));
		
		double[] noVarianceData = {2.0,2.0,2.0,2.0};
		printVariance(noVarianceData);
		double[] lowVarianceData = {2.0,2.0,6.0,6.0};
		printVariance(lowVarianceData);
		double[] higherVarianceData = {4.0,4.0,12.0,12.0};
		printVariance(higherVarianceData);
		

	}



	private static void show(double[] input) {
		System.out.println("new input: " + Arrays.toString(input));
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
	
	private static void printVariance(double[] input) {
		show(input);
		System.out.println("variance: " + variance(input));
		System.out.println("standard deviation: " + standardDeviation(input));
	}
	
}
