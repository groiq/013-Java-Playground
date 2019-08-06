package at.bfi.coders.bay.exercises.unit2._2;

public class DeclareVariables {
	
	boolean sampleBool;
	int sampleInt;
	String sampleString;
	double sampleDouble;
	
	

	public DeclareVariables(boolean sampleBool, int sampleInt, String sampleString, double sampleDouble) {
		super();
		this.sampleBool = sampleBool;
		this.sampleInt = sampleInt;
		this.sampleString = sampleString;
		this.sampleDouble = sampleDouble;
	}

	


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

	@Override
	public String toString() {
		return ("a boolean: " + sampleBool + ", an int: " + sampleInt + ", a String: " + sampleString + ", a double: " + sampleDouble + ".");
	}




}
