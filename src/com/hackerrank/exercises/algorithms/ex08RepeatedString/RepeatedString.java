package com.hackerrank.exercises.algorithms.ex08RepeatedString;

public class RepeatedString {
	
	static long repeatedString(String s, long n) {

		return n;

	}


	public static void main(String[] args) {
		
		String theString;
		theString = "abba";
		theString = "abc";
		
		for (int i = 0; i < (theString.length()*3); i++) {
			
			System.out.println(stringRep(theString,i) + " -> " + repeatedString(theString, i));
			
		}

	}


	private static String stringRep(String theString, int i) {
		int index;
		String result = "";
		for (int j = 0; j < i+1; j++) {
			index = j % theString.length();
			result += theString.charAt(index);
		}
		return result;
	}

}
