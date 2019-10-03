package at.bfi.coders.bay.exercises.unit6.calculations;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   03.10.2019

 */
public class CalculationsApp {
	
	private static void doOperations(int i1, int i2, char[] operators) {
		for (char operator : operators) {
			int result = Calculations.chooseCalculation(i1, i2, operator);
			System.out.println(i1 + " " + operator + " " + i2 + " = " + result);
		}
	}

	public static void main(String[] args) {
		
		int i1 = 6;
		int i2 = 2;
		char[] operators = "+-*/".toCharArray();
		
		doOperations(i1, i2, operators);
		
		

	}

}
