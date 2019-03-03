/**
 * assignment:
 * 
 * Implement an income tax calculator. You should print the correct tax rate and
 * the resulting net income. the following progressive tax rates apply (numbers
 * are gross income): 
 * 0 - 1500 EUR -> 20% 
 * 1501 - 2500 EUR -> 35% 
 * 2501 - 3500 EUR -> 45% 
 * 3501 and above -> 50%
 * 
 * Note that the assignment doesn't specify a tax progression method.
 * The correct tax calculation is as such:
 * If you earn 400 Eur, then
 * 1500 Eur are taxed with 20%,
 * 1000 Eur (1501-2500) with 35%,
 * 1000 Eur (2501-3500) with 45%,
 * and 500 Eur (3501-4000) with 50%.
 * 
 * 
 */


package at.bfi.assignments.conditionals.taxCalculator.v4;

import java.util.Arrays;

public class CalculatorApp {

	public static void main(String[] args) {
		
		for (int i = 1000; i < 4500; i += 500) {
			System.out.println("Calculating taxes for " + i + " Euro:");
			int[] stats = TaxCalculator.asArray(i);
			System.out.println("As array: ");
			System.out.println(Arrays.toString(stats));
			System.out.println("As string, from the array: " );
			System.out.println(TaxCalculator.asString(stats));
			System.out.println("as string, from the original input: ");
			System.out.println(TaxCalculator.asString(i));
			System.out.println();
			// TODO test asString with array as input
		}

	}

}
