package at.bfi.assignments.sorters.tools;

import java.util.Arrays;

public class DataContainer {
	
	private final int[] unsortedArray;

	/**
	 * @return the unsortedArray
	 */
	public int[] getUnsortedArray() {
		int[] output = this.unsortedArray.clone();
		return output;
	}

	/**
	 * @param unsortedArray
	 */
	public DataContainer(int[] unsortedArray) {
		this.unsortedArray = unsortedArray;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Arrays.toString(unsortedArray);
	}
	
	

	


}
