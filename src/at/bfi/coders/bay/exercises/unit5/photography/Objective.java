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

	private final int focalDistanceMin;
	private final int focalDistanceMax;
	private int focalDistance;

	public Objective(int focalDistanceMin, int focalDistanceMax) {
		this.focalDistanceMin = focalDistanceMin;
		this.focalDistanceMax = focalDistanceMax;
		this.focalDistance = focalDistanceMin;
	}
	
	/**
	 * @return the focalDistance
	 */
	public int getFocalDistance() {
		return focalDistance;
	}

	/**
	 * @param focalDistance the focalDistance to set
	 */
	public void setFocalDistance(int newFocalDistance) {
		if (newFocalDistance < focalDistanceMin) {
			System.out.println("focal distance must be at least " + focalDistanceMin + ".");
		} else if (newFocalDistance > focalDistanceMax) {
			System.out.println("focal distance cannot be more than " + focalDistanceMax + ".");
		} else {
			this.focalDistance = newFocalDistance;
		}
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



	@Override
	public String toString() {
		return "objective with focal distance " + focalDistanceMin + "-" + focalDistanceMax + ", currently set to "
				+ focalDistance + ".";
	}

}
