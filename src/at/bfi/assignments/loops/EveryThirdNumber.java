/**
 * assignment:
 * Print the numbers from 1-20.
 * If a number is divisible by three, print the sum of the two preceding numbers instead.
 * 
 * This program does the task twice in different ways.
 */

package at.bfi.assignments.loops;

public class EveryThirdNumber {
	
	/*
	 * Determine the values by tracking the previous numbers,
	 * similar to a fibonacci algorithm.
	 */
	private static void everyThird(int threshold) {
		int pprev = 1;
		int prev = 2;
//		int cur = 3;
		System.out.print(pprev + " " + prev + " ");
		for (int i = 3; i <= threshold; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " "); 
			} else {
				System.out.print(pprev + prev + " ");
			}
			pprev = prev;
			prev = i;
		}
		System.out.println();
	}
	
	/*
	 * This variant takes a shortcut:
	 * We want f(i) to be the sum of f(i-1) and f(i-2) if i is divisible by three.
	 * Since we're just counting numbers, we just want f(i) to be the sum of i-1 and i-2.
	 * Thus f(i) = (i-2) + (i-1) = i + i - 1 - 2 = 2i - 3.
	 */
	private static void everyThirdShortcut(int threshold) {
		for (int i = 1; i <= threshold; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " ");
			} else {
				System.out.print((2*i-3)+" ");
			}
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		int threshold = 20;
		everyThird(threshold);
		everyThirdShortcut(threshold);

	}

}
