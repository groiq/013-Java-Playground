/**
 * https://www.hackerrank.com/challenges/library-fine/problem
 */
package com.hackerrank.exercises.algorithms.ex05LibraryFine;

public class LibraryFine {
	
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

    	int fine = 0;
    	
    	if (y1 > y2) {
    		fine = 10000;
    	} else if (m1 > m2) {
    		fine = (m1 - m2) * 500;
    	} else if (d1 > d2) {
    		fine = (d1 - d2) * 15;
    	}
    	
    	return fine;

    }

	public static void main(String[] args) {
		
		System.out.println(libraryFine(30,10,2018,30,10,2018));
		System.out.println(libraryFine(30,10,2018,20,10,2018));
		System.out.println(libraryFine(30,10,2018,20,5,2018));
		System.out.println(libraryFine(30,10,2018,20,10,2017));
		
//		9 6 2015
//		6 6 2015
		System.out.println(libraryFine(9,6,2015,6,6,2015));
		
		

	}

}
