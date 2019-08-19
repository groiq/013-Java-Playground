package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;

public class Sleuth {
	
	private final String name;
	
	private char[] chars;
	private char[] guess;

	public String getName() {
		return name;
	}
	

	@Override
	public String toString() {
		return "Sleuth [name=" + name + "]";
	}

	public Sleuth(String name) {
		this.name = name;
	}
	
	public String crackSolution(Professor professor) {
		
		int pwdLen = professor.getPasswordLength();
		chars = professor.getPwdChars();
		guess = new char[pwdLen];
		/* todo: crack the whole thing */
		return "placeholder";
	}

		

}
