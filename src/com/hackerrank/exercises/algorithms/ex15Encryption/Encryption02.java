package com.hackerrank.exercises.algorithms.ex15Encryption;

public class Encryption02 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j <= i; j++) {
				sb.append(j);
			}
			String theString = sb.toString();
			System.out.println(theString);
			System.out.println(encrypt(theString));
		}

	}

	private static String encrypt(String s) {
		
		int len = s.length();
		int rows = (int) Math.round(Math.sqrt(len));
		int cols = (rows*rows < len ? rows+1 : rows);
		
		
		return null;
	}

	

}
