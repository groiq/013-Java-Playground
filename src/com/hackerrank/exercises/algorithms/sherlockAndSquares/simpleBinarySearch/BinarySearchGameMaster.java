package com.hackerrank.exercises.algorithms.sherlockAndSquares.simpleBinarySearch;

public class BinarySearchGameMaster {
	
	private static int currWanted;
	private static int upperRange;
	
	
	
	public static int checkGuess(int guess) {
		
		guess -= currWanted;
		if(guess > 0) {
			guess = 1;
		} else if (guess < 0) {
			guess = -1;
		}
		
		return guess;
	}

	public static void main(String[] args) {
		
		// test checkGuess()
		for (currWanted = -2; currWanted < 3; currWanted++) {
			for (int i = -2; i < 3; i++) {
				System.out.println("currWanted: " + currWanted + ", guess: " + i + ", result: " + checkGuess(i));
			}
		}

	}

}
