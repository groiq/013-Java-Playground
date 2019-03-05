/**
 * assignment:
 * print all prime numbers smaller or equal than 100.
 * 
 * Brute force method that uses no arrays. High runtime costs.
 */

package at.bfi.assignments.loops;

public class PrimeNumbersWithoutArray {

	public static void main(String[] args) {
		
		int threshold = 100;
		
		System.out.print("|");
		for (int i = 2; i <= threshold; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) System.out.print(i + "|");
		}
		System.out.println();

	}

}
