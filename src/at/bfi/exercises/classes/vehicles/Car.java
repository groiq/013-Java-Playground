package at.bfi.exercises.classes.vehicles;

public class Car extends Vehicle {
	
	private int numSeats;
	private boolean isAwd; // AWD = all-wheel-drive = Allradantrieb
	
	public int getNumSeats() {
		return numSeats;
	}
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	public boolean isAwd() {
		return isAwd;
	}
	public void setAwd(boolean isAwd) {
		this.isAwd = isAwd;
	}
	
	public Car(int power, String manufacturer, String model, int yearOfRegistration, String county,
			String licenseNumber, int numSeats, boolean isAwd) {
		super(power, manufacturer, model, yearOfRegistration, county, licenseNumber);
		this.numSeats = numSeats;
		this.isAwd = isAwd;
	}
	
	@Override
	public String toString() {
		return "Car [numSeats=" + numSeats + ", isAwd=" + isAwd + ", power=" + power + ", manufacturer=" + manufacturer
				+ ", model=" + model + ", yearOfRegistration=" + yearOfRegistration + ", LicensePlate=" + LicensePlate
				+ "]";
	}
	
	

}
