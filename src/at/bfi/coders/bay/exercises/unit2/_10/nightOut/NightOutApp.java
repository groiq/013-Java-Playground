package at.bfi.coders.bay.exercises.unit2._10.nightOut;

import java.util.Arrays;

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
		 *    
		 * 5.  Ändere dein Programm so, dass du für die erste Aufgabenstellung eine Liste an ml hast (mindestens 3)
		 * die du in einer Schleife auf die bestehenden Abfragen überprüfst.
		 */
		
		Celebrant adam = new Celebrant("Adam",5);
		double[] glassContentValues;
		glassContentValues = new double[] {250.0,249.9,20.1,30.0,20.0,19.9,240.0};
		
		drink(adam, glassContentValues);
		
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
		 *    
		 * 6.  Ändere dein Programm so, dass du mindestens 10 mal bowlst und immer unterschiedliche Ergebnisse erzielst (Verwendung einer Liste)
		 */
		
		BowlingAlley koeoe = new BowlingAlley();
		Celebrant bob = new Celebrant("Bob",5);
		bowl(adam, bob, koeoe);
		
		/**
		 * 3. Nach eurem erfolgreichen Spiel wollt ihr eine Gruppe von Mädels (Jungs) beeindrucken und noch Klimmzüge am Türrahmen (Alternativ Sit-ups) machen.
		 *    Um den Gruppeneffekt zu stärken zählen alle laut mit. 
		 *    Programmiere mit allen Schleifenvarianten die du kennst, die Ausgabe der Zählung "1", "2",...
		 *    Anmerkung: Für die Anzahl soll eine Variable verwendet werden die in der Schleife hochgezählt wird.
		 * 
		 *    Optional: Bei 10 Liegestütz (Sit-Ups) fängst du zum schnaufen an und sagst laut "Phu ich hoffe das ist bald vorbei"
		 *              Bei 15 sagst du "Ich glaub ich schaff das nicht"
		 *              Bei 19 sagst du "JA ICH SCHAFFE ES!!!!!"
		 *              Bei 20 jubeln alle und singen "OLEOLEOLEEEEE"
		 * 
		 */
		int count;
		count = 20;
		adam.doSitups(count);
		
		/**
		 * 4.  Am Abend liegst du im Bett und es gibt nun folgende Fälle abzudecken:
		 * 
		 *         Fall 1: Du hast nur ein Getränk getrunken und gehst dich daher noch Duschen, Zähne putzen und ziehst dir deine Schlafkleidung an. 
		 *         		Aufgabe, du sollst deine Tätigkeiten mit einer println Funktion ausgeben. 
		 *         Fall 2: Du hast weniger als 3 Gläser getrunken und machst das selbe wie in Fall 1. 
		 *         		Zusätzlich bemerkst du, dass du Hunger hast. Du gehst zum Kühlschrank und isst alle Kekse die du findest. 
		 *         		Aufgabe: Du gibst deine Tätigkeiten aus. Für die Anzahl der Kekse soll immer ausgegeben werden 
		 *         		"Keks "+Nr.1 +"gegessen",  "Keks "+Nr.2 +"gegessen", .......
		 *        Fall 3: Du hast mehr als 3 Gläser getrunken und willst direkt ins Bett gehen. 
		 *        		Du versuchst über die Stufen zu gehen, schaffst aber die Anzahl der Stufen NICHT die du Getränke getrunken hast. 
		 *        		Die Stiege hat 15 Stufen. Hast du also 4 Getränke getrunken, schaffst du es nur bis zur 11 Stufe. 
		 *        		Aufgabe: Gib jede einzelne Stufe die du erklommen hast aus. 
		 *        		Bei der letzten Stufe die du schaffst gibst du aus "Jetzt muss ich schlafen"
		 * 
		 */
		adam.setGlassesDrunk(1);
		adam.goHome();
		bob.setGlassesDrunk(2);
		bob.goHome();
		Celebrant charlie = new Celebrant("Charlie", 5);
		charlie.setGlassesDrunk(4);
		charlie.goHome();

	}

	private static void bowl(Celebrant soberContestant, Celebrant drunkContestant, BowlingAlley bowlingAlley) {
		drunkContestant.setGlassesDrunk(5);
		
		System.out.println("Bob wants to try his luck at the bowling alley...");
		bowlingAlley.setContestant(drunkContestant);
		System.out.println("Then Adam has a go...");
		bowlingAlley.setContestant(soberContestant);
		
		int[] bowlingSeries = new int[15];
		for (int i = 0; i < bowlingSeries.length; i++) {
			bowlingSeries[i] = i % 11;
		}
		System.out.println(Arrays.toString(bowlingSeries));
		for (int i : bowlingSeries) {
			if (i == 5) {
				bowlingAlley.bowl(drunkContestant, 5);
			}
			bowlingAlley.bowl(soberContestant, i);
			System.out.println(bowlingAlley);
		}
		
		System.out.println(drunkContestant.getName() + " appears to have magically sobered up and has another go...");
		drunkContestant.setGlassesDrunk(0);
		bowlingAlley.setContestant(drunkContestant);
		bowlingAlley.bowl(drunkContestant, -1);
		bowlingAlley.bowl(drunkContestant, 11);
	}

	private static void drink(Celebrant adam, double[] glassContentValues) {
		System.out.println(adam.getName() + " has drunk " + adam.getGlassesDrunk() + " glasses so far.");
		System.out.println(adam.getName() + " is getting a new glass...");
		adam.orderGlass();
		
		
		for (double d : glassContentValues) {
			System.out.println("<setting glass content from " + adam.getGlassContents() + " to " + d + ">");
			adam.setGlassContents(d);
			adam.checkGlass();
		}
		
		System.out.println(adam.getName() + " has drunk " + adam.getGlassesDrunk() + " glasses so far.");
	}

}
