package at.bfi.variousStuff.fibonacci;

import java.util.List;

public class Fibonacci01 {
	
	static List<Integer> known;
	static int maxKnown;
	
//	List<Integer> knownNeg;
//	int maxKnownNeg;
//	
	
	
	
	public static int[] byCount(int count) {
		
//		int[] interim = new int[threshold];
		int[] result = new int[count];
		
		int pprev = -1;
		int prev = 1;
		int current = 0;
		
		
		
		
		for (int i = 0; i < count; i++) {
			current = pprev + prev;
			result[i] = current;
			pprev = prev;
			prev = current;
		}

		
		return result;
	}
	
	// A method to generate the numbers by threshold
	
	// then a method to generate with variable parameters (start, end, fib(0), fib(1)
	
	// then refactor the whole thing
	
	// overload methods: default start = 0, default fib(0) = 0, default fib(1) = 1
	// f0 and f1 as an int[2]?

}
