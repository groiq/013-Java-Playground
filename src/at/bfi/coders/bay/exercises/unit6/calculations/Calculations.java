/**
 * 
 */
package at.bfi.coders.bay.exercises.unit6.calculations;

/**
 * @author Hannes Alkin
 * @version
 * @since 02.10.2019
 * 
 */
public class Calculations {

	private static int add(int i1, int i2) {
		return (i1 + i2);
	}

	private static int substract(int i1, int i2) {
		return (i1 - i2);
	}

	private static int multiply(int i1, int i2) {
		return (i1 * i2);
	}

	private static int divide(int i1, int i2) throws IllegalArgumentException {
		try {
			return (i1 / i2);
		} catch (ArithmeticException e) {
			throw new IllegalArgumentException(
					"Dividing " + i1 + " by " + i2 + " impossible. Did you try dividing by zero?");
		}
	}

	public static int chooseCalculation(int i1, int i2, String operator) throws IllegalArgumentException {

		switch (operator) {
		case "+":
			return add(i1, i2);
		case "-":
			return substract(i1, i2);
		case "*":
			return multiply(i1, i2);
		case "/":
			return divide(i1, i2);
		default:
			throw new IllegalArgumentException("Unexpected value for operator: " + operator);
		}

	}

}
