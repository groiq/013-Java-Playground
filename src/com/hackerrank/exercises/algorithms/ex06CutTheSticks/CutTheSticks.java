package com.hackerrank.exercises.algorithms.ex06CutTheSticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;

public class CutTheSticks {
	
    static int[] cutTheSticks(int[] arr) {

//    	int[] input = arr;
    	
    	TreeMap<Integer,Integer> counter = new TreeMap<Integer,Integer>();
    	
    	for (int i : arr) {
			counter.put(i, counter.getOrDefault(i, 0)+1);
		}
//    	System.out.println(counter);
//    	Iterable<Integer> values =  counter.values();
    	
    	
    	
    	int[] output = new int[counter.size()];
    	
    	int pos = 0;
    	int totalCount = arr.length;
    	
    	for (int i : counter.values()) {
//			System.out.println(i);
//			System.out.println("pos: " + pos + ", count: " + i + ", total count: " + totalCount);
			output[pos] = totalCount;
			pos += 1;
			totalCount -= i;
//			System.out.println(pos);
			
			
		}
    	
//    	for (int i=0; i<output.length; i++) {
//			System.out.println(i);
////			System.out.println(values.get(i));
//		}

//    	ArrayList<Integer> values = (ArrayList<Integer>) counter.values();
//    	System.out.println(values);
//    	
//    	for (int i : values) {
//			
//		}

    	
    	return output;

    }

	public static void main(String[] args) {
		
		int[] input;
		
		input = new int[] {5,4,4,2,2,8}; // 6,4,2,1
		
		p(input);
		
		input = new int[] {1,2,3,4,3,3,2,1}; // 8,6,4,1

		p(input);


	}

	private static void p(int[] input) {

		int[] p = cutTheSticks(input);
		System.out.println(Arrays.toString(p));
		
	}

}
