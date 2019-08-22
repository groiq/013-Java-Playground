package at.bfi.coders.bay.exercises.unit2._10.crackPasswordExpanded;

/**
 Crack the Password!
Nachdem du dich erfolgreich in Prof. Peppers Computer gehackt hast, stehst du jetzt vor der letzten Barriere, bevor du dir die Musterl�sung p�nktlich vor der Klausur saugen kannst.

Finde das 4 Stellige Passwort das sowohl aus Zahlen als auch aus Sonderzeichen besteht. Lege fest welche Sonderzahlen im Passwort enthalten sein k�nnen.

- Finde die 4 g�ltigen Zahlen mittels Brute-Force und gib sie auf der Konsole aus (Brute-Force = Rohe Gewalt, darunter versteht man das simple Ausprobieren aller m�glichen Kombinationen).
- F�r die absoluten Cracks: Wie funktioniert der Algorithmus?
- Erzeuge auch das Passwort zuf�llig bevor du es knackst
 */
/**
 * <h1>Exercise: Crack the password</h1>
 * 
 * Assignment:<br>
 * <br>
 * <br>
 * Crack the Password!<br>
 * Nachdem du dich erfolgreich in Prof. Peppers Computer gehackt hast, stehst du
 * jetzt vor der letzten Barriere, bevor du dir die Musterl�sung p�nktlich vor
 * der Klausur saugen kannst.<br>
 * <br>
 * Finde das 4 Stellige Passwort das sowohl aus Zahlen als auch aus
 * Sonderzeichen besteht. Lege fest welche Sonderzahlen im Passwort enthalten
 * sein k�nnen.<br>
 * <br>
 * - Finde die 4 g�ltigen Zahlen mittels Brute-Force und gib sie auf der Konsole
 * aus (Brute-Force = Rohe Gewalt, darunter versteht man das simple Ausprobieren
 * aller m�glichen Kombinationen).<br>
 * - F�r die absoluten Cracks: Wie funktioniert der Algorithmus?<br>
 * - Erzeuge auch das Passwort zuf�llig bevor du es knackst<br>
 * 
 * @author groiq
 * @version 1.0
 * @since 22.08.2019
 */
public class CrackPasswordTester {

	public static void main(String[] args) {

		Professor drPepper = new Professor("System.out.println(\"Hello world!\");", "Professor Pepper", 4);

//		System.out.println("calling getter for solution...");
//		System.out.println(drPepper.getSolution());
//
//		char[] wrongPassword = { '0', '0' };
//		System.out.println("fetching solution with wrong password...");
//		System.out.println(drPepper.getSolution(wrongPassword));
//
//		System.out.println("calling getter for password...");
//		System.out.println(drPepper.getPassword());

//		System.out.println("cracking password properly...");
		Sleuth samSpade = new Sleuth("Sam Spade");
		
		System.out.println("cracked password: " + samSpade.crackPassword(drPepper, false));
		System.out.println("cracked password: " + samSpade.crackPassword(drPepper, true));
		

//		System.out.println("the password is: " + samSpade.g);
//		System.out.println("the solution is: \'" + samSpade.crackSolution(drPepper) + "\'");

//		System.out.println("Trying again with password as String...");
//		String password = samSpade.getPassword();
//		System.out.println("the solution is: \'" + drPepper.getSolution(password) + "\'");

	}

}
