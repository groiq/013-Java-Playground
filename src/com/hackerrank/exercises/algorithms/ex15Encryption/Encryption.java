package com.hackerrank.exercises.algorithms.ex15Encryption;

import java.util.Arrays;

public class Encryption {
	
    static String encryption(String s) {
    	
    	System.out.println(s.length());
    	System.out.println(Math.sqrt(s.length()));
    	
    	int strippedLen = s.length();
    	
    	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				strippedLen--;
			}
		}
    	int blockLen = (int) Math.sqrt(strippedLen);
    	System.out.println(strippedLen);
    	System.out.println(blockLen);
    	
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
    	
    	char[][] encrMap = new char[(strippedLen / blockLen)][blockLen+1];
//    	System.out.println(Arrays.toString(encrMap));
//    	System.out.println(Arrays.toString(encrMap[0]));
    	

    	
    	for (char[] cs : encrMap) {
			System.out.println(Arrays.toString(cs));
		}
    	
    	

    	String result = "";

    	return result;
    }

	public static void main(String[] args) {
		
		System.out.println(encryption("have a nice day"));

	}

}
