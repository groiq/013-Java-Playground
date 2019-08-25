package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

/**
 * <h1>Exercise: Crack the password</h1>
 * 
 * Assignment:<br>
 * <br>
 * <br>
 * Crack the Password!<br>
 * Nachdem du dich erfolgreich in Prof. Peppers Computer gehackt hast, stehst du
 * jetzt vor der letzten Barriere, bevor du dir die Musterlösung pünktlich vor
 * der Klausur saugen kannst.<br>
 * <br>
 * Finde das 4 Stellige Passwort das sowohl aus Zahlen als auch aus
 * Sonderzeichen besteht. Lege fest welche Sonderzahlen im Passwort enthalten
 * sein können.<br>
 * <br>
 * - Finde die 4 gültigen Zahlen mittels Brute-Force und gib sie auf der Konsole
 * aus (Brute-Force = Rohe Gewalt, darunter versteht man das simple Ausprobieren
 * aller möglichen Kombinationen).<br>
 * - Für die absoluten Cracks: Wie funktioniert der Algorithmus?<br>
 * - Erzeuge auch das Passwort zufällig bevor du es knackst<br>
 * 
 * @author groiq
 * @version 1.0
 * @since 22.08.2019
 */
public class CrackPasswordTester {

	public static void main(String[] args) {

		Professor drPepper = new Professor(4);

		Sleuth samSpade = new Sleuth();
		
		System.out.println("cracking password, printing intermediate steps...");
		System.out.println("cracked password: " + samSpade.crackPassword(drPepper, true));
		System.out.println("cracking password without printing intermediate steps...");
		System.out.println("cracked password: " + samSpade.crackPassword(drPepper, false));

	}

}
