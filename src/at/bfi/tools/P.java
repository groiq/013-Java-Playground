package at.bfi.tools;

public class P {
	
	private static int lineBreak = 20;
	
	/**
	 * @return the lineBreak
	 */
	public static int getLineBreak() {
		return lineBreak;
	}

	/**
	 * @param lineBreak the lineBreak to set
	 */
	public static void setLineBreak(int lineBreak) {
		P.lineBreak = lineBreak;
	}
	
//	public static  void print(Object input) {
//		if (input == null || not (input.getClass().isArray)) {
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
