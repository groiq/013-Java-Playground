package com.hackerrank.exercises.algorithms.sherlockAndSquares.simpleBinarySearch;

public class BinarySearchGameMaster {
	
	private static int currWanted;
	private static int upperRange;
	
	
	
	static int getUpperRange() {
		return upperRange;
	}

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
		
//		// test checkGuess()
//		for (currWanted = -2; currWanted < 3; currWanted++) {
//			for (int i = -2; i < 3; i++) {
//				System.out.println("currWanted: " + currWanted + ", guess: " + i + ", result: " + checkGuess(i));
//			}
//		}
		
		for (int i = 0; i <= 10; i++) {
			upperRange = i;
			for (int j = 0; j < i; j++) {
				currWanted = j + 1;
				System.out.println("Asking for " + currWanted + " between 1 and " + upperRange + ".");
				BinarySearchGuesser.playGame();
			}
		}
		
		// Okay, looks like we're getting errors on every first and last entry in the list. Gotta check those.
		
//		// check all entries *except* the first and last
//		for (int i = 0; i <= 10; i++) {
//			upperRange = i;
//			for (int j = 1; j < i-1; j++) {
//				currWanted = j + 1;
//				System.out.println("Asking for " + currWanted + " between 1 and " + upperRange + ".");
//				BinarySearchGuesser.playGame();
//			}
//		}
//		// okay, that gives all the right results.
//		
		// check the first and last entry, respectively
		for (int i = 4; i < 5; i++) {
			upperRange = i;
			currWanted = 1;
			System.out.println("Asking for " + currWanted + " between 1 and " + upperRange + ".");
			BinarySearchGuesser.playGame();
			currWanted = i;
			System.out.println("Asking for " + currWanted + " between 1 and " + upperRange + ".");
			BinarySearchGuesser.playGame();
		}
		// yeah, that throws up -1 for currWanted = 1 and -(i-1) for currWanted = i.
		// Meh, gonna fix that manually for now.
//		


	}

}
