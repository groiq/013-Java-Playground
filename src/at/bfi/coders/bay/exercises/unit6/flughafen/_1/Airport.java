package at.bfi.coders.bay.exercises.unit6.flughafen._1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   28.10.2019

 */
public class Airport {
	
	private final Employee[] employees;
	private final Flight[] flights;
	
	/**
	 * @param employees
	 * @param flights
	 */
	public Airport(Employee[] employees, Flight[] flights) {
		this.employees = employees;
		this.flights = flights;
	}
	
	/**
	 * @return the employees
	 */
	public Employee[] getEmployees() {
		return employees;
	}
	/**
	 * @return the flights
	 */
	public Flight[] getFlights() {
		return flights;
	}
	
	public Flight getFlightByNumber(int flightNumber) {
		int flightIndex = flightNumber - 1;
		try {
			return flights[flightIndex];
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public Flight[][] getFlightsByEmployee(int employeeNumber) {
		int employeeIndex = employeeNumber - 1;
		Employee employee;
		try {
			employee = employees[employeeIndex];
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
		Flight[][] result = new Flight[2][];
		List<Flight> asPilot = new ArrayList<Flight>();
		List<Flight> asCoPilot = new ArrayList<Flight>();
		
		for (Flight flight : flights) {
			if (flight.getPilot() == employee) {
				asPilot.add(flight);
			}
			if (flight.getCoPilot() == employee) {
				asCoPilot.add(flight);
			}
		}
		
		result[0] = (Flight[]) asPilot.toArray(new Flight[asPilot.size()]);
		result[1] = (Flight[]) asCoPilot.toArray(new Flight[asCoPilot.size()]);
		
		return result;
	}
	
	public Employee getEmployeeByNumber(int employeeNumber) {
		Employee result = null;
		int employeeIndex = employeeNumber - 1;
		try {
			result = employees[employeeIndex];
		} catch (IndexOutOfBoundsException e) {
			result = null;
		}
		return result;
	}

}
