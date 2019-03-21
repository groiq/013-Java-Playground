package com.hackerrank.exercises.algorithms.sherlockAndSquares.oldBinarySearch;

//import java.util.Arrays;

public class OldBinarySearch {
	
	static char[] alphabet = 
		{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', };
	static char[] vokale = {'a', 'e', 'i', 'o', 'u' };

	static int getIndex(char ch, char[] alpha) {
		
		int links = 0;
		int rechts = alpha.length;
		int mitte;
				
		do {
			mitte = ((rechts - links) / 2 + links);
			if (mitte == rechts || mitte == links) { return -1; }
			if (ch < alpha[mitte]) { rechts = mitte; }
			else if (ch > alpha[mitte]) { links = mitte; }
//		System.out.print(links + ":" + alpha[links] + "/" + mitte + ":" + alpha[mitte] +
//		"/" + rechts + ":" + alpha[rechts-1] + "; ");
//		System.out.print(links + "/" + mitte + "/" + rechts + "; ");

		} while 
			(ch != alpha[mitte]);
		

		
		return mitte;
	}

	
	public static void main(String[] args) {
		
		for ( char ch : alphabet) {
			System.out.print(ch + ": ");
			System.out.print(getIndex(ch,vokale) + " ////// ");
//			System.out.println();
			System.out.println(getIndex(ch, alphabet));
		}
		
	}
}
