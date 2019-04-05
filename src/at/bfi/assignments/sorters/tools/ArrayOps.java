package at.bfi.assignments.sorters.tools;

public class ArrayOps {
	
	/*
	 * TODO
	 * - void partial reverse method
	 * - "total" reverse reverses an array from 0 to its length
	 * - overloaded constructor - reverse(arr) calls reverse(arr,begin,end)
	 */
	
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
