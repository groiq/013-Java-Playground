/**
 * 
 */
package at.bfi.coders.bay.exercises.unit6.calculations;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   02.10.2019

 */
public class Calculations {
	
	private static int add(int i1, int i2) {
		return (i1 + i2);
	}
	
	private static int substract(int i1, int i2) {
		return 0;
	}
	
	private static int multiply(int i1, int i2) {
		return 0;
	}
	
	private static int divide(int i1, int i2) {
		return 0;
	}
	
	public static int chooseCalculation(int i1, int i2, String operator) {
		
		switch (operator) {
		case "+":
			return add(i1,i2);
		case "-":
			return substract(i1,i2);
		case "*":
			return multiply(i1,i2);
		case "/":
			return divide(i1,i2);
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
		
		
	}

}
