package com.hackerrank.exercises.algorithms.sherlockAndSquares;

import java.util.Arrays;

public class SherlockAndSquares {

	public static void main(String[] args) {
		
//		int threshold;
//		threshold = 11;
//		System.out.println(Arrays.toString(CalculateSquares.bySequence(threshold)));
//		System.out.println(Arrays.toString(CalculateSquares.bySquaring(threshold)));
//		
//		for (int i = 0; i < 33; i++) {
//			System.out.println(i + " -> " + sqrtRange(i)[0] + "-" + sqrtRange(i)[1]);
////			System.out.println(sqr(i));
//		}

		
//		System.out.println("3,2,0");
//		System.out.println(squares(24,49));
//		System.out.println(squares(3,9));
//		System.out.println(squares(17,24));
//		System.out.println(squares(0,4));
//		System.out.println(squares(1,4));
//		System.out.println(squares(35,70));
//		System.out.println(squares(4,9));
//		
		System.out.println(squares(4,9));
		System.out.println(squares(5,9));
		System.out.println(squares(4,8));
		System.out.println(squares(5, 8));
		

	}
	
    // Complete the squares function below.
    static int squares(int a, int b) {
    	int count = 0;

    	int upper = sqrtRange(b)[0];
    	int lower = sqrtRange(a)[1];
    	
    	System.out.println(lower + "-" + upper);

    	count = (upper - lower) + 1;
    	
    	return count;

    }
    
//    static int sqr(int input) {
//    	return input * input;
//    }
    
    static int[] sqrtRange(int input) {
    	
    	if (input == 1) {
    		return new int[]{1,1};
    	}
    	
    	int[] range = new int[2];
    	
    	int min = 0;
    	int max = input;
    	int currGuess = input/2;
    	int currSqr = currGuess * currGuess;
    	
    	while ( currSqr != input && (max-min)>1 ) {
    		if (currSqr < input) {
    			min = currGuess;
    		} else {
    			max = currGuess;
    		}
    		currGuess = (max+min)/2;
    		currSqr = currGuess * currGuess;
    	}

    	if (currSqr == input) {
    		range[0] = currGuess;
    		range[1] = currGuess;
    	} else {
        	range[0] = min;
        	range[1] = max;
    	}
    	return range;
    	
    }
    	



}
