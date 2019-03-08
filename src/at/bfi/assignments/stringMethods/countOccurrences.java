/**
 * Provides methods that invoke <String>.indexOf() multiple times.
 */

package at.bfi.assignments.stringMethods;

//import java.util.ArrayList;
import java.util.Arrays;

public class countOccurrences {
	
	/**
	 * Counts the occurrences of a substing inside a string.
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
	 * Looks up all occurrences of a search pattern inside a string.
	 * 
	 * @param text 
	 * @param substring
	 * @return
	 */
	public static int[] allIndicesOf(String text, String substring) {
		int[] interim = new int[text.length()/substring.length()];
		int counter = 0;
		
		int pos = text.indexOf(substring);
		while (pos > -1) {
			interim[counter] = pos;
			counter++;
			pos = text.indexOf(substring, pos+1);
		}
		
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
		text = "fliegen und fliegen";
		text = "fliegen";
		searchPattern = "fliegen";
//		text = "blablabla ";
		searchPattern = "bla";
//		text = "sosox";
//		searchPattern = "so";
//		text = "xxxo";
//		searchPattern = "x";
		
		System.out.println(countOccurrences(text, searchPattern));
		System.out.println(Arrays.toString(allIndicesOf(text, searchPattern)));

	}

}
