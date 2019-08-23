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
	6.a If not, move forward one position and continue from step 7.
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
		
		int pwdLen = professor.getPasswordLength();
		char[] chars = professor.getPwdChars();
		char[] guess = new char[pwdLen];
		int position = 0;
		
		
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
