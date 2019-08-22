package at.bfi.coders.bay.exercises.unit2._10.crackPasswordExpanded;

import java.util.Arrays;

/**
 * Cracks a password from a professor object.
 * @author groiq
 *
 */
public class Sleuth {
	
	private final String name;
	
	
	private char[] chars;
	private char[] guess;
	private char[] password;
	private Professor professor;
	private boolean verbose;

	/**
	 * returns the sleuth's name.
	 * @return the sleuth's name
	 */
	public String getName() {
		return name;
	}
	

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

	/**
	 * returns basic information.
	 */
	@Override
	public String toString() {
		return "Sleuth [name=" + name + "]";
	}

	/**
	 * Creates a new sleuth with a given name.
	 * @param name the name for the sleuth
	 */
	public Sleuth(String name) {
		this.name = name;
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
					System.out.println("Password found!");
					return;
				}
			} else {
				tryForPosition(pos+1);

			}
		}
	}
	
	public String crackPassword(Professor professor,boolean verbose) {
		this.verbose = verbose;
		this.professor = professor;
		int pwdLen = professor.getPasswordLength();
		chars = professor.getPwdChars();
		guess = new char[pwdLen];
		tryForPosition(0);
		return new String(this.password);
	}
	
	/**
	 * Hire the sleuth to crack a solution from a professor
	 * @param professor the professor to be spied out
	 * @return the solution the professor is hiding
	 */
	/*
	 * Assign the local fields, then call tryForPosition().
	 * When the password is found, fetch and return the solution.
	 */
	/* next milestone: separate password cracking from solution cracking */
	public String crackSolution(Professor professor) {
		this.professor = professor;
		int pwdLen = professor.getPasswordLength();
		chars = professor.getPwdChars();
		guess = new char[pwdLen];
		tryForPosition(0);
		System.out.println("The password is: " + Arrays.toString(this.password));
		String solution = professor.getSolution(password);
		return solution;
	}

		

}
