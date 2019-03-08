/**
 * Takes a string and replaces each character with its index in the alphabet.
 * -1 on non-letter signs.
 */

package at.bfi.assignments.strings;

import java.util.Arrays;

public class IndexInAlphabet {

	public static void main(String[] args) {
		
		String text;
		text = "The quick brown fox jumps over the lazy dog.";
		
		int[] codedText = lettersToNumbers(text);
		
		System.out.println(Arrays.toString(codedText));
		
//		System.out.println("\"a-z\": ");

	}

	private static int[] lettersToNumbers(String text) {
		
		int[] result = new int[text.length()];
		
		for (int i = 0; i < result.length; i++) {
//			System.out.println(text.charAt(i));
			char curChar = text.charAt(i);
//			System.out.println(curChar);
			if (Character.isLetter(curChar)) {
//				result[i] = 1;
				int charInt = (int) curChar;
//				System.out.println(curChar + ": " + charInt );
				int comparer;
				if (Character.isUpperCase(curChar)) {
					comparer = (int) 'A';
				} else if (Character.isLowerCase(curChar)) {
					comparer = (int) 'a';
				} else {
					comparer = 127;
				}
				charInt -= comparer;
				result[i] = charInt;
			} else {
				result[i] = -1;
			}
		}
		
		return result;
	}
	
	

}
