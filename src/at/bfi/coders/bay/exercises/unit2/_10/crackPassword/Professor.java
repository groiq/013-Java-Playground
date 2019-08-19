package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Stores a solution that is only accessible through a password.
 * Provides information about the password.
 * @author groiq
 */
public class Professor {
	
	private final char[] password;
	private final String solution;
	private final String name;
	private final char[] pwdChars;
	private String failMsg = "You didn't think this would work, did you?";

	/**
	 * Each professor has a name.
	 * @return the name - a string
	 */
	public String getName() {
		return name;
	}

	/**
	 * The getter for the password blocks access.
	 * @return a String announcing failure
	 */
	public String getPassword() {
		return failMsg;
	}
	
	/**
	 * The parameterless getter for the solution blocks access.
	 * @return a String announcing failure 
	 */
	public String getSolution() {
		return failMsg;
	}

	/**
	 * Returns the solution if fed with the right password.
	 * @param passwordGuess - the password to be tried as a char[]
	 * @return a String - if the password was correct, the solution; otherwise an error message
	 */
	public String getSolution(char[] passwordGuess) {
		if (enterPassword(passwordGuess)) {
			return this.solution;
		} else {
			return "Wrong password!";
		}
	}
	
	/**
	 * Returns the solution if fed with the right password.
	 * @param passwordGuess - the password to be tried as a String
	 * @return a String - if the password was correct, the solution; otherwise an error message
	 */
	public String getSolution(String passwordGuess) {
		char[] castOfPwdGuess = passwordGuess.toCharArray();
		return getSolution(castOfPwdGuess);
	}
	
	/**
	 * Checks if a given password is correct.
	 * @param passwordGuess - the password to be checked as a String
	 * @return a boolean - true if the password is correct, otherwise false
	 */
	public boolean enterPassword(String passwordGuess) {
		char[] castOfPwdGuess = passwordGuess.toCharArray();
		return enterPassword(castOfPwdGuess);
	}
	
	/**
	 * Checks if a given password is correct.
	 * @param passwordGuess - the password to be checked as a char[]
	 * @return a boolean - true if the password is correct, otherwise false
	 */
	public boolean enterPassword(char[] passwordGuess) {
		return (Arrays.equals(passwordGuess, password));
	}

	/**
	 * returns the lenght of the password
	 * @return an int - the password length
	 */
	public int getPasswordLength() {
		return password.length;
	}

	/**
	 * returns the character set used for the password.
	 * @return a char[] - the possible characters for the password
	 */
	public char[] getPwdChars() {
		return pwdChars;
	}

	/**
	 * The professor's name, the solution and the password length are given as parameters.
	 * The character set is hardcoded for now. The password is random generated.
	 * @param solution - a String
	 * @param name - a String
	 * @param pwdLen - an int, the password length
	 */
	public Professor(String solution, String name, int pwdLen) {
		this.solution = solution;
		this.name = name;
		/* next milestone: generate pwd char set dynamically from a handy notation */
		this.pwdChars = new char[] {'a','b'};
		this.password = new char[pwdLen];
		/*
		 * For each position in the password char[], 
		 * fetch a random entry from pwdChars by generating a random number for its index 
		 */
		for (int i = 0; i < password.length; i++) {
			int posNextChar = ThreadLocalRandom.current().nextInt(0,pwdChars.length);
			this.password[i] = pwdChars[posNextChar];
		}
	}

	/**
	 * toString() delivers only the name
	 */
	@Override
	public String toString() {
		return "ProfessorAccount [password=<REDACTED>, solution=<REDACTED>, name=" + name + "]";
	}


}
