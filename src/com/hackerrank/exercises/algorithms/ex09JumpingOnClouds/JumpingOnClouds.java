package com.hackerrank.exercises.algorithms.ex09JumpingOnClouds;

import java.util.Arrays;

public class JumpingOnClouds {

	static int jumpingOnClouds(int[] c) {

		System.out.println("length: " + c.length);
		int counter = 0;
		int pos = 0;

		while (pos < c.length) {
			System.out.println(pos);
			pos += 2;
			counter++;
		}


		return counter;

	}		

	public static void main(String[] args) {

		p(new int[] {0,0,0,0,0,0,0});
		p(new int[] {0,0,0,0,0,0});

	}

	static void p(int[] arr) {
		System.out.println(Arrays.toString(arr) + " -> " + jumpingOnClouds(arr));
	}

}
