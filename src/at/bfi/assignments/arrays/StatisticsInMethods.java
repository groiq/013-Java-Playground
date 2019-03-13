/**
 * Collects various statistics calculations on a double[] in one class.
 * 
 * Provides a class with static methods that each take a double[] as input and return
 * - the minimum
 * - the maximum
 * - the sum
 * - the average
 * - the variance
 * - the standard deviation
 * 
 * Also contains methods for element lookup:
 * - checks whether an element is in an array
 * - returns index of first occurrence
 * - counts occurrences of an element
 * 
 * Contains a main method for testing.
 * 
 * Explanation of deviation and standard variance taken from:
 * https://www.mathsisfun.com/data/standard-deviation.html
 * I am also using their example for testing.
 */

package at.bfi.assignments.arrays;

import java.util.Arrays;

public class StatisticsInMethods {

	/**
	 * for testing 
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
		System.out.println();
		
		System.out.println("Testing element lookup:");
		testArr = new double[] {1,3,3,7};
		for (int i = 0; i < 4; i++) {
			doLookups(testArr, i);
		}

	}

	/**
	 * Methods that perform statistical stuff
	 */

	/**
	 * Looks up the smallest number in a double[].
	 * @param input a double[] the array to be searched
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
	 * @param input a double[] the array to be searched
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
	 * @param input a double[] the array to be searched
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
	 * @param input a double[] the array to be searched
	 * @return a double, the average of the values in input
	 */
	private static double average(double[] input) {
		return (sum(input) / input.length);
	}
	
	/**
	 * Calculates the variance of the values in a double[].
	 * @param input a double[] the array to be searched
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
	 * @param input a double[] the array to be searched
	 * @return a double, the standard deviation of the values in input
	 */
	private static double standardDeviation(double[] input) {
		return Math.sqrt(variance(input));
	}
	
	/**
	 * Methods for element lookup
	 */
	
	/**
	 * Checks if a given element occurs in an array.
	 * @param input the array to be searched
	 * @param wanted the number to be searched for
	 * @return a boolean telling whether the element was found
	 */
	private static boolean contains(double[] input, double wanted) {
		if (indexOf(input,wanted) < 0) { return false; }
		else {return true; }
	}
	
	/**
	 * Looks up an element in an array. 
	 * @param input the array to be searched
	 * @param wanted the number to be searched for
	 * @return an int, the index of the first occurrence.
	 */
	private static int indexOf(double[] input, double wanted) {
		int pos = -1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == wanted) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	/**
	 * counts the occurrence of an element in an array.
	 * @param input the array to be searched
	 * @param wanted the number to be searched for
	 * @return the number of occurrences of the element in the array
	 */
	private static int countOccurrence(double[] input, double wanted) {
		int count = 0;
		for (double d : input) {
			if (d == wanted) { count++; }
		}
		return count;
	}

	/**
	 * printing shortcuts
	 */

	/**
	 * prints the contents of an array.
	 * @param input a double[], the array to be printed
	 */
	private static void show(double[] input) {
		System.out.println("input: " + Arrays.toString(input));
	}

	/**
	 * Helper method for printing statistical data in one go.
	 * Prints, in succession, the input, its average, variance and standard deviation.
	 * @param input a double[], the array to be analyzed
	 */
	private static void printVariance(double[] input) {
		show(input);
		System.out.println("average: " + average(input));
		System.out.println("variance: " + variance(input));
		System.out.println("standard deviation: " + standardDeviation(input));
	}
	
	/**
	 * Helper methos for testing lookup methods in one go.
	 * Prints, in succeddion, the number to be searched for, whether it was found, where it was found, and how often it was found.
	 * @param input the array to be searched
	 * @param wanted the number to be searched
	 */
	private static void doLookups(double[] input, double wanted) {
		show(input);
		System.out.println("wanted: " + wanted);
		System.out.println("contains: " + contains(input,wanted));
		System.out.println("indexOf: " + indexOf(input,wanted));
		System.out.println("countOccurrence: " + countOccurrence(input,wanted));
	}
	
}
