package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;

public class Sleuth {
	
	private final String name;
	
	private char[] chars;
	private char[] guess;
	private char[] password;
	
	private Professor professor;

	public String getName() {
		return name;
	}
	

	public char[] getChars() {
		return chars;
	}


	public void setChars(char[] chars) {
		this.chars = chars;
	}


	public char[] getGuess() {
		return guess;
	}


	public void setGuess(char[] guess) {
		this.guess = guess;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	

	public char[] getPassword() {
		return password;
	}


	public void setPassword(char[] password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Sleuth [name=" + name + "]";
	}

	public Sleuth(String name) {
		this.name = name;
	}
	
	/* next milestone: break the whole process once the password is found */
	private void tryForPosition(int pos) {
		for (char c : chars) {
			guess[pos] = c;
			if (pos == guess.length - 1) {
				if (professor.enterPassword(guess)) {
					this.password = Arrays.copyOf(guess, guess.length);
					return;
				}
			} else {
				tryForPosition(pos+1);

			}
		}
	}
	
	public String crackSolution(Professor professor) {
		this.professor = professor;
		int pwdLen = professor.getPasswordLength();
		chars = professor.getPwdChars();
		guess = new char[pwdLen];
		tryForPosition(0);
		String solution = professor.getSolution(password);
		return solution;
	}

		

}
