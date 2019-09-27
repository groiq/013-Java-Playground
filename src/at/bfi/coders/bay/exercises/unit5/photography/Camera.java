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
	 * @return the megaPixel
	 */
	public int getMegaPixel() {
		return megaPixel;
	}

	/**
	 * @return the picWidth
	 */
	public int getPicWidth() {
		return picWidth;
	}

	/**
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
	 * @return the setToGreyscale
	 */
	public boolean isSetToGreyscale() {
		return setToGreyscale;
	}

	/**
	 * @param setToGreyscale the setToGreyscale to set
	 */
	public void setSetToGreyscale(boolean setToGreyscale) {
		this.setToGreyscale = setToGreyscale;
	}

	/**
	 * toggle color setting between color and greyscale
	 */
	public void toggleColorSetting() {
		this.setToGreyscale = !this.setToGreyscale;
	}

	/**
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


	public void takePhoto(String motif) {
		int counter = photoLibrary.size();
		String name = String.format("DSCN-%03d.jpg", counter);
//		System.out.println(name);
		Photo newPic = new Photo(name, megaPixel, picWidth, picHeight, setToGreyscale, motif);
		photoLibrary.add(newPic);
		System.out.println("Click!");

	}

	public void takePhoto() {
		takePhoto("Words don't do the motif justice.");
	}

	public void slideshow() {
		System.out.println("> view all pictures on your camera...");
		for (Photo photo : photoLibrary) {
			System.out.println(photo);
		}
	}

	public void viewPhotoStats() {
		System.out.println("> review stats for all pictures on your camera...");
		for (Photo photo : photoLibrary) {
			System.out.println(photo.getFullStats());
		}
	}

}
