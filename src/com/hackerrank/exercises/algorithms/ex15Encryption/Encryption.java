package com.hackerrank.exercises.algorithms.ex15Encryption;

public class Encryption {
	
    static String encryption(String s) {
    	
    	int strippedLen = s.length();
    	
    	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				strippedLen--;
			}
		}
    	int blockLen = (int) Math.sqrt(strippedLen);
    	
//    	// test 1: print string in order
//    	for (int i = 0; i < s.length(); i++) {
//			System.out.print(s.charAt(i));
//			if ((i+1) % blockLen == 0) {
//				System.out.println();
//			}
//		}

    	// test 2: same thing without spaces
    	int counter = 0;
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) != ' ') {
    			System.out.print(s.charAt(i));
    			counter++;
    			if (counter % blockLen == 0) {
    				System.out.println();
    			}
    		}
    	}

    	String result = "";

    	return result;
    }

	public static void main(String[] args) {
		
		System.out.println(encryption("have a nice day"));

	}

}
