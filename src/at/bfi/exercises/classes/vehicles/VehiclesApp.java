package at.bfi.exercises.classes.vehicles;

import java.util.Arrays;

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

		Car v0 = new Car(2, "0", "0", 1271, "LL", "0", 5, true);
		Car v1 = new Car(4, "1", "1", 1271, "L", "1", 5, false);
		Car v2 = new Car(6, "2", "2", 1271, "L", "2", 4, false);
		Truck v3 = new Truck(8, "3", "3", 1271, "L", "3", 5);
		Vehicle[] vehicles = {v0,v1,v2,v3};
		System.out.println(Arrays.toString(vehicles));
//		VehicleStatistics vehicleStats = new VehicleStatistics(vehicles);
		

	}

}
