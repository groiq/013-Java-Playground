/**
 * Takes a string and replaces each character with its index in the alphabet.
 * -1 on non-letter signs.
 */

package at.bfi.assignments.strings;

import java.util.Arrays;

public class IndexInAlphabet {

	public static void main(String[] args) {
		
		String text = "The quick brown fox jumps over the lazy dog.";
		
		int[] codedText = lettersToNumbers(text);
		System.out.println(Arrays.toString(codedText));

	}

	private static int[] lettersToNumbers(String text) {
		
		int[] result = new int[text.length()];
		
		for (int i = 0; i < result.length; i++) {
//			System.out.println(text.charAt(i));
			Character curChar = text.charAt(i);
//			System.out.println(curChar);
			if (Character.isLetter(curChar)) {
				result[i] = 1;
			} else {
				result[i] = -1;
			}
		}
		
		return result;
	}

}
