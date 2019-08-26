/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.nightOutExtended;

/**
 * @author  groiq
 * @version 
 * @since   26.08.2019

 */
public abstract class Location {
	
	private final String name;
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	



	/**
	 * @param name
	 */
	public Location(String name) {
		this.name = name;
	}





	@Override
	public String toString() {
		return name;
	}

	public abstract boolean orderDrink(Celebrant celebrant);




	public abstract void host(Celebrant celebrant); 

}
