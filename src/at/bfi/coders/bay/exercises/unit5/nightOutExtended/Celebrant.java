/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.nightOutExtended;

/**
 * @author  groiq
 * @version 
 * @since   26.08.2019

 */
public class Celebrant {
	
	private final String name;
	private final Home home;
	
	private Location location;
	private int glassesDrunk;
	private double glassContents;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Celebrant(String name) {
		this.name = name.toUpperCase();
		this.home = new Home(name.toUpperCase() + "'S HOME");
		this.location = this.home;
		this.glassesDrunk = 0;
		this.glassContents = 0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the home
	 */
	public Home getHome() {
		return home;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	
	public void goTo(Location newLocation) {
		this.location = newLocation;
		newLocation.host(this);
	}
	
	/**
	 * @return the glassesDrunk
	 */
	public int getGlassesDrunk() {
		return glassesDrunk;
	}
	
	/**
	 * @return the glassContents
	 */
	public double getGlassContents() {
		return glassContents;
	}
	
	// drink() method
	// check glass, order

	public void drink(double amount) {
		if (amount < glassContents) {
			System.out.println(name + " drinks " + amount + " ml.");
			glassContents -= amount;
		} else {
			System.out.println(name + " drinks up.");
			amount -= glassContents;
			glassesDrunk++;
			if (amount > 0) {
				try {
//					location.orderDrink();
				} catch (Exception e) {
					
				}
			}
		}
	}
	
	
	@Override
	public String toString() {
		return name + " is currently at " + location.getName().toUpperCase() + " with " 
				+ glassesDrunk + " glasses too many.";
	}
	
	
	
}
