/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

/**
 * Exception to be thrown on trying to set focal distances when minimum focal
 * distance is not smaller than maximum focal distance. Contains fields for the
 * minimum and maximum focal distance.
 * 
 * @author Hannes Alkin
 * @version
 * @since 27.09.2019
 * 
 */
public class FocalDistanceMismatchException extends Exception {

	private final int focalDistanceMin;
	private final int focalDistanceMax;

	/**
	 * @param focalDistanceMin
	 * @param focalDistanceMax
	 */
	public FocalDistanceMismatchException(int focalDistanceMin, int focalDistanceMax) {
		super("minimal focal distance must be smaller than maximal focal distance");
		this.focalDistanceMin = focalDistanceMin;
		this.focalDistanceMax = focalDistanceMax;
	}

	/**
	 * @return the focalDistanceMin
	 */
	public int getFocalDistanceMin() {
		return focalDistanceMin;
	}

	/**
	 * @return the focalDistanceMax
	 */
	public int getFocalDistanceMax() {
		return focalDistanceMax;
	}

}
