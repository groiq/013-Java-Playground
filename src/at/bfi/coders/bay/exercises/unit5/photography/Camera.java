/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Camera sim</h1>
 * 
 * Simulates a simple camera.
 * 
 * @author groiq
 * @version
 * @since 27.08.2019
 * 
 */
public class Camera {

	private final int megaPixel;
	private final int picWidth;
	private final int picHeight;
	private final double displaySize;
	private final boolean isStable;
	private final String brand;
	private final Objective objective;
	private boolean setToGreyscale = false;
	private final List<Photo> photoLibrary;

	/*
	 * next milestone: a subclass that only does greyscale; import pics from a
	 * camera; have a camera plug into an existing photo library
	 */

	/**
	 * Create a new camera
	 * 
	 * @param picWidth
	 * @param picHeight
	 * @param displaySize
	 * @param isStable
	 * @param brand
	 */
	public Camera(int picWidth, int picHeight, double displaySize, boolean isStable, String brand) {
		this.picWidth = picWidth;
		this.picHeight = picHeight;
		this.megaPixel = picWidth * picHeight / 1000000;
		this.displaySize = displaySize;
		this.isStable = isStable;
		this.brand = brand;

		this.photoLibrary = new ArrayList<Photo>();
		this.objective = new Objective();

	}

	/**
	 * the image size in megapixel. Currently image sizes are unalterable.
	 * 
	 * @return the megaPixel
	 */
	public int getMegaPixel() {
		return megaPixel;
	}

	/**
	 * The image height in pixel.
	 * 
	 * @return the picWidth
	 */
	public int getPicWidth() {
		return picWidth;
	}

	/**
	 * the image height in pixel.
	 * 
	 * @return the picHeight
	 */
	public int getPicHeight() {
		return picHeight;
	}

	/**
	 * @return the displaySize
	 */
	public double getDisplaySize() {
		return displaySize;
	}

	/**
	 * Checks whether a camera has an image stabilizer.
	 * 
	 * @return the isStable
	 */
	public boolean isStable() {
		return isStable;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Checks the color settings. Returns true if the camera is set to greyscale,
	 * false if it is set to full color.
	 * 
	 * @return the setToGreyscale
	 */
	public boolean isSetToGreyscale() {
		return setToGreyscale;
	}

	/**
	 * Controls color settings. Sets the color to greyscale if true, to full color
	 * if false.
	 * 
	 * @param setToGreyscale the setToGreyscale to set
	 */
	public void setSetToGreyscale(boolean setToGreyscale) {
		this.setToGreyscale = setToGreyscale;
	}

	/**
	 * toggles color settings between full color and greyscale. toggle color setting
	 * between color and greyscale
	 */
	public void toggleColorSetting() {
		this.setToGreyscale = !this.setToGreyscale;
	}

	/**
	 * the objective mounted on the camera.
	 * 
	 * @return the objective
	 */
	public Objective getObjective() {
		return objective;
	}

	/**
	 * @return the photoLibrary
	 */
	public List<Photo> getPhotoLibrary() {
		return photoLibrary;
	}

	@Override
	public String toString() {
		return brand;
	}

	public String getFullStats() {
		return "Camera [megaPixel=" + megaPixel + ", picWidth=" + picWidth + ", picHeight=" + picHeight
				+ ", displaySize=" + displaySize + ", isStable=" + isStable + ", brand=" + brand + ", " + objective
				+ "]";
	}

	/**
	 * Creates a photo object, using the String passed as the picture motif together
	 * with the (current) settings for image size and color, and adds it to the
	 * included photo library.
	 * 
	 * @param motif
	 */
	public void takePhoto(String motif) {
		int counter = photoLibrary.size();
		String name = String.format("DSCN-%03d.jpg", counter);
		Photo newPic = new Photo(name, megaPixel, picWidth, picHeight, setToGreyscale, motif);
		photoLibrary.add(newPic);
		System.out.println("Click!");

	}

	/**
	 * Creates a photo object with a default motif string and adds it to the
	 * included photo library.
	 */
	public void takePhoto() {
		takePhoto("Words don't do the motif justice.");
	}

	/**
	 * Prints the descriptions of all photos in the photo library.
	 */
	public void slideshow() {
		System.out.println("> view all pictures on your camera...");
		for (Photo photo : photoLibrary) {
			System.out.println(photo);
		}
	}

	/**
	 * Prints full stats for all photos in the photo library.
	 */
	public void viewPhotoStats() {
		System.out.println("> review stats for all pictures on your camera...");
		for (Photo photo : photoLibrary) {
			System.out.println(photo.getFullStats());
		}
	}

}
