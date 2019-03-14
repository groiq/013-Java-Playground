package at.bfi.assignments.arrays;

import java.util.Arrays;

class Sorter {
	
	static int[] nums;
//	static int firstUnsortedPos;
	
//	Sorter(int[] givenList) {
//		this.nums = givenList; 
//		firstUnsortedPos = 0;
//	}
	
	static int findLowestElem(int firstPos) {
        // might be possible without an extra var for firstPos, e.g. use lowestPos as parameter and for the loop
		int lowestPos = firstPos;
		for (int pos = firstPos; pos < nums.length; pos++) {
			if (nums[pos] < nums[lowestPos]) { lowestPos = pos; }
		}
		return lowestPos;
	}
	
	static void swapElements(int a, int b) {
		if (a == b) return;
		nums[a] = nums[a] + nums[b];
		nums[b] = nums[a] - nums[b];
		nums[a] = nums[a] - nums[b];
//		System.out.print(nums[a] + "," + nums[b] + "; ");
//		System.out.println();
	}
	
	public static int[] sortList(int[] givenList) {
		nums = givenList;
//		firstUnsortedPos = 0;
		
		for (int nextUnsorted = 0; nextUnsorted < nums.length; nextUnsorted++) {
			int lowestElem = findLowestElem(nextUnsorted);
			swapElements(nextUnsorted,lowestElem);
		}
		
		return nums;
	}
	
}

public class Sorter01 {
	

	
	public static void main(String[] args) {
		
//		double[] durations = {5.23, 4.82, 3.55, 6.19, 5.23};
//		int[] points = { 3, 5, 6, 1, 4, 2 };
		int[] points = { 4, 2, 2, 1 };
		points = Sorter.sortList(points);
		System.out.print(Arrays.toString(points));
		
	}
}
