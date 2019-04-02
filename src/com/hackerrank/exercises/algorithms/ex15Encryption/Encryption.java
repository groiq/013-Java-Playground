package com.hackerrank.exercises.algorithms.ex15Encryption;

public class Encryption {

	public static void main(String[] args) {
		
		for (int i = 0; i < 12; i++) {
			int j = i+1;
			j = (int) Math.sqrt(j);
			System.out.println(i+1 + "->" + j);
		}

	}

}
