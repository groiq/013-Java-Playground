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
    	
    	char[] resultAsArray = new char[(blockLen+1)*blockHeight];
    	System.out.println(Arrays.toString(resultAsArray));
    	System.out.println(resultAsArray.length);
    	
    	int[] tester = new int[12];
    	for (int i = 0; i < tester.length; i++) {
			tester[i] = i;
		}
    	System.out.println(Arrays.toString(tester));
    	tester = reshuffle(tester);

    	System.out.println(Arrays.toString(tester));
    	
//    	// test 1: print string in order
//    	for (int i = 0; i < s.length(); i++) {
//			System.out.print(s.charAt(i));
//			if ((i+1) % blockLen == 0) {
//				System.out.println();
//			}
//		}

//    	// test 2: same thing without spaces
//    	int counter = 0;
//    	for (int i = 0; i < s.length(); i++) {
//    		if (s.charAt(i) != ' ') {
//    			System.out.print(s.charAt(i));
//    			counter++;
//    			if (counter % blockLen == 0) {
//    				System.out.println();
//    			}
//    		}
//    	}
    	

    	
    	

    	String result = "";

    	return result;
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
