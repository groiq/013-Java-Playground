package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;


/**
 * Cracks a password from a professor object.
 * 
 * algorithm:
 * 
1. Find out the list of possible characters in the password.
2. Find out the length of the password.
3. Create an array with that length.
4. Move to the first position in this array.
5. Try to replace the character at the current position with its successor in the list of possible characters.
	5.a If the current position is empty, fill in the first of the possible characters.
	5.b If the character is already the last in the list, clear the current position and move one position backwards.
6. Check whether you are on the last positon in the array.
	6.a If not, move forward one position and continue from step 5.
	6.b If yes, check whether the sequence stored in the array is the password.
		6.b.a if yes, exit returning the stored password.
		6.b.b if no, continue from step 5.

 * 
 * @author groiq
 *
 */
public class Sleuth {

	/**
	 * @param drPepper
	 * @param b
	 * @return
	 */
	public String crackPassword(Professor professor, boolean verbose) {
		
		return new String (crackPasswordAsCharArray(professor, verbose));
	}
	
	
	public char[] crackPasswordAsCharArray(Professor professor, boolean verbose) {
		
		/*
		 * 1. Get the list of allowed characters (character list).
		 * 2. Fetch password length.
		 * 3. Create an array with that length.
		 * 4. Move to the first position in this array.
		 * 5. As long as the password is not found:
		 *     5.1 Read the character at the current position:
		 *         5.1.a If the position is empty, fill in the first entry in the character list.
		 *               (Starts looping through the character list on this position.)
		 *         5.1.b If the character is the last in the character list:
		 *                 5.1.b.1 Clear the current position.
		 *                 5.1.b.2 Move one position to the left.
		 */
		
		int pwdLen = professor.getPasswordLength();
		char[] chars = professor.getPwdChars();
		int numOfChars = chars.length;
		int[] guessAsCharacterIndices = new int[pwdLen];
		for (int i = 0; i < guessAsCharacterIndices.length; i++) {
			guessAsCharacterIndices[i] = -1;
		}
		char[] guess = new char[pwdLen];
		boolean passwordFound = false;
		
		int position = 0;
		int run = 0;
		while (!passwordFound) {
			
//			int indexOfCurrentCharacter = guessAsCharacterIndices[position];
			if (guessAsCharacterIndices[position] < numOfChars - 1) {
				guessAsCharacterIndices[position] += 1;
				guess[position] = chars[guessAsCharacterIndices[position]];
				if (position == pwdLen - 1) {
					if (verbose) {
						System.out.println("guessing: " + Arrays.toString(guess) + 
								" from " + Arrays.toString(guessAsCharacterIndices));
					}
					passwordFound = professor.enterPassword(guess);
				} else {
					position++;
				}
			} else {
				guessAsCharacterIndices[position] = -1;
				position--;

			}
//			if (guessAsCharacterIndices[position] < numOfChars - 1 ) {
//				guessAsCharacterIndices[position] += 1;
//				guess[position] = chars[guessAsCharacterIndices][position];
//			} else {
//
//			}
//			if (verbose) {
//				System.out.println(guess);
//			}
			
//			run++;
			if (run > 100) {
				passwordFound = true;
			}
		}
		
		
		/*
		 * 
1. Find out the list of possible characters in the password.
2. Find out the length of the password.
3. Create an array with that length.
4. Move to the first position in this array.
5. Try to replace the character at the current position with its successor in the list of possible characters.
	5.a If the current position is empty, fill in the first of the possible characters.
	5.b If the character is already the last in the list, clear the current position and move one position backwards.
6. Check whether you are on the last positon in the array.
	6.a If not, move forward one position and continue from step 5.
	6.b If yes, check whether the sequence stored in the array is the password.
		6.b.a if yes, exit returning the stored password.
		6.b.b if no, continue from step 5.
		 */
		
		/*
		 * idea: track an int[] and a char[] at the same time. 
		 * The int[] tells me which entry in the possible chars is currently filled in.
		 * That way, I can easily replace it with the following.
		 * Use -1 for empty fields.
		 * 
		 * e.g.:
		 * chars: (a,b,c)
		 * guess as ints	guess as chars
		 * 0,0,0			a,a,a
		 * 0,0,1			a,a,b
		 * 0,0,2			a,a,c
		 * 0,1,0			a,b,a
		 * 0,1,1			a,b,b
		 * 0,1,2			a,b,c
		 * etc.
		 * 
		 * two possibilities: Either the char is set immediately when the int is set,
		 * or the password is set before each run.
		 */
		
		return guess;
		
	}
	
	
	
	
// legacy method comments
	
	/*
	 * Runs through all possible values of the char at the current position.
	 * If this is the last char in the password, check the password.
	 * If it's correct, save it to the local password field.
	 * If there are more characters in the password, run this method on the next position.
	 */
	/* next milestone: stop running through possibilities once the password is found */
	
	/*
	 * Assign the local fields, then call tryForPosition().
	 * When the password is found, fetch and return the solution.
	 */
	

}
