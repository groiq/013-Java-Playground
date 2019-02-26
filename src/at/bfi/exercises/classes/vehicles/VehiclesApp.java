package at.bfi.exercises.classes.vehicles;

public class VehiclesApp {

	public static void main(String[] args) {
		
//		try {
//			Vehicle platonicVehicle = new Vehicle();
//			System.out.println("That's weird. I can create an instance of a supposedly abstract class.");
//		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println("Successfully prevented instantiating abstract class.");
//		}
//		// this doesn't even work
		
		// testing vehicle classes
		
		Car myCar = new Car(34, "Austin", "Mini", 1963, "L", "007", 4, false);
		Truck myTruck = new Truck(300, "VW", "Big Beetle", 1574, "L", "34535", 1400);
		
		System.out.println(myCar);
		System.out.println(myTruck);
		
		/*
		 * create test objects for statistics exercise
		 * 
		 * testing:
		 * - average power
		 * - number of vehicles per county
		 * - for cars: ranking of number of seats
		 * 
		 * So, two cars with 5 seats, two with 4 seats.
		 * That's three, throw in one truck.
		 * Three vehicles in L, one in LL.
		 * 
		 * powers: 2,4,6 and 8, that averages to 5.
		 * 
		 * Other fields are filled with dummy values.
		 * 
		 * 
		 */

		

	}

}
