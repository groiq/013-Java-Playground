/**
 * Some tests on the subject of changing object variables in-place.
 */

package at.bfi.tools.passByReferenceAndReturnValues;

public class PassByReferenceAndReturnValues {

	public static void main(String[] args) {
		
		

	}
	
	private static int[] reassignVariable(int[] input) {
		int counter = input[0];
		input = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			input[i] = i + counter;
		}
		return input;
	}
	
	private static int[] changeVariableInPlace(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i] += 1;
		}
		return input;
	}
	
	

}
