package com.hackerrank.exercises.algorithms.ex17ModifiedKaprekarNumbers;

import java.util.ArrayList;
import java.util.List;

public class ModifiedKaprekarNumbers {
	
	static boolean isKaprekar(long num) {
		
		boolean result = false;
		
		long digits = howManyDigits(num);
		long divisor = (long) Math.pow(10, digits);
//		System.out.print(num + " has " + digits + " digits. Divisor is " + divisor + ". ");
		long square = num * num;
		long squareDigits = howManyDigits(square);
//		System.out.print(" Square is " + square + ". ");
		long left = (long) square / divisor;
		long right = (long) square % divisor;
//		System.out.print("Split into " + left + " and " + right + ". ");
//		if (digits * 2 == squareDigits || (digits*2)-1 == squareDigits) {
////			System.out.print("candidate.");
//		} else {
//			System.out.println(num + " is not a candidate.");
//		}
		if (left + right == num) {
			result = true;
		}
		
//		System.out.println();
		return result;
		
	}
	
    static void kaprekarNumbers(long p, long q) {
    	
    	List<Integer> result = new ArrayList<Integer>();
    	
    	for (long i=p; i <= q; i++) {
    		if (isKaprekar(i)) {
    			result.add((int) i);
    		}
    	}
    	
    	if (result.isEmpty()) {
    		System.out.println("INVALID RANGE");
    	} else {
    		for (Integer i : result) {
				System.out.print(i + " ");
			}
    		System.out.println();
    	}
    	
//    	long digitCounter = howManyDigits(p);
//    	
//    	
//    	for (long i = p; i < q+1; i++) {
////			System.out.println(i);
//			// 10^(digitCounter - 1)
//    		long divisor = (long)Math.pow(10, digitCounter-1);
//			if (i > 9 && i / divisor == 10) {
//				digitCounter++;
//				divisor *= 10;
//			}
//			System.out.println(digitCounter + " digits");
			
//			long square = i*i;
//			long squareDigits = howManyDigits(square);
//			System.out.println(i + " has " + digitCounter + " digits and " + square + " has " + squareDigits + " digits. Divisor is " + divisor);
//			
//			if (squareDigits < digitCounter * 2 - 1 || squareDigits > digitCounter * 2) {
////				System.out.println("no candidate");
//				continue;
//			} 
			
//			long right = square / Math.pow(10, digitCounter-1);
//			
//		}
//    	
//    	System.out.println("function goes here");


    }

	private static long howManyDigits(long p) {
		long howManyDigitsInput = p;
    	long howManyDigitsCounter = 0;
    	while(howManyDigitsInput > 0) {
//    		System.out.println(howManyDigitsInput);
    		howManyDigitsInput /= 10;
    		howManyDigitsCounter++;
//    		System.out.println(howManyDigitsCounter);
    		
    	}
    	return howManyDigitsCounter;
	}

	public static void main(String[] args) {
		
		long[] testData = {1,5,9,10,50,99,100,500,999,1000};
		for (long i : testData) {
//			isKaprekar(i);
//			System.out.println(i + " tests to " + isKaprekar(i));
		}
		
//		kaprekarNumbers(1,100000);
//		kaprekarNumbers(1,20);
		kaprekarNumbers(1,200);

	}

}
