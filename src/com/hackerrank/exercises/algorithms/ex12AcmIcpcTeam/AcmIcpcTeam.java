package com.hackerrank.exercises.algorithms.ex12AcmIcpcTeam;

import java.util.Arrays;

public class AcmIcpcTeam {
	
    static int[] acmTeam(String[] topic) {

    	for (String candidate : topic) {
			int candidateInt = Integer.parseInt(candidate,2);
			System.out.println(candidate + " -> " + candidateInt);
		}
    	

    	return null;
    }

	public static void main(String[] args) {

		String[] testData;
//		testData = new String[] {"1100","1000","0010","0001"};
		testData = new String[] {"000","001","010","011","100","101","110","111"};
		System.out.println(Arrays.toString(testData) + " -> " + Arrays.toString(acmTeam(testData)));
		

	}

}
