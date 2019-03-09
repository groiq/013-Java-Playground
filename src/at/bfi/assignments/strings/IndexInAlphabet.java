/**
 * Takes a string and replaces each character with its index in the alphabet.
 * -1 for non-letter signs.
 * Contains main method for testing.
 */

package at.bfi.assignments.strings;

import java.util.Arrays;

public class IndexInAlphabet {

	public static void main(String[] args) {
		
		String text;
		text = "The quick brown fox jumps over the lazy dog.";
		
		System.out.println(lettersToNumbersToLettersAgainBecauseThatIsMoreEfficientThanTypingArraysToStringEverySingleTime(text));
		System.out.println("\"a-z\": " + lettersToNumbersToLettersAgainBecauseThatIsMoreEfficientThanTypingArraysToStringEverySingleTime("a-z")
						+ "; \"A-Z\": " + lettersToNumbersToLettersAgainBecauseThatIsMoreEfficientThanTypingArraysToStringEverySingleTime("A-Z"));
		System.out.println("running through the alphabet: " + 
				lettersToNumbersToLettersAgainBecauseThatIsMoreEfficientThanTypingArraysToStringEverySingleTime("abcdefghijklmnopqrstuvwxyz"));

	}

	/**
	 * Takes a string and replaces each character with its index in the alphabet.
	 * -1 for non-letter signs.
	 * If a char is neither upper- nor lowercase, but still a letter,
	 * some other negative numbers are generated.
	 * @param text the text to be recoded
	 * @return an array containing the indices as ints
	 */
	private static int[] lettersToNumbers(String text) {
		
		int[] result = new int[text.length()];
		
		for (int i = 0; i < result.length; i++) {
			char curChar = text.charAt(i);
//			System.out.println(curChar);
			if (Character.isLetter(curChar)) {
				int charInt = (int) curChar;
//				System.out.println(curChar + ": " + charInt );
				int comparer;
				/*
				 * subtract numerical values of 'A' from uppercase chars, 
				 * 'a' from lowercase chars and the highest ascii value as a fallback.
				 */
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
	
	/**
	 * performs lettersToNumbers() on a string and toString() on the result  
	 * @param text the string to be recoded
	 * @return the contents of the resulting integer array cast to a string
	 */
	private static String lettersToNumbersToLettersAgainBecauseThatIsMoreEfficientThanTypingArraysToStringEverySingleTime(String text) {
		return Arrays.toString(lettersToNumbers(text));
	}
	

	

}
