package at.bfi.coders.bay.exercises.unit2._10.cesarChiffre;

/**
Aufgabe: C�sar Chiffre (Advanced)
Erstelle ein Programm, das eine Variable mit Text enth�lt. Dein Programm soll diesen Text mit einem Passwort (hier einer Zahl) durch eine C�sar-Chiffre verschl�sseln, 
und dann auf der Konsole ausgeben.

C�sar Chiffre: Bedeutet dass ich das ABC um eine bestimmte Stelle Verschiebe. Nehmen wir an ich verschiebe es um 2 Positionen dann wird aus A ein C, aus B ein D, aus C ein E usw.

Zusatz:

Der Text soll aus einer Datei eingelesen werden.
Der chiffrierte Text soll in einer neuen Datei gespeichert werden.

Entschl�sseln
Erweitere dein Programm so, dass es einen verschl�sselten Text bei gegebenem Passwort entschl�sseln kann. Speichere den entschl�sselten Text in einer separaten Datei.

Schl�ssel knacken
Erweitere dein Programm so, dass es in der Lage ist, einen beliebigen mit einer C�sar-Chiffre verschl�sselten Text zu entschl�sseln. 
 * @author groiq
 *
 */
public class CesarChiffreTester {

	public static void main(String[] args) {
	
		String test1 = "The quick brown fox jumps over the lazy dog.";
		int pwd1 = 1;
		String result1 = CesarChiffre.encode(test1,pwd1);
		System.out.println(result1);
		
		String encoded2;
		String decoded2;
		String text2 = "abcdefghijklmnopqrstuvwxyz | ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pwdFormatted;
		for (int i = 0; i < 27; i++) {
			encoded2 = CesarChiffre.encode(text2, i); 
			decoded2 = CesarChiffre.decode(encoded2, i);
			pwdFormatted = String.format("%02d", i);
			System.out.println(pwdFormatted +  ": " + encoded2 + " || " + decoded2);
		}

	}

}
