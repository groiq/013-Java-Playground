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
			System.out.println(encryption(theString));
		}

	}

    private static String encryption(String s) {
        
        int len = s.length();
        int rows = (int) Math.round(Math.sqrt(len));
        int cols = (rows*rows < len ? rows+1 : rows);
        
        StringBuilder sb = new StringBuilder();
        
        for (int curRow = 0; curRow < cols; curRow++) {
            for (int curIndex = curRow; curIndex < len; curIndex += cols) {
                sb.append(s.charAt(curIndex));
            }
            if (curRow < rows) sb.append(' ');
        }
        
        return sb.toString();
    }
	

}
