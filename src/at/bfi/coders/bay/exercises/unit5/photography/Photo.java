/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

/**
 * @author  groiq
 * @version 
 * @since   27.08.2019

 */
public class Photo {
	
	private final String name;
	private final int megapixels;
	private final boolean greyscale;
	
	public Photo(String name, int megapixels, boolean greyscale) {
		this.name = name;
		this.megapixels = megapixels;
		this.greyscale = greyscale;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the megapixels
	 */
	public int getMegapixels() {
		return megapixels;
	}

	/**
	 * @return the greyscale
	 */
	public boolean isGreyscale() {
		return greyscale;
	}
	
	

}
