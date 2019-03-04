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
