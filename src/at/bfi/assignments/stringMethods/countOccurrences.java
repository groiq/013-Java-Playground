/**
 * Counts occurrences of a search pattern inside a string.
 */

package at.bfi.assignments.stringMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class countOccurrences {
	
	public static int countOccurrences(String text, String searchPattern) {
		int result = 0;
		
		int pos = text.indexOf(searchPattern);
		while (pos > -1) {
			result += 1;
			pos = text.indexOf(searchPattern, pos+1);
		}
		

		
		return result;
	}
	
	public static int[] allIndicesOf(String text, String searchPattern) {
		int[] interim = new int[text.length()/searchPattern.length()];
		int counter = 0;
		
		int pos = text.indexOf(searchPattern);
		while (pos > -1) {
			interim[counter] = pos;
			counter++;
			pos = text.indexOf(searchPattern, pos+1);
		}
		
		int[] result = new int[counter];
		for (int i = 0; i < result.length; i++) {
			result[i] = interim[i];
		}
		
		return result;
	}
	
//	public static Integer[] allIndicesOf(String text, String searchPattern) {
//		ArrayList<int> result = new ArrayList<int>();
//		
//		return result.toArray();
//	}

	public static void main(String[] args) {
		
		String text;
		String searchPattern;
		text = "wenn fliegen hinter fliegen fliegen, fliegen fliegen fliegen nach";
		searchPattern = "fliegen";
//		text = "blablabla ";
//		searchPattern = "bla";
		
		System.out.println(countOccurrences(text, searchPattern));
		System.out.println(Arrays.toString(allIndicesOf(text, searchPattern)));

	}

}
