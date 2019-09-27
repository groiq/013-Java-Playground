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
	private final double displaySize;
	private final boolean isStable;
	private final String brand;
	private Objective objective;
	private boolean setToGreyscale = false;
	private List<Photo> photoLibrary;

	/*
	 * next milestone: a subclass that only does greyscale; import pics from a
	 * camera; have a camera plug into an existing photo library
	 */

	
	/**
	 * Create a camera with a swappable objective
	 * @param megaPixel
	 * @param displaySize
	 * @param isStable
	 * @param brand
	 */
	public Camera(int megaPixel, double displaySize, boolean isStable, String brand) {
		this.megaPixel = megaPixel;
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

	@Override
	public String toString() {
		return brand;
	}

	
	public String getFullStats() {
		return "Camera [megaPixel=" + megaPixel + ", displaySize=" + displaySize + ", isStable=" + isStable + ", brand="
				+ brand + ", " + objective + "]";
	}

}
