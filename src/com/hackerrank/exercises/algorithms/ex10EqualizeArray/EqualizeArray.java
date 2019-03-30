package com.hackerrank.exercises.algorithms.ex10EqualizeArray;

import java.util.Arrays;
import java.util.HashMap;

public class EqualizeArray {
	
    static int equalizeArray(int[] arr) {


    	int result = 0;
    	
    	result = arr.length - result;
    	return result;

    }

	public static void main(String[] args) {
		
		p(new int[] {1,2,2});
		p(new int[] {1,2,2,3,3,3});
		p(new int[] {1,1,1,2,2,3});

	}
	
	static void p(int[] arr) {
		System.out.println(Arrays.toString(arr) + " -> " + equalizeArray(arr));
	}

}
