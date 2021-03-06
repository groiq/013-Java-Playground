package at.bfi.coders.bay.exercises.unit5.personal.personnelManagement;

/**
 * Aufgabe: Person im Hauptprogramm erzeugen<br>
 * <br>
 * Klassenvariablen<br>
 * firstName<br>
 * lastName<br>
 * address<br>
 * age<br>
 * fullName<br>
 * und weise Ihnen Werte zu bis auf die Firmenadresse.<br>
 * <br>
 * Konstanten<br>
 * <br>
 * lege Konstanten f�r die komplette Firmenadresse an<br>
 * Company, Address, Zip, City und Email (info@codersbay.at)<br>
 * und weise Ihnen Werte zu<br>
 * <br>
 * Hinweis: final String, final int ...<br>
 * <br>
 * 1. Ausgabe der Personendaten via Methode printPersonData()<br>
 * 2. Leerzeile<br>
 * 3. Ausgabe der Firmenadresse<br>
 * 4. Leerzeile<br>
 * 5. setzen der Firmenadresse via Methode setCompanyAddress()<br>
 * 6. Erneute Ausgabe der Firmenadresse<br>
 * 7. Leerzeile<br>
 * 8. Alter setzen (+1) via Methode setAge()<br>
 * 9. Erneute Ausgabe der Personendaten via Methode printPersonData()<br>
 * 
 * @author Hannes Alkin
 * @version 1.0
 * @since 23.09.2019
 */
public class Person {

	private String firstName;
	private String lastName;
	private String privateAddress;
	private int age;

	private final String company;
	private final String companyAddress;
	private final int zip;
	private final String city;
	private final String email;

	/**
	 * Creates a person with private data and company data.
	 * @param firstName
	 * @param lastName
	 * @param privateAddress
	 * @param age
	 * @param fullName
	 * @param company
	 * @param companyAddress
	 * @param zip
	 * @param city
	 * @param email
	 */
	public Person(String firstName, String lastName, String privateAddress, int age, String company,
			String companyAddress, int zip, String city, String email) {
		this.setAllNames(firstName, lastName);
		this.privateAddress = privateAddress;
		this.age = age;
		this.company = company;
		this.companyAddress = companyAddress;
		this.zip = zip;
		this.city = city;
		this.email = email;
	}

	/**
	 * Creates a person with private data only, assuming the company is the coders.bay.
	 * @param firstName
	 * @param lastName
	 * @param privateAddress
	 * @param age
	 */
	public Person(String firstName, String lastName, String privateAddress, int age) {
		this(firstName, lastName, privateAddress, age, "Coders Bay", "Tabakfabrikstrasse 3", 4020, "Linz",
				"info@codersbay.at");
	}

	/**
	 * @return the privateAddress
	 */
	public String getPrivateAddress() {
		return privateAddress;
	}

	/**
	 * @param privateAddress the privateAddress to set
	 */
	public void setPrivateAddress(String privateAddress) {
		this.privateAddress = privateAddress;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return the fullName
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		String[] names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[1];
	}

	/**
	 * set first name, last name and full name
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public void setAllNames(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @return the companyAddress
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}

	/**
	 * @return the full company address
	 */
	public String getFullCompanyAddress() {
		return "works at: " + company + ", " + companyAddress + ", " + zip + " " + city + ", mail: " + email;
	}

	/**
	 * catch attempts to tinker with the company address
	 * 
	 * @param address
	 */
	public void setCompanyAddress(String address) {
		System.out.println("[setting company address to \"" + address + "\"...]");
		System.out.println("Error: Company address is final. Aborting.");
	}

	/**
	 * @return the private data as a String
	 */
	public String getPersonData() {
		return (getFullName() + ", " + getAge() + " years, " + getPrivateAddress());
	}

	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Person1 [firstName=" + firstName + ", lastName=" + lastName + ", full name=" + getFullName()
				+ ", address=" + privateAddress + ", age=" + age + ", company=" + company + ", companyAddress="
				+ companyAddress + ", zip=" + zip + ", city=" + city + ", email=" + email + "]";
	}


}
