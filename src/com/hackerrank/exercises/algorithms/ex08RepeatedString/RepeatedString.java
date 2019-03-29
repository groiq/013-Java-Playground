package com.hackerrank.exercises.algorithms.ex08RepeatedString;

public class RepeatedString {
	
	static long repeatedString(String s, long n) {
		
		long remainder = n % s.length();
		long occurrencesPartialString = 0;
		long occurrencesWholeString = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				occurrencesWholeString++;
				if (i < remainder) {
					occurrencesPartialString++;
				}
			}
		}
		
		long wholeRepetitions = n / s.length();
		
		long result = (wholeRepetitions * occurrencesWholeString) + occurrencesPartialString; 

		return result;

	}


	public static void main(String[] args) {
		
		String theString;
		theString = "abba";
//		theString = "abc";
		theString = "a1a2a3";
		
		for (int i = 0; i < (theString.length()*3+1); i++) {
			
			System.out.println(i + " -> " + stringRep(theString,i) + " -> " + repeatedString(theString, i));
			
		}

	}


	private static String stringRep(String theString, int i) {
		int index;
		String result = "";
		for (int j = 0; j < i; j++) {
			index = j % theString.length();
			result += theString.charAt(index);
		}
		return result;
	}

}
