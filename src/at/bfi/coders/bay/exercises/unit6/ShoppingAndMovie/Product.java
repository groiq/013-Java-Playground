/**
 * 
 */
package at.bfi.coders.bay.exercises.unit6.ShoppingAndMovie;

/**
 * <h1>Product POJO</h1>
 * 
 * models a product with a name, manufacturer, department and price. I assume
 * that the name and manufacturer are constants, whereas department and price
 * can be set (by the store).
 * 
 * @author Hannes Alkin
 * @version
 * @since 09.10.2019
 */
public class Product {

	private final String name;
	private final String manufacturer;

	private String department;
	private double price;

	/**
	 * @param name
	 * @param manufacturer
	 * @param department
	 * @param price
	 */
	public Product(String name, String manufacturer, String department, double price) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.department = department;
		this.price = price;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

}
