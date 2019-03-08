/**
 * Counts occurrences of a search pattern inside a string.
 */

package at.bfi.assignments.stringMethods;

import java.util.ArrayList;

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
		
		System.out.println(countOccurrences(text, searchPattern));

	}

}
