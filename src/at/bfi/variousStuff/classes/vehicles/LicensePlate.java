package at.bfi.variousStuff.classes.vehicles;

public class LicensePlate {
	
	protected final String county; // fun: replace with an enum
	protected final String number;
	public String getCounty() {
		return county;
	}
	public String getId() {
		return number;
	}
	
	public LicensePlate(String districtSign, String id) {
		super();
		this.county = districtSign;
		this.number = id;
	}
	
	@Override
	public String toString() {
//		return "LicensePlate [districtSign=" + districtSign + ", id=" + id + "]";
		return county + "-" + number;
	}
	
	

}
