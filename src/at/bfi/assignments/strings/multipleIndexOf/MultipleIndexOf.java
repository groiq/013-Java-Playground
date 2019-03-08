/**
 * Provides methods that invoke <String>.indexOf() multiple times.
 */

package at.bfi.assignments.strings.multipleIndexOf;

//import java.util.ArrayList;
import java.util.Arrays;

public class MultipleIndexOf {
	
	/**
	 * Counts the occurrences of a substring inside a string.
	 * @param text - the string to be queried
	 * @param substring - the substring to be searched for
	 * @return the number of occurrences of the substring inside the text
	 */
	public static int countOccurrences(String text, String substring) {
		int result = 0;
		int pos = text.indexOf(substring);
		while (pos > -1 && pos < text.length()) {
			result += 1;
			pos = text.indexOf(substring, pos+1);
		}
		return result;
	}
	
	/**
	 * Looks up all occurrences of a substring inside a string.
	 * Returns the positions of the substrings in an int[].
	 * @param text - the string to be queried
	 * @param substring - the substring to be searched for
	 * @return an array containing the positions of the found occurrences.
	 */
	public static int[] allIndicesOf(String text, String substring) {
		/*
		 * Track occurrences in an interim array.
		 * In a string of length m, a substring of length n can occur at most (m/n) times,
		 * so that'll be the length of the interim array.
		 */
		int[] interim = new int[text.length()/substring.length()];
		int counter = 0;
		
		int pos = text.indexOf(substring);
		/*
		 * repeat indexOf() calls until it returns -1 (i.e. the substring is no longer found).
		 * Write positions into the interim array.
		 * 
		 * When tinkering with the code it might be safer to extend the condition to (pos > -1 && pos < text.length())
		 * to avoid infinite loops.
		 */
		while (pos > -1) {
			interim[counter] = pos;
			counter++;
			pos = text.indexOf(substring, pos+1);
		}
		
		/*
		 * Copy data into an array whose length is the actual number of occurrences.
		 */
		int[] result = new int[counter];
		for (int i = 0; i < result.length; i++) {
			result[i] = interim[i];
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		
		String text;
		String searchPattern;
		
		text = "wenn fliegen hinter fliegen fliegen, fliegen fliegen fliegen nach";
//		text = "fliegen und fliegen";
//		text = "fliegen";
		searchPattern = "fliegen";
//		text = "blablabla ";
//		searchPattern = "bla";
//		text = "sosox";
//		searchPattern = "so";
//		text = "xxxo";
//		searchPattern = "x";
//		text = "Search pattern occurs at the end";
//		text = "012d";
//		searchPattern = "d";
		
		System.out.println(countOccurrences(text, searchPattern));
		System.out.println(Arrays.toString(allIndicesOf(text, searchPattern)));
		
//		// What if we search from an index that isn't even in the string?
//		text = "0123";
//		searchPattern = "0";
//		System.out.println(text.indexOf(searchPattern, 4));
//		// Apparently that returns -1.

	}

}
