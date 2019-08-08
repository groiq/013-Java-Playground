package at.bfi.coders.bay.exercises.unit2._10.nightOut;

/**
 * 
 * @author groiq
 *
 * Apparently all the tasks revolve around the actoins of some celebrating person.
 * I better set up a class called "celebrant". Thus I can seperate the implementation from the checks.
 * 
 * 
 *
 */
public class NightOutApp {
	
	private static void testGlassContents(Celebrant celebrant, double contents) {
		celebrant.setGlassContents(contents);
		System.out.println("<glass contents: " + celebrant.getGlassContents() + ">");
		celebrant.checkGlass();
	}

	public static void main(String[] args) {
		
		/**
		 * 1. Definiere eine Variable in der du ml abspeichern kannst (egal ob mit oder ohne Nachkommazahlen).
		 *  Lege einen Wert fest und überprüfe mit einer geigneten Verzweigung, folgende Situation:
		 * 
		 *        Das Glas hat genau  250ml Inhalt --> Ausgabe "Das Glas ist voll"
		 *        Das Glas hat weniger als 250ml Inhalt --> Ausgabe "Das Glas ist nicht mehr voll"
		 *        Das Glas hat weniger als 20ml oder ist ganz leer --> Ausgabe "Kellner neues Bier*" 
		 * 
		 *    *Statt Bier kann gerne auch Spritzer bestellt werden
		 * 
		 *    Optional: Du verbringst den ganzen Abend in einem Lokal 
		 *    und wirst eine bestimmte Anzahl an Gläsern trinken. 
		 *    Speichere dir deine Anzahl an getrunkenen Gläsern in eine Variable 
		 *    die wir später brauchen werden.
		 */
		
		Celebrant adam = new Celebrant("Adam");
		
		System.out.println("Adam has drunk " + adam.getGlassesDrunk() + " glasses so far.");
		System.out.println("Adam is getting a new glass...");
		testGlassContents(adam, 250.0);
		System.out.println("Adam is taking a few gulps");
		testGlassContents(adam, 249.9);
		testGlassContents(adam, 20.1);
		testGlassContents(adam, 20.0);
		testGlassContents(adam, 19.9);
		testGlassContents(adam, 250.1);
		System.out.println("Adam has drunk " + adam.getGlassesDrunk() + " glasses so far.");
		
		/**
		 * 2. Als nächsten Stop in eurer Abendgestaltung gehst du in eine Spielbar in der ihr bowlen geht.
		 * Für die Punktevergabe gibt es folgende Regeln.
		 * 
		 *       Wenn alle 10 Pins getroffen werden dann ist das ein Strike. Ausgabe auf der Punktetafel soll daher "X - Strike!!!" sein.
		 *       Wenn 7-9 Pins getroffen werden dann soll "Guter Treffer" ausgegeben werden
		 *       Wenn 4-6 Pins getroffen werden dann soll "Normaler Treffer" ausgegeben werden
		 *       Wenn 1-3 Pins getroffen werden dann soll "Schwacher Treffer" ausgegeben werden
		 *       Wenn kein Pin getroffen wird dann "- Miss" ausgegeben
		 * 
		 *    Optional: Du darfst nur Spielen wenn du im vorherigen Lokal weniger als 4 Getränke hattest
		 */
		
		BowlingAlley koeoe = new BowlingAlley();
		
		Celebrant bob = new Celebrant("Bob");
		bob.setGlassesDrunk(5);
		System.out.println("Bob wants to try his luck at the bowling alley...");
		koeoe.setContestant(bob);
		System.out.println("Then Adam has a go...");
		koeoe.setContestant(adam);
		System.out.println("Bob has magically sobered up, but appears to be cheating. Who is this guy anyway?");
		
		

	}

}
