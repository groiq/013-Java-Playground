/**
 * Implements an income tax calculator.
 * 
 * This class provides a main method to test TaxCalculator.
 */


package at.bfi.assignments.conditionals.taxCalculator.v4;

import java.util.Arrays;

public class CalculatorApp {

	public static void main(String[] args) {
		
		for (int i = 1000; i < 4500; i += 500) {
			System.out.println("Calculating taxes for " + i + " Euro:");
			int[] stats = TaxCalculator.asArray(i);
			System.out.println("Calculate and return the array: ");
			System.out.println(Arrays.toString(stats));
			System.out.println("generate a string from the array: " );
			System.out.println(TaxCalculator.asString(stats));
			System.out.println("calculate from the original gross value and return as a string: ");
			System.out.println(TaxCalculator.asString(i));
			System.out.println();
		}

	}

}
