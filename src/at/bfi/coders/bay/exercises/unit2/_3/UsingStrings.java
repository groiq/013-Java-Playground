package at.bfi.coders.bay.exercises.unit2._3;

/*
 * assignment:
 Zwei String Variablen deklarieren mit "Hello World" und "Good Night"
Die beiden Strings zusammenfügen
String 1 mit dem Wert von String 2 überschreiben
Alle einzelnen Schritte über die Systemausgaben die Werte ausgeben
 */
public class UsingStrings {
	
	static String hello;
	static String goodbye;
	
	private static void check() {
		System.out.println("value of first string: \"" + hello + "\"; value of second string: \"" + goodbye + "\".");
	}

	public static void main(String[] args) {
		
		// initialize Strings
		hello = "Hello World!";
		goodbye = "Good night";
		check();
		
		// put the two strings together
		hello += goodbye;
		check();
		
		// overwrite the first String with the value of the second String
		hello = goodbye;
		check();

	}

}
