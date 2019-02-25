package at.bfi.exercises.arrays;

public class ArrayExercisesApp {
	
	/**
	 * Prints the contents of an integer array.
	 * @param input
	 */
	public static void pprint(int[] input) {
		System.out.print("|");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "|");
		}
		System.out.println();
	}
	
	public static void pprint(double[] input) {
		System.out.print("|");
		for (double d : input) {
			System.out.print(d + "|");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] testInt;
		testInt = new int[] {4,12,7,9,13};
		testInt = new int[] {4,12,7,9,13,9};
//		testInt = new int[] {1,4,2,3,5};
//		testInt = new int[] {3,2,1};
//		testInt = new int[] {3,1,2};
//		testInt = new int[] {1,2,3};
		
		pprint(testInt);
//		int[] arrCopy = Arr.deepCopy(testInt);
//		pprint(arrCopy);
//		int[] swapped = Arr.swap(testInt, 0, 1);
//		pprint(swapped);
		
		
		int[] sortedInt;
//		sortedInt = Arr.sort01(testInt);
//		sortedInt = Arr.selectionSort(testInt);
		sortedInt = Arr.sortWithLinkedList(testInt);
		pprint(sortedInt);
		
		int[] reversedInt;
		reversedInt = Arr.reverse(testInt);
		pprint(reversedInt);
		
		double[] testDouble = new double[testInt.length];
		for (int i = 0; i < testDouble.length; i++) {
			testDouble[i] = testInt[i];
		}
		pprint(testDouble);
		Statistics DoubleStats = new Statistics(testDouble);
		pprint(DoubleStats.getInput());
		

	}

}
