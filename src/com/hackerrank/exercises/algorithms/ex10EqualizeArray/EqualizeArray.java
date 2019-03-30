package com.hackerrank.exercises.algorithms.ex10EqualizeArray;

import java.util.Arrays;
import java.util.HashMap;

public class EqualizeArray {
	
    static int equalizeArray(int[] arr) {

    	int[] keys = new int[arr.length];
    	int[] values = new int[arr.length];
//    	System.out.println(Arrays.toString(keys));
    	
    	int dictionaryLength = 0;
    	for (int i : arr) {
			for (int j = 0; j < keys.length; j++) {
				if (keys[j] == i || keys[j] == 0) {
					if (keys[j] == 0) {
						keys[j] = i;
						dictionaryLength++;
					}
					values[j]++;
					break;
				}
			}
		}
//    	System.out.println(Arrays.toString(keys));
//    	System.out.println(Arrays.toString(values));
//    	System.out.println(dictionaryLength);

    	int result = 0;
    	
    	for (int i = 0; i < dictionaryLength; i++) {
			if (values[i] > result) result = values[i];
		}
    	
    	result = arr.length - result;
    	return result;

    }

	public static void main(String[] args) {
		
		p(new int[] {1,2,2});
		p(new int[] {1,2,2,3,3,3});
		p(new int[] {1,1,1,2,2,3});
		p(new int[] {1,1,3});

	}
	
	static void p(int[] arr) {
		System.out.println(Arrays.toString(arr) + " -> " + equalizeArray(arr));
	}

}
