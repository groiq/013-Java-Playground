/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.personal.personnelManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>personnel management exercise</h1>
 * 
 * Assignment:<br>
 * 
 * Aufgabe: Personenverwaltung<br>
 * 1. Erstelle eine Klasse Person und eine Klasse PersonalManagement und
 * überführe den bereits erstellten Code in eben die Klasse Person<br>
 * 2. Erstelle einen Konstruktor um ein Personen Objekt erzeugen zu können<br>
 * 3. Erstelle eine Instanz der Person Klasse und versuche die Ausgaben der
 * vorrigen Übung(en) nachzubauen<br>
 * 4. Überlade die Methode zur Ausgabe der Personendaten mit 2 weiteren Methoden
 * und führe diese aus<br>
 * 5. Überlade ebenfalls den Konstruktor und erstelle einen Weiteren welchen du
 * auch im Hauptprogramm benutzen sollst<br>
 * <br>
 * 
 * @author Hannes Alkin
 * @version
 * @since 24.09.2019
 * 
 */
public class PersonnelManagementApp {
	
	
	private static List<Person> trackedPeople = new ArrayList<Person>();
	
	private static void printPersonData(Person person) {
		System.out.println(person.getPersonData());
	}
	
	private static void printPersonData(Person[] people) {
		for (Person person : people) {
			printPersonData(person);
		}
	}
	
	private static void printPersonData() {
		for (Person person : trackedPeople) {
			printPersonData(person);
		}
	}
	
	// printPersonData(Person)
	// printPersonData(Person[])

	public static void main(String[] args) {
		
		System.out.println("########## START MAIN ##########");

		
		
		
		System.out.println("########## END MAIN ##########");
	}

}
