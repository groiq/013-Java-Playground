package at.bfi.assignments.sorters;

import java.util.Arrays;

import at.bfi.assignments.sorters.tools.ArrayOps;
import at.bfi.assignments.sorters.tools.DataContainer;

public class Reverse {
	
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
		int dataLen;
		
		dataLen = 12;
		
		testData = new int[12];
		for (int i = 0; i < testData.length; i++) {
			testData[i] = i;
		}
		
		tester = new DataContainer(testData);
		
//		print(fetch());
		
		System.out.println("testing partial reverse");
		for (int i = 0; i < testData.length; i++) {
			testData = fetch();
			ArrayOps.reverse(testData, i, testData.length-1);
			print(testData);
		}
		System.out.println();


	}

}
