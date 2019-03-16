/**
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
package com.hackerrank.exercises.algorithms.ex02ExtraLongFactorials;

import java.math.BigInteger;

/*
 * for later:
 * store numbers in an array
 * hint from
 * https://www.hackerrank.com/challenges/extra-long-factorials/forum/comments/83124
 * (a long[] where on overflow values get copied to the next entry?)
 */
public class Ex02ExtraLongFactorials {
	
    static void extraLongFactorials(int n) {

    	BigInteger result = new BigInteger("1");
    	for (int i = 0; i < n; i++) {
//			result = result * i;
    		result = result.multiply(BigInteger.valueOf(i+1));
		}
    	
    	System.out.println(result);

    }

	public static void main(String[] args) {
		
		for (int i = 1; i < 30; i++) {
			System.out.print(i + " -> " );
			extraLongFactorials(i);
		}

	}

}
