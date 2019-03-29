package com.hackerrank.exercises.algorithms.ex10EqualizeArray;

import java.util.Arrays;
import java.util.HashMap;

public class EqualizeArray {
	
    static int equalizeArray(int[] arr) {

    	HashMap<Integer,Integer> counter = new HashMap<Integer,Integer>();
    	// variant with two int[] ?
    	
    	for (int i : arr) {
    		counter.put(i, counter.getOrDefault(i, 0)+1);
		}
    	System.out.println(counter);
    	
    	return 0;

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
