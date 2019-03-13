/**
 * a class for testing the limits of for loops.
 */
package at.bfi.variousStuff;

import java.util.Arrays;
import java.util.Scanner;

public class abusingForLoops {
	
	/**
	 * rounds up a number to a multiple of another one.
	 * @param amount the number to be rounded up
	 * @param roundTo the number to whose multiple amount is to be rounded
	 * @return the rounded number
	 */
	public static int roundUpProper(int amount, int roundTo) {
		while (amount % roundTo != 0) {
			amount++;
		}
		return amount;
	}
	
	/**
	 * rounds up a number to a multiple of another one using an empty for loop.
	 * @param amount the number to be rounded up
	 * @param roundTo the number to whose multiple amount is to be rounded
	 * @return the rounded number
	 */
	public static int roundUpUsingFor(int amount, int roundTo) {
		for (amount = amount; amount % roundTo != 0; amount++) {}
		return amount;
	}
	
	/**
	 * Pads out a String of a given minimum length by repeating the same snippet.
	 * (Note that the resulting String won't be <space> chars long, but the next multiple of snippet.length().)
	 * @param snippet the string to 
	 * @param space
	 * @return
	 */
	public static String fillSpaceProper(String snippet, int space) {
		String paddedString = snippet;
		while(paddedString.length() < space) {
			paddedString += snippet;
		}
		return paddedString;
	}
	
	/**
	 * Pads out a String of a given minimum length by repeating the same snippet.
	 * (Note that the resulting String won't be <space> chars long, but the next multiple of snippet.length().)
	 * This is to test a loop where the counter is a String.
	 * @param snippet the string to 
	 * @param space
	 * @return
	 */
	public static String fillSpaceUsingFor(String snippet, int space) {
		String paddedString;
		for (paddedString = snippet; paddedString.length() < space; paddedString += snippet) {}
		return paddedString;
	}
	
	/**
	 * Plays number guessing with the user. 
	 * An example of a classic while loop (runs until an unforeseeable incident happens)
	 */
	public static void guessNumberProper() {
		int solution;
		solution = 5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10:");
		int guess = -1;
		while (guess != solution) {
			System.out.println("your guess:");
			guess = scanner.nextInt();
		}
		scanner.close();
		System.out.println("correct!");
	}
	
	/**
	 * Plays number guessing with the user. 
	 * An example of a classic while loop (runs until an unforeseen incident happens).
	 * but this time it's implemented using a for loop.
	 */
	public static void guessNumberUsingFor() {
		int solution;
		solution = 5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10:");
		for(int i = 0; i < 10; i--) {
			System.out.println("your guess:");
			int guess = scanner.nextInt();
			if (guess == solution) { break; }
		}
		scanner.close();
		System.out.println("correct!");
	}

	

	public static void main(String[] args) {

		int roundUpAmount;
		int roundUpThreshold;
		roundUpAmount = 18;
		roundUpThreshold = 5;
		
		System.out.println(roundUpProper(roundUpAmount, roundUpThreshold));
		System.out.println(roundUpUsingFor(roundUpAmount, roundUpThreshold));

		System.out.println(fillSpaceProper("bla", 8));
		System.out.println(fillSpaceUsingFor("bla", 8));

		guessNumberProper();
		guessNumberUsingFor();

	}

}
