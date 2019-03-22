package com.hackerrank.exercises.algorithms.sherlockAndSquares.simpleBinarySearch;

public class BinarySearchGuesser {

	public static void playGame() {
		
		int min = 1;
		int max = BinarySearchGameMaster.getUpperRange();
		int currGuess;
		
//		System.out.println("Playing game! Range is from " + min + " to " + max + ".");
		
		do {
			currGuess = (min + max) / 2;
			System.out.println("new guess: " + currGuess);
			if (currGuess == min || currGuess == max) {
				System.out.println("reached stop point");
				currGuess = min * (-1);
				break;
			}
			if (BinarySearchGameMaster.checkGuess(currGuess) == 1) {
				System.out.println("too high");
				min = currGuess;
			} else { // should trigger when currGuess == 0, but shouldn't matter since the loop shouldn't be re-entered then
				System.out.println("too low");
				max = currGuess;
			}
		} while (BinarySearchGameMaster.checkGuess(currGuess) != 0);
		System.out.println("result is " + currGuess);
	}
	
}
