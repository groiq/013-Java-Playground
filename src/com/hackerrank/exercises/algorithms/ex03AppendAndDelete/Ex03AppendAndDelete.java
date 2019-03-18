package com.hackerrank.exercises.algorithms.ex03AppendAndDelete;

public class Ex03AppendAndDelete {
	
    static String appendAndDelete(String s, String t, int k) {

    	return isAppendable(s,t,k) ? "Yes" : "No" ; 

    }
    
    static boolean isAppendable(String firstWord, String secondWord, int steps) {
    	
    	boolean result = false;
    	
    	int equalUntil = 0;
    	
    	while (equalUntil < firstWord.length() && equalUntil < secondWord.length() 
    			&& firstWord.charAt(equalUntil) == secondWord.charAt(equalUntil)) {
//    		System.out.print(firstWord.charAt(equalUntil));
    		equalUntil++;
    	}
//    	System.out.println();
    	
    	int firstSubstrLen = firstWord.length() - equalUntil;
    	int secondSubstrLen = secondWord.length() - equalUntil;
    	
//    	for (int i = 0; i < equalUntil; i++) {
//			System.out.print(firstWord.charAt(i));
//		}
//    	System.out.print(": " + equalUntil + ", ");
//    	for (int i = equalUntil; i < firstWord.length(); i++) {
//			System.out.print(firstWord.charAt(i));
//		}
//    	System.out.print(": " + firstSubstrLen + ", ");
//    	for (int i = equalUntil; i < secondWord.length(); i++) {
//			System.out.print(secondWord.charAt(i));
//		}
//    	System.out.println(": " + secondSubstrLen);
//    	
    	int stepsForEqual = steps - (firstSubstrLen + secondSubstrLen);
    	
    	if (stepsForEqual >= 0) {
    		if (stepsForEqual >= equalUntil * 2 || stepsForEqual % 2 == 0) {
    			result = true;
    		}
    	}
    	
    	return result;
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
