package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

import java.util.Arrays;

public class Sleuth {
	
	private final String name;
	private int price;
	private String declineMessage = "That's not enough.";
	
	private char[] chars;
	private char[] guess;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	
	
	public String getDeclineMessage() {
		return declineMessage;
	}

	public void setDeclineMessage(String declineMessage) {
		this.declineMessage = declineMessage;
	}

	@Override
	public String toString() {
		return "Sleuth [name=" + name + ", price=" + price + "]";
	}

	public Sleuth(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	private String crackSolution(Professor professor) {
		
		int pwdLen = professor.getPasswordLength();
		chars = professor.getPwdChars();
		guess = new char[pwdLen];
		
		return "placeholder";
	}

	public String buySolution(int payment, Professor professor) {
		
		String answer;
		if (payment < price) {
			answer = declineMessage;
		} else {
			answer = crackSolution(professor); 
		}
		return answer;
		
	}

}
