package com.hackerrank.exercises.algorithms.ex12AcmIcpcTeam;

import java.util.Arrays;

public class AcmIcpcTeam {
	
    static int[] acmTeam(String[] topic) {

    	short[] asNums = new short[topic.length];
    	int[] counter = new int[topic[0].length()+1];
    	
//    	int runCounter = 0;
    	for (int i = 0; i < asNums.length; i++) {
//    		runCounter++;
			asNums[i] = (short) Integer.parseInt(topic[i],2);
//			System.out.println(topic[i] + " -> " + asNums[i]);
			for (int j = 0; j < i; j++) {
//				runCounter++;
				int k = asNums[i] | asNums[j];
//				System.out.println("i: " + i + ", j: " + j + ", topic[i]: " + topic[i] + ", topic[j]: " + topic[j] + ", asNums[i]: " + asNums[i] + ", asNums[j]: " + asNums[j] + ", k: " + k);
//				System.out.print(runCounter + ": ");
//				System.out.println(topic[i] + ", " + topic[j] + " -> " + Integer.toBinaryString(k));
				int topicCount = 0;
				while (k > 0) {
					// for later: do the same thing with bitwise operations
					topicCount += (k%2);
					k /= 2;
//					System.out.println("k: " + k + ", topicCount: " + topicCount);
				}
//				System.out.println("final topic count: " + topicCount);
				counter[topicCount] += 1;
//				System.out.println("topic count: " + topicCount + " -> " + Arrays.toString(counter));
			}
		}
//    	System.out.println(Arrays.toString(counter));
    	
    	int[] result = new int[2];
    	for (int i = counter.length; i > 0; i--) {
    		if (counter[i-1] > 0) {
//    			System.out.println("found: " + (i-1) + " -> " + counter[i-1]);
    			result[0] = i-1;
    			result[1] = counter[i-1];
    			break;
    		}
    	}

    	return result;
    }

	public static void main(String[] args) {

		String[] testData;
//		testData = new String[] {"1100","1000","0010","0001"};
//		testData = new String[] {"000","001","010","011","100","101","110","111"};
		testData = new String[] {"10101","11100","11010","00101"};
		System.out.println(Arrays.toString(testData) + " -> " + Arrays.toString(acmTeam(testData)));
		

	}

}
