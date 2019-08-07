package at.bfi.coders.bay.exercises.unit2._2;

public class DeclareVariables {
	
	// Fields
	boolean sampleBool;
	int sampleInt;
	String sampleString;
	double sampleDouble;
	boolean isMarried;
	
	// Constructor
	public DeclareVariables(boolean sampleBool, int sampleInt, String sampleString, double sampleDouble) {
		super();
		this.sampleBool = sampleBool;
		this.sampleInt = sampleInt;
		this.sampleString = sampleString;
		this.sampleDouble = sampleDouble;
		// let's assume each object starts its life single
		this.isMarried = false;
	}

	// Getters and Setters
	
	public boolean isSampleBool() {
		return sampleBool;
	}

	public void setSampleBool(boolean sampleBool) {
		this.sampleBool = sampleBool;
	}


	public int getSampleInt() {
		return sampleInt;
	}

	public void setSampleInt(int sampleInt) {
		this.sampleInt = sampleInt;
	}

	public String getSampleString() {
		return sampleString;
	}

	public void setSampleString(String sampleString) {
		this.sampleString = sampleString;
	}

	public double getSampleDouble() {
		return sampleDouble;
	}

	public void setSampleDouble(double sampleDouble) {
		this.sampleDouble = sampleDouble;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	// marriage status as a string
	public String getMarriageStatus() {
		if (isMarried) {
			return "married";
		} else {
			return "unmarried";
		}
	}
	
	public void setMarriageStatus(String newStatus) {
		if (newStatus == "married") {
			setMarried(true);
		} else if (newStatus == "unmarried") {
			setMarried(false);
		} else {
			// for later: throw an exception
		}
	}

	// toString
	
	@Override
	public String toString() {
		return ("a boolean: " + sampleBool + ", an int: " + sampleInt + ", a String: " + sampleString + ", a double: " + sampleDouble + ".");
	}
	
	

}
