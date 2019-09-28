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
	
	private static final List<Person> trackedPeople = new ArrayList<Person>();
	
	/**
	 * @return the trackedPeople
	 */
	public static List<Person> getTrackedPeople() {
		return trackedPeople;
	}

	/**
	 * Prints data for a single person.
	 * @param person
	 */
	public static void printPersonData(Person person) {
		System.out.println(person.getPersonData());
	}
	
	/**
	 * Prints data for multiple people from an array.
	 * @param people
	 */
	public static void printPersonData(Person[] people) {
		for (Person person : people) {
			printPersonData(person);
		}
	}
	
	/**
	 * Prints data for the tracked people.
	 */
	public static void printPersonData() {
		for (Person person : trackedPeople) {
			printPersonData(person);
		}
	}
	
	/**
	 * Prints the company address for a person.
	 * @param person
	 */
	public static void printFullCompanyAddress(Person person) {
		System.out.println(person.getFullCompanyAddress());
	}
	
	public static void main(String[] args) {
		
		System.out.println("########## START MAIN ##########");
		System.out.println();

		// create two instances of Person using different constructors
		trackedPeople.add(new Person("Max", "Mueller", "Solar City", 34, "Coders Bay", "Tabakfabrikstrasse 3", 4020,
				"Linz", "info@codersbay.at"));
		trackedPeople.add(new Person("Fritz", "Meier", "Leonding", 26));
		// save one Person in a var for convenience
		Person p1 = trackedPeople.get(0);
		
		System.out.println("printing person data and company address...");
		printPersonData(p1);
		System.out.println();
		printFullCompanyAddress(p1);
		System.out.println();
		
		System.out.println("try to change company address...");
		p1.setCompanyAddress("Hagenberg");
		printFullCompanyAddress(p1);
		System.out.println();
		
		System.out.println("try to change age...");
		p1.setAge(p1.getAge() + 1);
		printPersonData(p1);
		System.out.println();
		
		System.out.println("print person data from an array...");
		Person[] peopleInArray = new Person[2];
		peopleInArray[0] = trackedPeople.get(1);
		peopleInArray[1] = p1;
		printPersonData(peopleInArray);
		System.out.println();
		
		System.out.println("print person data without parameters, using the built-in array list...");
		printPersonData();
		System.out.println();
		
		System.out.println("########## END MAIN ##########");
	}

}
