package at.bfi.assignments.sorters;

class DataContainer {
	
	private static int[] unsortedArray;

	/**
	 * @return the unsortedArray
	 */
	public static int[] getUnsortedArray() {
		int[] output = unsortedArray.clone();
		return output;
	}

	/**
	 * @param unsortedArray the unsortedArray to set
	 */
	public static void setUnsortedArray(int[] unsortedArray) {
		DataContainer.unsortedArray = unsortedArray;
	}

	


}
