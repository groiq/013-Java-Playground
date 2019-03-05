/**
 * assignment:
 * Print all prime numbers smaller or equal than 100.
 * 
 * This variant uses the sieve of Erastothenes,
 * tracking the prime property in an extra boolean[].
 */

package at.bfi.assignments.loops;

import java.util.ArrayList;

public class PrimeNumbers02 {
	
	public static ArrayList<Integer> getPrimes(int maxNum) {
		boolean[] isComposite = new boolean[maxNum + 1];
		ArrayList<Integer> primeList = new ArrayList<>();
		for (int pos = 2; pos < isComposite.length; pos++) {
			if (isComposite[pos]) continue;
			primeList.add(pos);
			for (int result = pos * pos; result < isComposite.length; result += pos) {
				isComposite[result] = true;
			}
		}
		return primeList;
	}
	
	public static void main(String[] args) {
		int maxNum = 100;
		ArrayList<Integer> primes = getPrimes(maxNum);
		System.out.println(primes);
	}
}
