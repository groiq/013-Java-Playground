package at.bfi.coders.bay.exercises.unit6.flughafen._1;

import java.time.LocalTime;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   28.10.2019

 */
public class Flight {
	
	private int flightNumber;
	private LocalTime departure;
	private int flightDuration;
	private String departureGate;
	private String arrivalGate;
	private Employee pilot;
	private Employee coPilot;
	
	/**
	 * @param flightNumber
	 * @param departure
	 * @param flightDuration
	 * @param departureGate
	 * @param arrivalGate
	 * @param pilot
	 * @param coPilot
	 */
	public Flight(int flightNumber, LocalTime departure, int flightDuration, String departureGate, String arrivalGate,
			Employee pilot, Employee coPilot) {
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.flightDuration = flightDuration;
		this.departureGate = departureGate;
		this.arrivalGate = arrivalGate;
		this.pilot = pilot;
		this.coPilot = coPilot;
	}

	/**
	 * @return the flightNumber
	 */
	public int getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the departure
	 */
	public LocalTime getDeparture() {
		return departure;
	}

	/**
	 * @param departure the departure to set
	 */
	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}

	/**
	 * @return the flightDuration
	 */
	public int getFlightDuration() {
		return flightDuration;
	}

	/**
	 * @param flightDuration the flightDuration to set
	 */
	public void setFlightDuration(int flightDuration) {
		this.flightDuration = flightDuration;
	}

	/**
	 * @return the departureGate
	 */
	public String getDepartureGate() {
		return departureGate;
	}

	/**
	 * @param departureGate the departureGate to set
	 */
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}

	/**
	 * @return the arrivalGate
	 */
	public String getArrivalGate() {
		return arrivalGate;
	}

	/**
	 * @param arrivalGate the arrivalGate to set
	 */
	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	/**
	 * @return the pilot
	 */
	public Employee getPilot() {
		return pilot;
	}

	/**
	 * @param pilot the pilot to set
	 */
	public void setPilot(Employee pilot) {
		this.pilot = pilot;
	}

	/**
	 * @return the coPilot
	 */
	public Employee getCoPilot() {
		return coPilot;
	}

	/**
	 * @param coPilot the coPilot to set
	 */
	public void setCoPilot(Employee coPilot) {
		this.coPilot = coPilot;
	}

	@Override
	public String toString() {
		return "Flight #" + flightNumber + " at " + departure + ", pilot: " + pilot + ", co-pilot: " + coPilot;
	}
	
	public String toStringRaw() {
		return "Flight [flightNumber=" + flightNumber + ", departure=" + departure + ", flightDuration="
				+ flightDuration + ", departureGate=" + departureGate + ", arrivalGate=" + arrivalGate + ", pilot="
				+ pilot.toStringRaw() + ", coPilot=" + coPilot.toStringRaw() + "]";
	}
	
	

}
