package com.hackerrank.exercises.algorithms.sherlockAndSquares;

import java.util.Arrays;

public class SherlockAndSquares {

	public static void main(String[] args) {
		
//		int threshold;
//		threshold = 11;
//		System.out.println(Arrays.toString(CalculateSquares.bySequence(threshold)));
//		System.out.println(Arrays.toString(CalculateSquares.bySquaring(threshold)));
//		
		System.out.println("3,2,0");
		System.out.println(squares(24,49));
		System.out.println(squares(3,9));
		System.out.println(squares(17,24));
		System.out.println(squares(0,4));
		System.out.println(squares(1,4));
		System.out.println(squares(35,70));
		System.out.println(squares(4,9));
		

	}
	
    // Complete the squares function below.
    static int squares(int a, int b) {
    	int count = 0;

    	int i = 0;
    	int j = 0;
    	
    	while(j < a) {
    		i++;
    		j = i * i;
    	}
    	while(j <= b) {
//    		j = i*i;
    		count++;
    		System.out.println("i:" + i + ",j:" + j + ",count:" + count);
    		i++;
    		j = i*i;
    	}
    	
    	return count;

    }

}
