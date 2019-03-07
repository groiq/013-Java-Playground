package at.bfi.exercises.var;

class TwoArrays {
	public int[] arr1, arr2;
}

public class MethodsTest {
	
	//  Was toying with possibilities to create a method with two return values.
	// resource: https://www.cs.princeton.edu/courses/archive/spr96/cs333/java/tutorial/java/javaOO/arguments.html
	

	private static int[] newArray = null;
	private static int[] newCopy = null;

	public static void main(String[] args) {
		
//		int[] myArray = {1,50,320,4};
//		int[] arrayCopy = myArray.clone();
//		pprint(myArray);
//		pprint(arrayCopy);
//		
////		sysout(equalUntil(myArray,arrayCopy));
//		System.out.println(equalUntil(myArray,arrayCopy));
		
//		fill(newArray,newCopy);
		initialize();
		pprint(newArray);
		pprint(newCopy);
		
		



	} // /main
	
	private static void initialize() {
		int[] dummyArray = new int[] {1,50,320,4};
		newArray = dummyArray;
		newCopy = dummyArray;
//		newArray = new int[] {1,50,320,4};
//		newCopy = newArray.clone();
	}
	
	private static void fill(int[] newArray, int[] newCopy) {
		int[] dummyArray = new int[] {1,50,320,4};
		newArray = dummyArray;
		newCopy = dummyArray;
//		newArray = new int[] {1,50,320,4};
//		newCopy = newArray.clone();
		
	}



	public static void pprint(int[] input) {
		System.out.print("|");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "|");
		}
		System.out.println();
	}
	
	public static int equalUntil(int[] a1, int[] a2) {
		int i;
//		index = 0;
		for (i = 0; i < a2.length; i++) {
			if (a1[i] != a2[i]) {
				System.out.println("found difference at index " + i);
				break;
			}
		}
		
		return i;
	}
	
	

}
