package at.bfi.coders.bay.exercises.unit5.review;

/**
 * Java basics review.
 * 
 * @author Hannes Alkin
 * @version
 * @since 03.10.2019
 * 
 */
public class ReviewApp {

	private static int counter = 0;

	/**
	 * @return the counter
	 */
	public static int getCounter() {
		return counter;
	}

	// Erstelle eine öffentliche Funktion mit den dafür notwendigen Eigenschaften
	// (inkl mindestens EINER Eingangsvariable)
	// und gib die Eingangsvariable in einem System.out.println aus
	/**
	 * @param i
	 * @return the square of i
	 */
	public static int squared(int i) {
		int j = (int) Math.pow(i, 2);
		System.out.println(i + " squared is " + j);
		return j;
	}

	// Erstelle eine öffentliche Procedure mit den dafür notwendigen Eigenschaften
	// (inkl mindestens EINER Eingangsvariable)
	// und gib die Eingangsvariable in einem System.out.println aus
	public static void increaseCounter(int i) {
		counter += i;
		System.out.println("increasing counter by " + i + ", counter is now " + counter);
	}

	public static void main(String[] args) {

		// Deklariere, Initialisiere und Überschreibe eine bestimmte Variable
		int i;
		i = 0;
		i = 2;

		// Rufe beide Methoden in deiner main auf und speichere den Rückgabewert
		// (der Methode welche einen Rückgabewert besitzt) in eine Variable
		i = squared(i);
		increaseCounter(3);

		System.out.println("---");

		// Erzeuge eine Klasse mit mind. 4 Klassenvariablen und einen Konstruktor.
		// Instanziere diese Klasse in deinem Hauptprogramm
		// und setze die Eigenschaften der Klasse (wie wir es mit Person gemacht haben)
		PlayerCharacter pc = new PlayerCharacter("Gimli", "dwarf", "mage");
		System.out.println(pc);
		pc.levelUp();
		System.out.println(pc);

	}

}
