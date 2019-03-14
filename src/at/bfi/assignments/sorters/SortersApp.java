package at.bfi.assignments.sorters;

import java.util.Arrays;

public class SortersApp {

	private static DataContainer tester;
	
	private static int[] fetch() {
		if (tester == null) {
			throw new IllegalArgumentException("tester is not initialized");
		} else {
			return tester.getUnsortedArray();
		}
	}
	
	private static void print(int[] input) {
		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {

		int[] testData;
		testData = null; // to help avoiding "may not have been initialized" errors
		testData = new int[] {13,55,5,112,49,19,90,26};
		
		tester = new DataContainer(testData);
		
		System.out.println(tester);
		System.out.println(fetch());
		System.out.println(fetch()[0]);
		
		print(fetch());
		
		

		

	}

}
