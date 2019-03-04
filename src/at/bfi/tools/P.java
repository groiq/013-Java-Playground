package at.bfi.tools;

import java.util.Arrays;
import java.util.List;

public class P {
	
	private static int defaultLineBreak = 20;
	
	/**
	 * @return the lineBreak
	 */
	public static int getLineBreak() {
		return defaultLineBreak;
	}

	/**
	 * @param lineBreak the lineBreak to set
	 */
	public static void setLineBreak(int lineBreak) {
		P.defaultLineBreak = lineBreak;
	}
	

	public static <T> void print(List<T> input, int lineBreak) {
		System.out.println("printing list...");
		System.out.println(input);
	}
	
	public static void print(Object[] input, int lineBreak) {
		print(Arrays.asList(input),lineBreak);
	}
	
	public static void print(int[] input, int lineBreak) {
		print(Arrays.asList(input),lineBreak);
	}
	
	public static void print(double[] input, int lineBreak) {
		print(Arrays.asList(input),lineBreak);
	}
	
	public static void print(Object input) {
		print(input,defaultLineBreak);
	}
		
//	public static  void print(Object input) {
//		if (input != null && input.getClass().isArray()) {
//			for (Object i : input) {
//				
//			}
//		} else {
//			System.out.println("Nooo!");
//			return;
//		}
//		if (input == null ||  (input.getClass().isArray())) {
//			System.err.println("no!");
//			return;
//		}
//		for (Object i : input) {
//			System.out.println(i);
//		}
//	}
//	https://stackoverflow.com/questions/33871121/how-to-pass-any-array-as-a-parameter-in-java
	// p.print(a) und p.print(a,lineBreak) implementieren

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

}
