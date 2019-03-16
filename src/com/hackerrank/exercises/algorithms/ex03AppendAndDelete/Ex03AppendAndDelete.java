package com.hackerrank.exercises.algorithms.ex03AppendAndDelete;

public class Ex03AppendAndDelete {
	
    static String appendAndDelete(String s, String t, int k) {

    	return isAppendable(s,t,k) ? "Yes" : "No" ; 

    }
    
    static boolean isAppendable(String firstWord, String secondWord, int steps) {
    	
    	return false;
    }

    static void printResult(String firstWord,String secondWord,int steps) {
    	System.out.println(firstWord + ", " + secondWord + ", " + steps + ": " + appendAndDelete(firstWord, secondWord, steps));
    }
    
	public static void main(String[] args) {
		
		printResult("hackerhappy", "hackerrank", 9);
		printResult("aba", "aba", 7);
		printResult("ashley", "ash", 2);
		
		

		



	}

}
