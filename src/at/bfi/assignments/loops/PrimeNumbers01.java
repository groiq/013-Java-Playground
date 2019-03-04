package at.bfi.assignments.loops;

import java.util.ArrayList;

public class PrimeNumbers01 {
	
	public static ArrayList<Integer> getPrimes(int maxNum) {
		
		boolean[] numList = new boolean[maxNum + 1];
		for (int i = 2; i < numList.length; i++) { numList[i] = true; }
		ArrayList<Integer> primeList = new ArrayList<>();
		
		for (int pos = 2;  pos < numList.length; pos++) {
			
			if (numList[pos] == false) continue;
			primeList.add(pos);
			
			for (int curr = 2 * pos; curr < numList.length; curr += pos) {
				numList[curr] = false;
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
