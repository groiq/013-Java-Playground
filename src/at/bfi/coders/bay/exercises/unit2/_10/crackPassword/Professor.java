package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;

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
		if (enterPassword(castOfPwdGuess)) {
			return this.solution;
		} else {
			return "Wrong password!";
		}
		
	}
	
	
	/**
	 * Checks if a given password is correct.
	 * @param passwordGuess - the password to be checked as a String
	 * @return a boolean - true if the password is correct, otherwise false
	 */
	public boolean enterPassword(String passwordGuess) {
		char[] castOfPwdGuess = passwordGuess.toCharArray();
		return (Arrays.equals(castOfPwdGuess, password));
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
	 * The professor's name and the solution are given as parameters.
	 * Character set and password are hardcoded for now.
	 * @param solution - a String
	 * @param name - a String
	 */
	public Professor(String solution, String name) {
		/* next milestone: generate pwd at random, take length and character set as parameters */
//		this.password = new char[] {'a','b','c','1'};
//		this.password = new char[] {'0','1','0','1'};
		this.password = new char[] {'0','0'};
		this.solution = solution;
		this.name = name;
		/* next milestone: generate pwd char set dynamically from a char range */
//		this.pwdChars = new char[] {'a','b','c','0','1','2'};
		this.pwdChars = new char[] {'0','1'};
	}

	/**
	 * toString() delivers only the name
	 */
	@Override
	public String toString() {
		return "ProfessorAccount [password=<REDACTED>, solution=<REDACTED>, name=" + name + "]";
	}


}
