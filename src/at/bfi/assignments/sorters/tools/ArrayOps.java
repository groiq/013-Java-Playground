package at.bfi.assignments.sorters.tools;

public class ArrayOps {
	
	/*
	 * for later: handle the entire DataContainer thing from here?
	 */
	
	public static void reverse(int[] input, int from, int to) {
		while (from < to) {
			swap(input,from,to);
			from++;
			to--;
		}
	}
	
	
	
	/**
	 * Reverses an array.
	 * @param input - an int[]
	 * @return an int[] - input reversed
	 */
	public static int[] reverse(int[] input) {
		int i = 0;
		int j = input.length - 1;
		while (j > i) {
			swap(input, i, j);
			i++;
			j--;
		}
		return input;
	}

	public static void swap(int[] input, int i, int j) {

		int placeholder = input[i];
		input[i] = input[j];
		input[j] = placeholder;
		
	}	



}
