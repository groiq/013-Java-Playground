package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Stores a solution that is only accessible through a password.<br>
 * Provides information about the password.
 * 
 * @author groiq
 * @version 1.0
 * @since 25.08.2019
 */
public class Professor {

	// When this is set to true, some additional code is compiled to help at
	// development.
	private static final boolean debug = false;

	private final char[] password;
	private final char[] pwdChars;

	/**
	 * Checks if a given password is correct.
	 * 
	 * @param passwordGuess - the password to be checked as a String
	 * @return a boolean - true if the password is correct, otherwise false
	 */
	public boolean enterPassword(String passwordGuess) {
		char[] castOfPwdGuess = passwordGuess.toCharArray();
		return enterPassword(castOfPwdGuess);
	}

	/**
	 * Checks if a given password is correct.
	 * 
	 * @param passwordGuess - the password to be checked as a char[]
	 * @return a boolean - true if the password is correct, otherwise false
	 */
	public boolean enterPassword(char[] passwordGuess) {
		return (Arrays.equals(passwordGuess, password));
	}

	/**
	 * returns the lenght of the password
	 * 
	 * @return an int - the password length
	 */
	public int getPasswordLength() {
		return password.length;
	}

	/**
	 * returns the character set used for the password.
	 * 
	 * @return a char[] - the possible characters for the password
	 */
	public char[] getPwdChars() {
		return pwdChars;
	}

	/*
	 * returns the password cast as a string.
	 */
	private String getPwdString() {
		return new String(password);
	}

	/**
	 * The password length is given as a parameter. The character set is hardcoded
	 * for now. The password is random generated.
	 * 
	 * @param pwdLen - an int, the password length
	 */
	public Professor(int pwdLen) {
		/*
		 * Character set for the password is hardcoded to numbers and special chars.
		 * simplified char set in development.
		 * 
		 * In a future version, char list might be given as a constructor parameter 
		 * in a handy notation
		 */
		if (debug) {
			this.pwdChars = "ab".toCharArray();
		} else {
			this.pwdChars = "0123456789!'$%&/()=?".toCharArray();
		}
		this.password = new char[pwdLen];
		/*
		 * For each position in the password char[], fetch a random entry from pwdChars
		 * by generating a random number for its index
		 */
		for (int i = 0; i < password.length; i++) {
			int posNextChar = ThreadLocalRandom.current().nextInt(0, pwdChars.length);
			this.password[i] = pwdChars[posNextChar];
		}
		// override random generation in development
		if (debug) {
			this.password[0] = 'a';
			this.password[1] = 'a';
			this.password[2] = 'b';
			this.password[3] = 'b';
		}
		System.out.println("Random password generated: " + getPwdString());
	}

	/**
	 * toString() delivers no useful information
	 */
	@Override
	public String toString() {
		return "Professor [password=<REDACTED>]";
	}

}
