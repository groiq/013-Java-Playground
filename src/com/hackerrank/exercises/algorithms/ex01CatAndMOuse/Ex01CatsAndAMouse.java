/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
package com.hackerrank.exercises.algorithms.ex01CatAndMOuse;

public class Ex01CatsAndAMouse {
	
	static String catAndMouse(int x, int y, int z) {
		String result = null;
		int distA = Math.abs(z-x);
		int distB = Math.abs(z-y);
		if (distA < distB) {
			result = "Cat A";
		} else if (distA > distB) {
			result = "Cat B";
		} else {
			result = "Mouse C";
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(catAndMouse(1, 2, 3));
		System.out.println(catAndMouse(1, 3, 2));
		
		System.out.println(catAndMouse(1, 2, 0));
		System.out.println(catAndMouse(2, 1, 0));
		System.out.println(catAndMouse(1, -1, 0));
		

	}

}
