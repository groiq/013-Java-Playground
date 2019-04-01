package com.hackerrank.exercises.algorithms.ex14OrganizingContainers;

public class OrganizingContainers {
	
	static boolean helper(int[][] container) {
		
		
		
		return (container[0][1] == container[1][0] || container[0][0] == container[1][1]);
		
	}
	
    static String organizingContainers(int[][] container) {

    	return (helper(container)) ? "Possible" : "Impossible";

    }

	public static void main(String[] args) {
		
		int[][] i00 = {{1,1},{1,1}};
		int[][] i01 = {{0,2},{1,1}};
		int[][] i10 = {{1,3,1},{2,1,2},{3,3,3}};
		int[][] i11 = {{0,2,1},{1,1,1},{2,0,0}};
		System.out.println(helper(i00));
		System.out.println(helper(i01));
		System.out.println(helper(i10));
		System.out.println(helper(i11));
//		1 1
//		1 1
//		2
//		0 2
//		1 1
//		
//		1 3 1
//		2 1 2
//		3 3 3
//		3
//		0 2 1
//		1 1 1
//		2 0 0

	}

}
