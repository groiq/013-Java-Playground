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
		checkPower(power);
		this.power = power;
		checkManufacturer(manufacturer);
		this.manufacturer = manufacturer;
		checkModel(model);
		this.model = model;
		checkYearOfRegistration(yearOfRegistration);
		this.yearOfRegistration = yearOfRegistration;
		this.LicensePlate = new LicensePlate(county, licenseNumber);
	}
	
	private void checkYearOfRegistration(int yearOfRegistration2) {
		// TODO Auto-generated method stub
		
	}

	private void checkModel(String model2) {
		// TODO Auto-generated method stub
		
	}

	private void checkManufacturer(String manufacturer2) {
		// TODO Auto-generated method stub
		
	}

	private void checkPower(int power2) {
		// TODO Auto-generated method stub
		
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
