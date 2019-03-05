/**
 * assignment:
 * Print all fibonacci numbers smaller or equal than 100.
 */

package at.bfi.assignments.loops.fibonacci;

public class ByThreshold {

	public static void main(String[] args) {
		
		int pprev = 0;
		int prev = 1;
		
		System.out.print(pprev + " " + prev + " ");
		
		int curr = pprev + prev;
		while (curr <= 100) {
			System.out.print(curr + " ");
			pprev = prev;
			prev = curr;
			curr = pprev + prev;
			
		}
		
		System.out.println();

	}

}
