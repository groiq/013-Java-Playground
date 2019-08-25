package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;

/**
 * <h1>Password cracking sleuth</h1>
 * 
 * Uses brute force to crack a password. Designed to work against the Professor class.<br>
 * <br>
 * At each position in the password string, the program loops through all possible values.<br>
 * For each iteration, it moves to the next position and does the same.<br>
 * When it reaches the end, it checks the current values against the password.<br>
 * <br>
 * The algorithm in detail:<br>
 * <br>
 * 1. Get the list of allowed characters (called "character list").<br>
 * 2. Fetch password length.<br>
 * 3. Create an array with that length (called the "guess array").<br>
 * 4. Move to the first position in the guess array.<br>
 * 5. Repeat as long as the password is not found:<br>
 *     5.1 Read the character at the current position:<br>
 *         5.1.a If the character is the last in the character list:<br>
 *             5.1.b.1 Clear the current position.<br>
 *             5.1.b.2 Move one position backwards.<br>
 *         5.1.b Otherwise:<br>
 *                 5.1.b.1.a: If the position is empty, fill in the first entry in the character list.<br>
 *                 5.1.b.1.b: Otherwise replace the character with the following entry in the character list.<br>
 *             5.1.b.2: Check whether you are on the last position in the guess array.<br>
 *                 5.1.b.2.a: If yes, check the contents of the guess array against the password.<br>
 *                 5.1.b.2.b: If not, move one position forward.<br>
 * <br>
 * Offers methods to return a string or a char array.<br>
 * 
 * @author  groiq
 * @version 2.0
 * @since   25.08.2019
 */
public class Sleuth {

	 // When this is set to true, some additional code is compiled to help at development.
	 private static final boolean debug = false;
	
	/**
	 * Cracks the password from a professor object and returns it as a string.
	 * @param professor the professor to be cracked
	 * @param verbose if true, all guesses are printed
	 * @return the password as a string
	 */
	public String crackPassword(Professor professor, boolean verbose) {
		return new String (crackPasswordAsCharArray(professor, verbose));
	}
	
	/**
	 * Cracks the password from a professor object and returns it as a character array.
	 * @param professor the professor to be cracked
	 * @param verbose if true, all guesses are printed
	 * @return the password as a character array
	 */
	public char[] crackPasswordAsCharArray(Professor professor, boolean verbose) {

		/*
		 * Uses the algorithm from above. Line numbers are given as reference.
		 * 
		 * Because we need to read chars from the guess array and look them up in the character list multiple times,
		 * we are using an integer array that stores not the chars of the password,
		 * but their index in the character list.
		 * 
		 * An "empty" position is represented by -1 in the guess array.
		 */
		char[] chars = professor.getPwdChars();						// 1
		int pwdLen = professor.getPasswordLength();					// 2
		int[] guessAsCharacterIndices = new int[pwdLen];			// 3
		for (int i = 0; i < guessAsCharacterIndices.length; i++) {  // 3
			guessAsCharacterIndices[i] = -1;
		}
		char[] guess = new char[pwdLen];							// 3
		boolean passwordFound = false;								// 5
		int position = 0;											// 4
		int attempt = 0;
		
		while (!passwordFound) {														// 5
			if (guessAsCharacterIndices[position] < chars.length - 1) {					// 5.1.b
				guessAsCharacterIndices[position] += 1;									// 5.1.b.1
				guess[position] = chars[guessAsCharacterIndices[position]];				// 5.1.b.1
				if (position == pwdLen - 1) {											// 5.1.b.2
					attempt++;
					if (verbose) {
						System.out.println("guessing: \"" + new String(guess) + "\" on attempt " + attempt);
					}
					passwordFound = professor.enterPassword(guess);						// 5.1.b.2.a
				} else {
					position++;															// 5.1.b.2.b
				}
			} else {
				guessAsCharacterIndices[position] = -1;									// 5.1.b.1
				position--;																// 5.1.b.2

			}

			// prevent infinite loops when in development mode
			if (debug) {
				if (attempt > 100) {
					passwordFound = true;
				}
			}
		}

		return guess;
		
	}
	
	

}
