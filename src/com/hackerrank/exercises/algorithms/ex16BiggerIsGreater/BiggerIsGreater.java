/*
 * Idea: This is all about permutations. Try a permutation generator first? Didn't I have such a thing already?
 */
package com.hackerrank.exercises.algorithms.ex16BiggerIsGreater;

import java.util.Arrays;

public class BiggerIsGreater {
	
    private static int failsafeCounter;
	private static int failsafe = 100;

	static String biggerIsGreater(String w) {

    	char[] arr = w.toCharArray();
//    	System.out.println(Arrays.toString(arr));
    	
    	for (int i = arr.length - 2; i >= 0; i--) {
//    		System.out.println(arr[i] + ":" + arr[i+1]);
    		if (arr[i] < arr[i+1]) { // Guess I'll have to change this to <= to deal with duplicate values!
//    			System.out.println("Gotcha!");
    			
    			/*
    			 * Sort the array from arr[i+1] to the end.
    			 * Then, find the smallest element larger than arr[i].
    			 * Swap those two elements.
    			 */

    			
    			// sort the array from arr[i+1] to the end
    			boolean nextOneFound = false;
//    			char nextOne;
//    			char placeholder;
    			for (int j = i+1; j < arr.length; j++) {
    				for (int k = j+1; k < arr.length; k++) {
    					if (arr[j] > arr[k]) {
    						swap(arr,j,k);
//    						placeholder = arr[j];
//    						arr[j] = arr[k];
//    						arr[k] = placeholder;
    					}
    				}
    				/*
    				 * Since we're using selectionSort, after a round part of the field is already sorted.
    				 * So instead of first sorting the entire array and then looking up the element,
    				 * we can already swap the elements the moment we find it.
    				 */
    				if (!nextOneFound && arr[j] > arr[i]) {
    					nextOneFound = true;
//    					nextOne = arr[j];
    					swap(arr,i,j);
//    					placeholder = arr[j];
//    					arr[j] = arr[i];
//    					arr[i] = placeholder;
    				}
    			}
    			
    			
    			// search for the smallest element bigger than arr[i]
    			
    			
    			// swap this element with arr[i]
    			
    			break;
    		}
    	}

    	String output = String.valueOf(arr);
    	if (output.equals(w)) {
    		return "no answer";
    	} else {
    		return output;
    	}
    }

	private static void swap(char[] arr, int i, int j) {
		char placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
		
	}

	public static void main(String[] args) {
		
		loopThroughTestCases("2345");
		// test also with duplicate values!
		loopThroughTestCases("1337");
		loopThroughTestCases("123");
		loopThroughTestCases("122");
		

	}

	private static void loopThroughTestCases(String tester) {
		failsafeCounter = 0;
		while (!tester.equals("no answer")) {
			System.out.println(tester);
			tester = biggerIsGreater(tester);
			if (failsafeCounter > failsafe) break;
			failsafeCounter++;
		}
	}

}
