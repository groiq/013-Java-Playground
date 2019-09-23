package at.bfi.coders.bay.exercises.unit5.personal;

/*
 * Aufgabe: Person im Hauptprogramm erzeugen

 Klassenvariablen

    firstName
    lastName
    address
    age
    fullName
    und weise Ihnen Werte zu bis auf die Firmenadresse.

	 

	/* Konstanten

	* 

	* lege Konstanten für die komplette Firmenadresse an

	* Company, Address, Zip, City und Email (info@codersbay.at)
	*  und weise Ihnen Werte zu

	* 

	* Hinweis: final  String, final int ...

	* */

/*  Aufgabe:

*  1. Ausgabe der Personendaten

*  2. Leerzeile

*  3. Ausgabe der CompanyAddress

*  4. Leerzeile

*  5. Age setzen (+1)

*  6. Erneute Ausgabe der Personendaten

 */

public class Person1 {

	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private String fullName;

	private final String company;
	private final String companyAddress;
	private final int zip;
	private final String city;
	private final String email;

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		String[] names = fullName.split(" ");
		this.setAllNames(names[0], names[1]);
	}

	public void setFullName() {

	}

	public void setAllNames(String firstName, String lastName) {

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

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param age
	 * @param fullName
	 * @param company
	 * @param companyAddress
	 * @param zip
	 * @param city
	 * @param email
	 */
	public Person1(String firstName, String lastName, String address, int age, String company,
			String companyAddress, int zip, String city, String email) {
		this.setAllNames(firstName, lastName);
		this.address = address;
		this.age = age;
		this.company = company;
		this.companyAddress = companyAddress;
		this.zip = zip;
		this.city = city;
		this.email = email;
	}

//	public Person1(String firstName, String lastName, String address, int age, String company, String companyAddress,
//			int zip, String city, String email) {
//	}

	public static void main(String[] args) {
		
		Person1 p1 = new Person1("Max", "Mueller", "Solar City", 34, "Coders Bay", "Tabakfabrikstrasse 3", 4020, "Linz", "info@codersbay.at");
		
	}

}
