package at.bfi.exercises.classes.vehicles;

public abstract class Vehicle {
	
	protected int power;
	protected String manufacturer;
	protected String model;
	protected int yearOfRegistration;
	protected LicensePlate LicensePlate;
	
	
	
	
	public Vehicle(int power, String manufacturer, String model, int yearOfRegistration,
			String county, String licenseNumber) {
		super();
		this.power = power;
		this.manufacturer = manufacturer;
		this.model = model;
		this.yearOfRegistration = yearOfRegistration;
		this.LicensePlate = new LicensePlate(county, licenseNumber);
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfRegistration() {
		return yearOfRegistration;
	}
	public void setYearOfRegistration(int yearOfRegistration) {
		this.yearOfRegistration = yearOfRegistration;
	}
	public LicensePlate getLicensePlate() {
		return LicensePlate;
	}
	public void setLicensePlate(LicensePlate licensePlate) {
		LicensePlate = licensePlate;
	}

	@Override
	public String toString() {
		return "Vehicle [power=" + power + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", yearOfRegistration=" + yearOfRegistration + ", LicensePlate=" + LicensePlate + "]";
	}
	
	
	
	

}
