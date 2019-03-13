package at.bfi.variousStuff.classes.vehicles;

public class Truck extends Vehicle {
	
	private int loadCapacity;

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	/**
	 * @param power
	 * @param manufacturer
	 * @param model
	 * @param yearOfRegistration
	 * @param county
	 * @param licenseNumber
	 * @param loadCapacity
	 */
	public Truck(int power, String manufacturer, String model, int yearOfRegistration, String county,
			String licenseNumber, int loadCapacity) {
		super(power, manufacturer, model, yearOfRegistration, county, licenseNumber);
		this.loadCapacity = loadCapacity;
	}
	
	

}
