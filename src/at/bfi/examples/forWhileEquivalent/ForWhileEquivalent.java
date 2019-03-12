/**
 * Does the same task once with a for loop and once with a while loop,
 * to demonstrate equivalence between the two concepts.
 */
package at.bfi.examples.forWhileEquivalent;

public class ForWhileEquivalent {
	
	/**
	 * counts up to a given number using a for loop
	 * @param limit - the number to stop counting at
	 */
	public static void countUsingForLoop(int limit) {
		System.out.println("Count using a for loop: ");
		for (int i = 0; i < limit; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * count up to a given number using a while loop
	 * @param limit the number to stop counting at
	 */
	public static void countUsingWhileLoop(int limit) {
		System.out.println("Count using a while loop: ");
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		
		int limit;
		limit = 6;
		
		countUsingWhileLoop(limit);
		countUsingForLoop(limit);

	}

}
