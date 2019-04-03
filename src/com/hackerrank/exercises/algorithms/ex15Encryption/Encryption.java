package com.hackerrank.exercises.algorithms.ex15Encryption;

import java.util.Arrays;

public class Encryption {
	
    static String encryption(String s) {
    	
    	/*
    	 * generate a string with the blanks stripped.
    	 * 
    	 * more specifically, the blanks are moved to the end.
    	 */
    	int strippedLen = 0;
    	char[] strippedString = new char[s.length()];
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if (c != ' ') {
    			strippedString[strippedLen] = c;
    			strippedLen++;
    		}
    	}
//    	System.out.println(Arrays.toString(strippedString));
    	int newWidth = (int) Math.sqrt(strippedLen);
//    	int newHeight = strippedLen / newWidth;
    	int newHeight = (int) Math.ceil((double)strippedLen/(double)newWidth);
//    	System.out.println(strippedLen + ":" + newWidth + "," + newHeight);
    	
    	
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int curBlock;
    	int curSection;
    	int oldPos;
    	for (int i = 0; i <= s.length(); i++) {
    		curSection = i / newWidth;
    		curBlock = i % newWidth;
    		oldPos = (curBlock * newHeight) + curSection;
//    		System.out.print(i + "->" + curBlock + "," + curSection + "->" + oldPos + "->");
    		if (oldPos < strippedLen) {
//    			System.out.print(strippedString[oldPos]);
    			sb.append(strippedString[oldPos]);
    		}
//    		System.out.println();
//    		sb.append(strippedString[oldPos]);
//    		if (i == strippedLen - 1) { // don't insert last space, also failsafe
//    			break;
//    		}
    		if (i % newWidth == newWidth - 1 && i < strippedLen - 1) {
    			sb.append('.'); // for debugging
//    			sb.append(' ');
    		}
    	}
    
    	String result = sb.toString();

    	return result;

    }



	public static void main(String[] args) {
		
		System.out.println(encryption("have a nice day"));
		System.out.println(encryption("123 456"));
		System.out.println(encryption("1234"));
		System.out.println(encryption("12345"));
//		System.out.println("feedthedog".length());
//		System.out.println("0123456789".length());
		System.out.println(encryption("0123456789"));
		System.out.println(encryption("feedthedog"));
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
