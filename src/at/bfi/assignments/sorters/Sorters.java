package at.bfi.assignments.sorters;

public class Sorters {
	
	private static void swap(int[] input, int i, int j) {
		int clipboard;
		clipboard = input[i];
		input[i] = input[j];
		input[j] = clipboard;
	}

	/**
	 * An implementation of the sorting algorithm described at 
	 * http://www.dangermouse.net/esoteric/intelligentdesignsort.html
	 * Since this is very easy to implement, it's useful for testing method calls.
	 * @param input the array to be sorted
	 * @return the sorted array
	 */
	public static int[] intelligentDesignSort(int[] input) {
		return input;
	}

	

}
