/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

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
	private final int displaySize;
	private final boolean isStable;
	private final String brand;
	private final boolean objectiveSwappable;
	private Objective objective;
	private boolean setToGreyscale = false;
	private List<Photo> photoLibrary;
	

	// TODO modularize those constructors; add constructors handling photolibrary
	public Camera(int megaPixel, int displaySize, boolean isStable, String brand) {
		this.megaPixel = megaPixel;
		this.displaySize = displaySize;
		this.isStable = isStable;
		this.brand = brand;
		this.objectiveSwappable = true;
		this.objective = null;
	}

	public Camera(int megaPixel, int displaySize, boolean isStable, String brand, int focalDistanceMin,
			int focalDistanceMax) {
		this.megaPixel = megaPixel;
		this.displaySize = displaySize;
		this.isStable = isStable;
		this.brand = brand;
		this.objectiveSwappable = false;
		this.objective = new Objective(focalDistanceMin, focalDistanceMax);
	}

	/**
	 * @return the objective
	 */
	public Objective getObjective() {
		return objective;
	}

	/**
	 * @param objective the objective to set
	 */
	public void setObjective(Objective objective) {
		if (objectiveSwappable) {
			this.objective = objective;
		} else {
			System.out.println(
					"This camera doesn't have a swappable objective. "
					+ "Removing the objective will void the warranty.");
		}
	}

	public void setObjective() {
		this.setObjective(null);
	}

	public void removeObjective() {
		this.setObjective(null);
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
	public int getDisplaySize() {
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
	 * @return the objectiveSwappable
	 */
	public boolean isObjectiveSwappable() {
		return objectiveSwappable;
	}

//	public String getColorSetting() {
//		return setToGreyscale ? "greyscale" : "color";
//	}
//
//	public void setColorSetting(String colorSetting) {
//		System.out.println(
//				"String recognition for this function not implemented. "
//				+ "Color setting unchanged. "
//				+ "Please try setting the setToGreyscale attribute instead.");
//	}
	
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
	
	public void toggleColorSetting() {
		this.setToGreyscale = !this.setToGreyscale;
	}

	@Override
	public String toString() {
		return "Camera [megaPixel=" + megaPixel + ", displaySize=" + displaySize + ", isStable=" + isStable + ", brand="
				+ brand + ", objectiveSwappable=" + objectiveSwappable + ", objective=" + objective + "]";
	}

}
