package com.hackerrank.exercises.algorithms.ex07NonDivisibleSubsets;

import java.util.Arrays;

public class NonDivisibleSubsets {
	
   static int nonDivisibleSubset(int k, int[] S) {
	   
	   int[] counter = new int[k];
	   // counter is initialized with default value 0 for each entry
	   for (int i : S) {
		counter[i%k] += 1;
	}
//	   System.out.println(Arrays.toString(counter));
	   
	   
	   int total = 0;
	   
	   
	   
	   return total;

    }


	public static void main(String[] args) {
	
		int[] S;
		
		S = new int[] {1,7,2,4};
		p(3,S);
		
		p(3,new int[] {1,2,2,3,3,3});
		p(4,new int[] {1,2,2,3,3,3,4,4,4,4});
		p(5,new int[] {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5});
		p(6,new int[] {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6});

	}
	
	static void p(int k, int[] S) {
		System.out.println(nonDivisibleSubset(k, S) + " from " + k + " and " + Arrays.toString(S));
	}

}
