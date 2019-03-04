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
		int sum = 0;
		for (int prime : primes) { sum += prime; }
		System.out.println(primes.size() + "," + sum);
	}
}
