package com.hackerrank.exercises.algorithms.sherlockAndSquares;

import java.util.Arrays;

public class SherlockAndSquares {

	public static void main(String[] args) {
		
		int threshold;
		threshold = 11;
		System.out.println(Arrays.toString(CalculateSquares.bySequence(threshold)));
		System.out.println(Arrays.toString(CalculateSquares.bySquaring(threshold)));

	}

}
