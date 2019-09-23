package at.bfi.coders.bay.exercises.unit5.personal.person1;

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

public class Person {

	static boolean debug = false;

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
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.privateAddress = address;
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
	 * @return the address
	 */
	public String getAddress() {
		return privateAddress;
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
	public Person(String firstName, String lastName, String address, int age, String company, String companyAddress,
			int zip, String city, String email) {
		this.setAllNames(firstName, lastName);
		this.privateAddress = address;
		this.age = age;
		this.company = company;
		this.companyAddress = companyAddress;
		this.zip = zip;
		this.city = city;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person1 [firstName=" + firstName + ", lastName=" + lastName + ", full name=" + getFullName()
				+ ", address=" + privateAddress + ", age=" + age + ", company=" + company + ", companyAddress="
				+ companyAddress + ", zip=" + zip + ", city=" + city + ", email=" + email + "]";
	}

	private void testPrintName() {
		System.out.println(
				"firstName: " + firstName + ", last name: " + lastName + ", full name: " + getFullName() + ".");
	}

	private static void testNameMechanics() {
		Person tester = new Person("Max", "Mueller", "Solar City", 34, "Coders Bay", "Tabakfabrikstrasse 3", 4020,
				"Linz", "info@codersbay.at");
		System.out.println();
		System.out.println("testing name handling...");
		tester.testPrintName();
		System.out.println("changing first name...");
		tester.setFirstName("Moritz");
		tester.testPrintName();
		System.out.println("changing last name...");
		tester.setLastName("Meier");
		tester.testPrintName();
		System.out.println("changing full name");
		tester.setFullName("Josef Berger");
		tester.testPrintName();
		System.out.println();
	}

	public static void main(String[] args) {

		if (debug) {
			testNameMechanics();
		}

		Person p1 = new Person("Max", "Mueller", "Solar City", 34, "Coders Bay", "Tabakfabrikstrasse 3", 4020, "Linz",
				"info@codersbay.at");

		System.out.println(p1.getFullName() + ", " + p1.getAge() + " years, " + p1.getAddress());
		System.out.println();
		System.out.println("works at: " + p1.getCompany() + ", " + p1.getCompanyAddress() + ", " + p1.getZip() + " "
				+ p1.getCity() + ", mail: " + p1.getEmail());
		System.out.println();
		
		p1.setAge(p1.getAge() + 1);
		System.out.println(p1.getFullName() + ", " + p1.getAge() + " years, " + p1.getAddress());
		
	}

}
