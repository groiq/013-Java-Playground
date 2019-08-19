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

	}

}
