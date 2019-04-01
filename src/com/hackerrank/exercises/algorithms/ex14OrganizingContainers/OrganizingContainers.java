package com.hackerrank.exercises.algorithms.ex14OrganizingContainers;

public class OrganizingContainers {
	
	static boolean helper(int[][] container) {
		
		return (container[0][1] == container[1][0] || container[0][0] == container[1][1]);
		
		
	}
	
    static String organizingContainers(int[][] container) {

    	return (helper(container)) ? "Possible" : "Impossible";

    }

	public static void main(String[] args) {
		
		

	}

}
