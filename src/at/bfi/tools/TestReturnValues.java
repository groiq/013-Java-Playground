package at.bfi.tools;

public class TestReturnValues {

	public static void main(String[] args) {
		
		System.out.println("This class is to test some return values.");
		
		System.out.println("First, define a method that changes an array.");
		
		System.out.println("(i.e. takes an array, modifies it and returns it.)");
		
		System.out.println("We will start with an array where arr[i] = i. We will create a new array that is one longer.");
		
		int[] test1 = {0,1,2};
		P.pprint(test1);
		
		System.out.println("Then, call this method in various ways.");
		
		System.out.println("First, assign the new value as usual.");
		
		System.out.println("arr = myMethod(arr);");
		
		test1 = makeNewArray(test1);
		P.pprint(test1);
				
		System.out.println("then, call the method without assigning anything.");
		
		makeNewArray(test1);
		P.pprint(test1);
		
		System.out.println("myMethod(arr);");
		
		System.out.println("then, call the method from inside a sysout().");
		
		System.out.println("pprint(myMethod(arr));");
		
		P.pprint(makeNewArray(test1));
		P.pprint(test1);

		System.out.println("Come to think of it, let's do a second method that doesn't create a new array, but changes the array in-place.");
		
		System.out.println("let's say it increases each element of the array by one.");
		
		System.out.println("again, call this method once with assignment, once without assignment and once in-place.");
		
		int[] test2 = {0,1,2};
		P.pprint(test2);
		
		test2 = changeArrayInPlace(test2);
		P.pprint(test2);
		
		changeArrayInPlace(test2);
		P.pprint(test2);
		
		P.pprint(changeArrayInPlace(test2));
		P.pprint(test2);
		
		
		System.out.println("and a third method that creates a new array - but assigns it back to the input.");
		
		int[] test3 = {0,1,2};
		P.pprint(test3);
		
		System.out.println("again, call this method once with assignment, once without assignment and once in-place.");
		
		test3 = reassignArray(test3);
		P.pprint(test3);
		
		reassignArray(test3);
		P.pprint(test3);
		
		P.pprint(reassignArray(test3));
		P.pprint(test3);
		

	}

	private static int[] reassignArray(int[] input) {
		int newLength = input.length + 1;
		input = new int[newLength];
		for (int i = 0; i < input.length; i++) {
			input[i] = i;
		}
		return input;
	}

	private static int[] changeArrayInPlace(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i] += 1;
		}
		return input;
	}

	private static int[] makeNewArray(int[] input) {
		int[] output = new int[input.length+1];
		for (int i = 0; i < output.length; i++) {
			output[i] = i;
		}
		
		return output;
	}

}
