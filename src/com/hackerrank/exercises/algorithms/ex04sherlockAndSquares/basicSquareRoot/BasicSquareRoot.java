/**
 * Calculates a square root of a number using binary search.
 */
package com.hackerrank.exercises.algorithms.ex04sherlockAndSquares.basicSquareRoot;

public class BasicSquareRoot {
	
	public static int getSquareRoot(int number) {
		
		if (number == 1) {return 1;}
		
		int guess;
		
		int min = 1;
		int max = number;
		guess = number;
		
		do {
			guess = (max + min) / 2;
			if (guess == min || guess == max) {
				guess *= -1;
				break;
//				return (guess * -1);
			}
			if (guess * guess > number) {
				max = guess;
			} else if (guess * guess < number) {
				min = guess;
			}
		} while (guess * guess != number);
		
		return guess;
	}
	
	public static void checkSqrt(int i) {
		int selfCalc = getSquareRoot(i);
		double librSqrt = Math.sqrt(i);
		double libTester = Math.floor(librSqrt);
		System.out.println(i + " -> " + selfCalc + ", " + librSqrt + ", " + libTester);
	}

	public static void main(String[] args) {
		
		for (int i = 1; i < 122; i++) {
//			System.out.println(i + " -> " + getSquareRoot(i));
			checkSqrt(i);
		}

	}

}
