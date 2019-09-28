/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

/**
 * @author groiq
 * @version
 * @since 27.08.2019
 * 
 */
public class Photo {

	private final String name;
	private final int megapixels;
	private final int width;
	private final int height;
	private final boolean greyscale;
	private final String motif;

	/**
	 * Creates a photo with a name (usually a sequential number), dimensions, color
	 * and motif.
	 * 
	 * @param name
	 * @param megapixels
	 * @param width
	 * @param height
	 * @param greyscale
	 * @param motif
	 */
	public Photo(String name, int megapixels, int width, int height, boolean greyscale, String motif) {
		this.name = name;
		this.megapixels = megapixels;
		this.width = width;
		this.height = height;
		this.greyscale = greyscale;
		this.motif = motif;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Image size in megapixels.
	 * 
	 * @return the megapixels
	 */
	public int getMegapixels() {
		return megapixels;
	}

	/**
	 * Image width in pixels.
	 * 
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Image height in pixels.
	 * 
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Color settings for the image. Returns true if the image is in greyscale,
	 * false if the image is in color.
	 * 
	 * @return the greyscale
	 */
	public boolean isGreyscale() {
		return greyscale;
	}

	/**
	 * A string describing the depicted motif.
	 * 
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	@Override
	public String toString() {
		return "A picture showing " + motif;
	}

	/**
	 * returns the full stats of the image
	 * 
	 * @return a string containing the image stats
	 */
	public String getFullStats() {
		return "Photo [name=" + name + ", megapixels=" + megapixels + ", width=" + width + ", height=" + height
				+ ", greyscale=" + greyscale + ", motif=" + motif + "]";
	}

}
