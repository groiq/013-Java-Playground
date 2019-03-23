package com.hackerrank.exercises.algorithms.ex04sherlockAndSquares;

public class CalculateSquares {
	
	public static int[] bySquaring(int threshold) {
		int[] result = new int[threshold];
		for (int i = 0; i < threshold; i++) {
			result[i] = i * i;
		}
		return result;
	}

	public static int[] bySequence(int threshold) {
		int[] result = new int[threshold];
		for (int i = 1; i < threshold; i++) {
			result[i] = result[i-1] + 2*(i-1) + 1;
		}
		return result;
	}
	
}
