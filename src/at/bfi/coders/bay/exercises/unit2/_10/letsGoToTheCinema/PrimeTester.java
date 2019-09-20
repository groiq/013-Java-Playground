/**
 * 
 */
package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.util.ArrayList;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   20.09.2019

 */
public class PrimeTester {

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
		int maxNum = 20;
		ArrayList<Integer> primes = getPrimes(maxNum);
		System.out.println(primes);
		int sum = 0;
		for (int prime : primes) { sum += prime; }
		System.out.println(primes.size() + "," + sum);
	}	
	
}
