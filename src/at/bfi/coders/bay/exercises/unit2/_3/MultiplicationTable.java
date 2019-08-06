package at.bfi.coders.bay.exercises.unit2._3;

/*
 * Wir wollen das kleine 1x1 bis 10 ausgeben 
Ausgabe von 1x1, 1x2, 1x3, 1x4.....1x10
Dazu brauchen wir 3 Variablen: 2 Zahlen (number1 und number2) und ein Ergebnis (int number1, int number2, int result)
Variablen Initialisierung
Speicherung des jeweiligen Ergebnisses in die Variable result
 */
public class MultiplicationTable {
	
	private static int result;
	
	// recalculates the result and writes output.
	private static void calculate(int number1, int number2) {
		result = number1 * number2;
		System.out.print(number1 + "*" + number2 + "=" + result + ". ");
	}

	public static void main(String[] args) {
		
		// set an upper limit.
		int limit = 10;
		
		// cycle through values for the first factor
		for (int number1 = 1; number1 < limit+1; number1++) {
			// cycle through values for the second factor.
			for(int number2 = 1; number2 < limit+1; number2++) {
				calculate(number1,number2);
			}
			// after each value for the first factor insert a line break.
			System.out.println();
		}

	}

}
