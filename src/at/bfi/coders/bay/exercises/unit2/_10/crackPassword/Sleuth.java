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
	
	private char[] chars;
	private char[] guess;
	private char[] password;
	private Professor professor;
	private boolean verbose;

	/**
	 * Returns the professor currently monitored.
	 * @return the professor currently monitored.
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * Assigns a professor to be monitored
	 * @param professor the professor to be monitored.
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/**
	 * Returns the password the sleuth found.
	 * @return the password the sleuth found.
	 */
	public String getPassword() {
		return new String(password);
	}
	
	/**
	 * Overwrites the stored password.
	 * @param password the new password.
	 */
	public void setPassword(String password) {
		this.password = password.toCharArray();
	}

	/**
	 * Returns the password the sleuth found as a char[].
	 * @return the password the sleuth found as a char[]
	 */
	public char[] getPasswordAsCharArray() {
		return password;
	}

	/**
	 * Overwrites the password.
	 * @param password the new password.
	 */
	public void setPasswordAsCharArray(char[] password) {
		this.password = password;
	}

	
	/*
	 * Runs through all possible values of the char at the current position.
	 * If this is the last char in the password, check the password.
	 * If it's correct, save it to the local password field.
	 * If there are more characters in the password, run this method on the next position.
	 */
	/* next milestone: stop running through possibilities once the password is found */
	private void tryForPosition(int pos) {
		for (char c : chars) {
			guess[pos] = c;
			if (pos == guess.length - 1) {
				if (this.verbose) {
					System.out.println("current guess: " + new String(guess));
				}
//				System.out.println(Arrays.toString(guess));
				if (professor.enterPassword(guess)) {
					this.password = Arrays.copyOf(guess, guess.length);
					if (verbose) {
						System.out.println("Password found!");
						}
					return;
				}
			} else {
				tryForPosition(pos+1);

			}
		}
	}
	
	/*
	 * Assign the local fields, then call tryForPosition().
	 * When the password is found, fetch and return the solution.
	 */
	public String crackPassword(Professor professor,boolean verbose) {
		this.verbose = verbose;
		this.professor = professor;
		int pwdLen = professor.getPasswordLength();
		chars = professor.getPwdChars();
		guess = new char[pwdLen];
		tryForPosition(0);
		return new String(this.password);
	}
	
		

}
