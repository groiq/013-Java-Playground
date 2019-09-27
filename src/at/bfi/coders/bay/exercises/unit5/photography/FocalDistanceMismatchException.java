/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   27.09.2019

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
