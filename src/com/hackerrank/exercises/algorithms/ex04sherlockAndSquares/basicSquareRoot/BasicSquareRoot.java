/**
 * Calculates a square root of a number using binary search.
 */
package com.hackerrank.exercises.algorithms.ex04sherlockAndSquares.basicSquareRoot;

public class BasicSquareRoot {
	
	public static int getSquareRoot(int number) {
		
		int guess;
		
		int min = 1;
		int max = number;
		guess = number;
		
		
		return guess;
	}

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " -> " + getSquareRoot(i));
		}

	}

}
