package at.bfi.coders.bay.exercises.unit6.flughafen._1;

/**
 * 
 * 
 * @author  Hannes Alkin
 * @version 
 * @since   28.10.2019

 */
public class Employee {
	
	private int personnelNumber;
	private String firstName;
	private String lastName;
	private String street;
	private String zip;
	private String phonenumber;
	private String email;
	
	/**
	 * @param personnelNumber
	 * @param firstName
	 * @param lastName
	 * @param street
	 * @param zip
	 * @param phonenumber
	 * @param email
	 */
	public Employee(int personnelNumber, String firstName, String lastName, String street, String zip,
			String phonenumber, String email) {
		this.personnelNumber = personnelNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.zip = zip;
		this.phonenumber = phonenumber;
		this.email = email;
	}

	/**
	 * @return the personnelNumber
	 */
	public int getPersonnelNumber() {
		return personnelNumber;
	}

	/**
	 * @param personnelNumber the personnelNumber to set
	 */
	public void setPersonnelNumber(int personnelNumber) {
		this.personnelNumber = personnelNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public String toStringRaw() {
		return "Employee [personnelNumber=" + personnelNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", street=" + street + ", zip=" + zip + ", phonenumber=" + phonenumber + ", email=" + email + "]";
	}
	
	

}
