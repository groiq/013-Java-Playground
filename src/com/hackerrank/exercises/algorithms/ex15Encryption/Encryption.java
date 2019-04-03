package com.hackerrank.exercises.algorithms.ex15Encryption;

import java.util.Arrays;

public class Encryption {
	
    static String encryption(String s) {
    	
//    	System.out.println(s.length());
//    	System.out.println(Math.sqrt(s.length()));
    	
    	int strippedLen = s.length();
    	
    	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				strippedLen--;
			}
		}
    	int blockLen = (int) Math.sqrt(strippedLen);
    	int blockHeight = strippedLen / blockLen;
    	System.out.println(strippedLen);
    	System.out.println(blockLen);
    	System.out.println(blockHeight);


    	StringBuilder sb = new StringBuilder();
    	
    	int curBlock;
    	int curSection;
    	int posInStrippedString = 0;
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == ' ') {
    			continue;
    		}
//    		System.out.println(posInStrippedString + ":" + s.charAt(i));
			curSection = posInStrippedString / blockLen;
			curBlock = posInStrippedString % blockLen;
			
    		
    		posInStrippedString++;
		}
    	
    	
    	

    	String result = sb.toString();

    	return result;
    	
    	
    	
//    	// legacy testing code
//    	char[] resultAsArray = new char[(blockLen+1)*blockHeight];
//    	System.out.println(Arrays.toString(resultAsArray));
//    	System.out.println(resultAsArray.length);
    	
//    	int[] tester = new int[12];
//    	for (int i = 0; i < tester.length; i++) {
//			tester[i] = i;
//		}
//    	System.out.println(Arrays.toString(tester));
//    	tester = reshuffle(tester);
//
//    	System.out.println(Arrays.toString(tester));
//    	
    }
    
    

	public static void main(String[] args) {
		
		System.out.println(encryption("have a nice day"));
//		int[] tester = new int[6];
//		for (int i = 0; i < tester.length; i++) {
//			tester[i] = i;
//		}
//		System.out.println(Arrays.toString(tester));
//		System.out.println(Arrays.toString(reshuffle(tester)));

	}
	
	/*
	 * test: reorder an array
	 */
	static int[] reshuffle(int[] input) {
		
		int len = input.length;
		int rowLen = (int) Math.sqrt(len);
		int colLen = len / rowLen;
//		System.out.println("len: " + len + ", rowLen: " + rowLen + ", colLen: " + colLen);
		int[] output = new int[len+colLen];
		for (int i = 0; i < output.length; i++) {
			output[i] = -1;
		}
		
		int outputPos = 0;
		for (int i = 0; i < input.length; i++) {
			int curBlock;
			int curSection;
			curSection = i / rowLen;
			curBlock = i % rowLen;
			int newVal;
			newVal = (curBlock * colLen) + curSection;
//			newVal = colLen * curBlock + curSection;
//			System.out.println(i + "->" + curBlock + "," + curSection + "->" + newVal);
			output[outputPos] = newVal;
			outputPos++;
			if (i % rowLen == rowLen-1) {
				outputPos++;
			}
			
		}
		
		return output;
		
	}

}
