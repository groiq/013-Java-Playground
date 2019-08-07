package at.bfi.coders.bay.exercises.unit2._7;

/*
assignment:

Aufgabe: Zahlen(t)r‰ume mit if und Switch
Es sollen unterschiedliche Systemausgaben gemacht werden je nachdem welchen Wert eine Zahl von 1 bis 10 annimmt

Die Zahl liegt zwischen 1 und 5
Die Zahl liegt zwischen 6 und 10
Jackpot --> Wenn die Zahl gleich 10 ist
Die Zahl darf nicht 0 sein
Die Zahl ist zu groﬂ oder klein
Versuche diese Aufgabe sowohl mit if als auch mit switch-Verzweigungen
 * 
 */
public class NumberRanges {

	public static void main(String[] args) {
		
		for (int guess = -1; guess < 12; guess++) {
			System.out.println("number is " + guess + ".");
			guessWithIf(guess);
			guessWithSwitch(guess);
		}
		

		

	}

	private static void guessWithSwitch(int guess) {
		
		
		switch(guess) {
		case 0:
			System.out.println("number shouldn't be zero");
			break;
		case 1:
		case 2: 
		case 3:
		case 4:
		case 5:
			System.out.println("number between 1 and 5");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("number between 6 and 9");
			break;
		case 10:
			System.out.println("You've hit the jackpot!");
			break;
		default:
			System.out.println("number not in valid range.");
		}
		
	}

	private static void guessWithIf(int guess) {
		
		if (guess < 0) {
			System.out.println("number shouldn't be negative.");
		} else if (guess < 1) {
			System.out.println("number cannot be zero.");
		} else if (guess < 6) {
			System.out.println("between 1 and 5");
		} else if (guess < 10) {
			System.out.println("between 6 and 10");
		} else if (guess < 11) {
			System.out.println("you've hit the jackpot!");
		} else {
			System.out.println("the number's too high.");
		}

	}

}
