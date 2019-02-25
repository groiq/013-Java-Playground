package at.bfi.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciWithSaving {
	
	List<Integer> known;
	int maxKnown;
	
//	List<Integer> knownNeg;
//	int maxKnownNeg;
//	
	
	public FibonacciWithSaving(int f0, int f1) {
		super();
		this.known = new ArrayList<Integer>();
		this.known.add(f0);
		this.known.add(f1);
		this.maxKnown = 1;
	}
	
	public FibonacciWithSaving(int f1) {
		this(0,f1);
	}
	
	public FibonacciWithSaving() {
		this(0,1);
	}
	

	public int f(int i) {
		int current;
		if (i > maxKnown) {
			current = f(i-1) + f(i-2);
			while (known.size() < i) {
				known.add(null);
			}
			known.set(i, current);
			this.maxKnown = i;
		} else {
			current = known.get(i);
			
		}
		return i;
	}

	
	
	public static int[] byCount(int count) {
		
//		int[] interim = new int[threshold];
		int[] result = new int[count];
		FibonacciWithSaving thisFibonacci = new FibonacciWithSaving();
		
		for (int i = 0; i < count; i++) {
			result[i] = thisFibonacci.known.get(i);
		}
		

		
		return result;
	}


	// A method to generate the numbers by threshold
	
	// then a method to generate with variable parameters (start, end, fib(0), fib(1)
	
	// then refactor the whole thing
	
	// overload methods: default start = 0, default fib(0) = 0, default fib(1) = 1
	// f0 and f1 as an int[2]?

}
