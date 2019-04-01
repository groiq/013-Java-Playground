package com.hackerrank.exercises.algorithms.ex14OrganizingContainers;

import java.util.Arrays;

public class OrganizingContainers {
	
	static boolean helper(int[][] container) {
		
		int[] slots = new int[container.length];
		int[] items = new int[container.length];
		
		for (int i = 0; i < container.length; i++) {
			for (int j = 0; j < container[i].length; j++) {
//				System.out.println(i + "/" + j + ": " + container[i][j]);
				slots[i] += container[i][j];
				items[j] += container[i][j];
			}
		}

		System.out.println(Arrays.toString(slots) + " -- " + Arrays.toString(items));

		boolean result = true;

		for (int i = 0; i < slots.length; i++) {
			for (int j = 0; j < items.length; j++) {
				if (slots[i] == items[j]) {
					slots[i] = -1;
					items[j] = -1;
					break;
				}
			}
			if (slots[i] > -1) {
//				return false;
				result = false;
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(slots) + " -- " + Arrays.toString(items));
		
		
		
		return result;
		
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
		
		int[][] own01 = {{0,1,0},{2,0,0},{0,0,3}};
		System.out.println(helper(own01));
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
