package com.hackerrank.exercises.algorithms.ex12AcmIcpcTeam;

import java.math.BigInteger;
import java.util.Arrays;

public class AcmIcpcTeam {
	
    static int[] acmTeam(String[] topic) {

    	BigInteger[] asNums = new BigInteger[topic.length];
    	
    	int maxTopicCount = 0;
    	int teamsCount = 0;
    	
    	for (int i = 0; i < asNums.length; i++) {
//    		System.out.println(topic[i]);
			asNums[i] = new BigInteger(topic[i],2);
//			System.out.println(topic[i] + " -> " + asNums[i]);
			for (int j = 0; j < i; j++) {
				BigInteger k = asNums[i].or(asNums[j]);
				int topicCount = k.bitCount();
//				String kString = k.toString(2);
//				System.out.println(asNums[i].toString(2) + " | " + asNums[j].toString(2) + " -> " + kString);
//				System.out.println(k.bitCount());
				if (topicCount > maxTopicCount) {
					maxTopicCount = topicCount;
					teamsCount = 1;
				} else if (topicCount == maxTopicCount) {
					teamsCount += 1;
				}
//				counter[topicCount] += 1;
//				System.out.println("topic count: " + topicCount + " -> " + Arrays.toString(counter));
			}
		}
//    	System.out.println(Arrays.toString(counter));
    	
    	int[] result = new int[2];
    	result[0] = maxTopicCount;
    	result[1] = teamsCount;
//    	for (int i = counter.length; i > 0; i--) {
//    		if (counter[i-1] > 0) {
////    			System.out.println("found: " + (i-1) + " -> " + counter[i-1]);
//    			result[0] = i-1;
//    			result[1] = counter[i-1];
//    			break;
//    		}
//    	}

    	return result;
    }

	public static void main(String[] args) {

		String[] testData;
//		testData = new String[] {"1100","1000","0010","0001"};
//		testData = new String[] {"000","001","010","011","100","101","110","111",};
		testData = new String[] {"10101","11100","11010","00101"};
		System.out.println(Arrays.toString(testData) + " -> " + Arrays.toString(acmTeam(testData)));
		

	}

}
