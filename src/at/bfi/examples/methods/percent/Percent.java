/**
 * An attempt to demonstrate how a method can be called twice in different contexts.
 */
package at.bfi.examples.methods.percent;

public class Percent {
	
	private static int addPercent(int baseSum, int percentage) {
		int result;
		result = baseSum + (baseSum * percentage / 100);
		return result;
	}

	public static void main(String[] args) {

		/*
		 * We have a method that increases a base sum by a certain percentage.
		 * This method will be called in two different cases.
		 * In one case I have a certain amount on my bank account that yields interest.
		 * So I want to calculate the sum including interest.
		 */
		
		int deposit = 1000;
		int interest = 3;
		int accountBalance = addPercent(deposit,interest);
		System.out.println(deposit + " EUR deposit at " + interest + " % interest are " + accountBalance + " EUR.");
		
		/*
		 * In the second case I have a net price for a product and want to calculate the price including added value tax.
		 */

		int netPrice = 200;
		int addedValueTax = 20;
		int grossPrice = addPercent(netPrice, addedValueTax);
		System.out.println(netPrice + " EUR net price at " + addedValueTax + " % value tax are " + grossPrice + " EUR.");
		
		/*
		 * The calculation is the same in both cases, which is why I can use the same method.
		 * But the numbers have a slightly different meaning.
		 * 
		 * This is to demonstrate two things:
		 * how variables are used in a method definition and in a method call
		 * and how the important thing about a method is reusability.
		 */

	}

}
