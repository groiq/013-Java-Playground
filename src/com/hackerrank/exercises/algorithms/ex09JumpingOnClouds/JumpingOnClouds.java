package com.hackerrank.exercises.algorithms.ex09JumpingOnClouds;

import java.util.Arrays;

public class JumpingOnClouds {

	static int jumpingOnClouds(int[] c) {

//		for (int i = 0; i < c.length; i++) {
//			System.out.print(i + ",");
//		}
//		System.out.println();
//		System.out.println("last index: " + (c.length-1));
		int counter = 0;
		int pos = 0;
//		System.out.println("starting at 0");

		while (pos < c.length-1) {
			pos += 2;
			counter++;
//			System.out.println("jump to " + pos);
			if (pos < c.length-1 && c[pos] == 1) {
//				System.out.println("thundercloud!");
//				System.out.println("thundercloud! jumping to " + (pos-1) + " and " + (pos+1) + " instead.");
				pos++;
				counter++;
			}
		}


		return counter;

	}		

	public static void main(String[] args) {

		p(new int[] {0,0,0,0,0,0,0});
		p(new int[] {0,0,0,0,0,0});
		p(new int[] {0,0,1,0,0});
		p(new int[] {0,0,1,0});

	}

	static void p(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) System.out.print(".");
			else System.out.print(i);
			System.out.print("|");
		}
		System.out.println(" -> " + jumpingOnClouds(arr));
//		System.out.println(Arrays.toString(arr) + " -> " + jumpingOnClouds(arr));
	}

}
