package at.bfi.coders.bay.exercises.unit6.flughafen._1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>Flughafen</h1>
 * 
 * assignment:
 * 
 * Übung 1: Generierung der Klassen employees und der Klasse flights
 * 
 * Die Klasse employee hat folgende Eigenschaften:
 * 
 * personnel_number:int (Primärschlüssel)
 * 
 * first_name: string
 * 
 * last_name: string
 * 
 * street: string
 * 
 * appartment_number: string
 * 
 * zip: string
 * 
 * phonenumber: string
 * 
 * email: string
 * 
 * flights hat folgende Eigenschaften:
 * 
 * flight_number
 * 
 * departure: Time
 * 
 * flight_duration: int
 * 
 * departure_gate: string
 * 
 * arrival_gate: string
 * 
 * pilot: Employee
 * 
 * co_pilot: Employee
 * 
 * Step 1: Erzeugen der Klassen in Java
 * 
 * Step 2: Erzeugen von mehreren Employees und Flügen mit tatsächlichen
 * Referenzen auf die vorher erzeugten Employees.
 * 
 * Step 3: Flugsuche: Ihr könnt eine Flugnummer in der Konsole eingeben und
 * findet den entsprechenden Flug dazu
 * 
 * Step 4: Flüge der Piloten: Ihr könnt eine Personalnummer in der Konsole
 * eingeben und findet alle Flüge die dieser Pilot als Pilot oder als Co-Pilot
 * durchführt
 * 
 * Sample data by https://mockaroo.com/
 * 
 * @author Hannes Alkin
 * @version
 * @since 28.10.2019
 * 
 */
public class Flughafen1App {

	private static Scanner scan = new Scanner(System.in);

	private static Employee[] employees;
	private static Flight[] flights;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		generateEmployees();
		generateFlights();
		Airport myAirport = new Airport(employees, flights);
		offerQueryInterface(myAirport);


	} // end of main()

	private static void offerQueryInterface(Airport myAirport) {
		System.out.println("Welcome to our flight information service!\n");

		while (true) {
			System.out.println(
					"\nEnter 'q' to hang up.\n"
					+ "Enter 'f' to look up a flight by its number. "
					+ "Enter 'e' to look up all flights by a given employee.\n"
					+ "Enter 'h' to get connected to our service line.");

			System.out.print("> ");

			String command = scan.nextLine();

			if (command.startsWith("q")) {
				System.out.println("Thank you for calling us! Goodbye.");
				break;
			
			} else if (command.startsWith("h")) {
				System.out.println("Please hold the line! You call is very important to us.");
				break;
			
			} else if (command.startsWith("f")) {
				System.out.println("looking up a flight...");
				System.out.print("Enter flight number: > ");
				try {
					int flightNumber = scan.nextInt();
					Flight result = myAirport.getFlightByNumber(flightNumber);
					if (result != null) {
						System.out.println(result);
					} else {
						System.out.println("No flight found. Maybe you've entered an invalid number?");
					}
				} catch (InputMismatchException e) {
					System.out.println("No valid input.");
				}
				scan.nextLine();
			
			} else if (command.startsWith("e")) {
				System.out.println("looking up flights by employee...");
				System.out.print("Enter employee's personnel number: > ");
				try {
					int personnelNumber = scan.nextInt();
					Flight[][] flights = myAirport.getFlightsByEmployee(personnelNumber);
					if (flights != null) {
						System.out.println("Employee: " + myAirport.getEmployeeByNumber(personnelNumber));
						System.out.println("flights as pilot:" + Arrays.toString(flights[0]));
						System.out.println("flights as co-pilot: " + Arrays.toString(flights[1]));
					} else {
						System.out.println("no data found. Did you enter an invalid personnel number?");
					}
				} catch (InputMismatchException e) {
					System.out.println("no valid input.");
				}
				scan.nextLine();
			
			} else {
				System.out.println("no valid input.");
			}
		}
		
		scan.close();
	}

	private static void printFlightsForAllEmployees(Airport airport) {
		System.out.println("\nPrinting flights by employee for all employees:");
		System.out.println("----");
		for (Employee employee : airport.getEmployees()) {
			System.out.println("Printing flights for " + employee + ":");
			System.out.println(Arrays.deepToString(airport.getFlightsByEmployee(employee.getPersonnelNumber())));
			System.out.println("----");
		}
		System.out.println();
	}

	private static void generateFlights() {
		String[][] flightData = SampleDataProvider.getFlightData();
		flights = new Flight[flightData.length];
		for (int i = 0; i < flightData.length; i++) {
			String[] entry = flightData[i];
			LocalTime entryTime = LocalTime.of(Integer.parseInt(entry[0]), Integer.parseInt(entry[1]));
			flights[i] = new Flight(i + 1, entryTime, Integer.parseInt(entry[2]), entry[3], entry[4],
					employees[Integer.parseInt(entry[5])], employees[Integer.parseInt(entry[6])]);
		}
//		return flights;
	}

	private static void generateEmployees() {
		String[][] employeeData = SampleDataProvider.getEmployeeData();
//		System.out.println(Arrays.deepToString(employeeData));
//		System.out.println(employeeData[0][0]);
//		System.out.println(Arrays.toString(employeeData[0]));

		employees = new Employee[employeeData.length];
		for (int i = 0; i < employees.length; i++) {
			String[] currentEmployeeData = employeeData[i];
			employees[i] = new Employee(i + 1, currentEmployeeData[0], currentEmployeeData[1], currentEmployeeData[2],
					currentEmployeeData[3], currentEmployeeData[4], currentEmployeeData[5]);
		}
	}

}
