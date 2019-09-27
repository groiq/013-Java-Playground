/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

/**
 * <h1>Objective sim</h1>
 * 
 * simulates an objective for a camera.
 * 
 * @author groiq
 * @version
 * @since 27.08.2019
 */
public class Objective {

	private int focalDistanceMin;
	private int focalDistanceMax;
	
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

	/**
	 * returns the minimal and maximal focal distance as a two-element integer array.
	 * @return the focal distances
	 */
	public int[] getFocalDistance() {
		return new int[] {focalDistanceMin, focalDistanceMax};
	}
	
	
	
	/**
	 * @param focalDistanceMin the focalDistanceMin to set
	 */
	public void setFocalDistanceMin(int focalDistanceMin) throws FocalDistanceMismatchException {
		if (focalDistanceMin < this.focalDistanceMax) {
			this.focalDistanceMin = focalDistanceMin;
		} else {
			throw new FocalDistanceMismatchException(focalDistanceMin, this.focalDistanceMax);
		}
	}

	/**
	 * @param focalDistanceMax the focalDistanceMax to set
	 */
	public void setFocalDistanceMax(int focalDistanceMax) throws FocalDistanceMismatchException {
		if (focalDistanceMax > this.focalDistanceMin) {
			this.focalDistanceMax = focalDistanceMax;
		} else {
			throw new FocalDistanceMismatchException(this.focalDistanceMin, focalDistanceMax);
		}
	}

	/**
	 * sets minimum and maximum focal distance simulaneously
	 * @param newMin
	 * @param newMax
	 * @throws FocalDistanceMismatchException
	 */
	public void setFocalDistance(int newMin, int newMax) throws FocalDistanceMismatchException {
		if (newMin < newMax) {
			this.focalDistanceMin = newMin;
			this.focalDistanceMax = newMax;
		} else {
			throw new FocalDistanceMismatchException(newMin, newMax);
		}
	}
	


	@Override
	public String toString() {
		return "focal distance set to " + focalDistanceMin + "-" + focalDistanceMax + ".";
	}

}
