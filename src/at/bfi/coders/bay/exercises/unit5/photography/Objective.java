/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.photography;

/**
 * <h1>Objective sim</h1>
 * 
 * simulates an objective for a camera.
 * 
 * @author  groiq
 * @version 
 * @since   27.08.2019
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
	 * @param focalDistanceMin the focalDistanceMin to set
	 */
	public void setFocalDistanceMin(int focalDistanceMin) {
		this.focalDistanceMin = focalDistanceMin;
	}
	/**
	 * @return the focalDistanceMax
	 */
	public int getFocalDistanceMax() {
		return focalDistanceMax;
	}
	/**
	 * @param focalDistanceMax the focalDistanceMax to set
	 */
	public void setFocalDistanceMax(int focalDistanceMax) {
		this.focalDistanceMax = focalDistanceMax;
	}
	
	public int[] getFocalDistance() {
		return new int[] {focalDistanceMin,focalDistanceMax};
	}
	
	public void setFocalDistance(int focalDistanceMin, int focalDistanceMax) {
		this.focalDistanceMin = focalDistanceMin;
		this.focalDistanceMax = focalDistanceMax;
	}
	
	public Objective(int focalDistanceMin, int focalDistanceMax) {
		this.focalDistanceMin = focalDistanceMin;
		this.focalDistanceMax = focalDistanceMax;
	}
//	@Override
//	public String toString() {
//		return "Objective [focalDistanceMin=" + focalDistanceMin + ", focalDistanceMax=" + focalDistanceMax + "]";
//	}
	
	@Override
	public String toString() {
		return "objective with focal distance " + focalDistanceMin + "-" + focalDistanceMax;
	}

}
