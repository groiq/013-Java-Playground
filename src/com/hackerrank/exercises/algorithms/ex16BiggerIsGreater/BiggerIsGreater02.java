package com.hackerrank.exercises.algorithms.ex16BiggerIsGreater;

public class BiggerIsGreater02 {
	
    private static int failsafeCounter;
	private static int failsafe = 100;

	

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
			tester = nextPermutation(tester);
			if (failsafeCounter > failsafe) break;
			failsafeCounter++;
		}
	}
	
	private static void swap(char[] arr, int i, int j) {
		char placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
	}


	private static String nextPermutation(String input) {
		
		char[] arr = input.toCharArray();
		
		for (int i = arr.length - 2; i >= 0; i--) {
//			System.out.println(arr[i] + ":" + arr[i+1]);
			if (arr[i] < arr[i+1]) {
				boolean nextOneFound = false;
				// insert partial reverse here
				break;
			}
		}
		
		String output = String.valueOf(arr);
		if (output.equals(input)) {
			return "no answer";
		} else {
			return output;
		}
	}

}
