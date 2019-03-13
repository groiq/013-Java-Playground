package at.bfi.variousStuff.fibonacci;

public class Fibonacci03 {
	
	private static int f(int i) {
		if (i > 1) { i = f(i-2) + f(i-1); }
		// f(0) = 0 and f(1) = 1, meaning that for 0 and 1 f(i) = i.
		// Starting with f(2), f(i) is calculated. 
		return i;
	}
	
	
//	private static int f(int i) {
//		// clearer / more verbose variant of f(i)
//		int fibo;
//		if (i == 0) { fibo = 0; }
//		else if (i == 1) { fibo = 1; }
//		else { fibo = f(i-2) + f(i-1); }
//		return fibo;
//	}
	
	public static int[] byCount(int count) {
		int[] list = new int[count];
		for (int i = 0; i < list.length; i++) {
			list[i] = f(i);
		}
		return list;
	}

}
