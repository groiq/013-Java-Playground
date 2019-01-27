package hackerRank;

// working class for https://www.hackerrank.com/ exercises

public class Solution {
	
    static int pageCount(int n, int p) {
        
//    	System.out.println("entering function...");
    	
//    	System.out.println("current page: " + p + ", total pages: " + n);
    	
    	// Page 1 is on the first *spread*. Page 2 and 3 are on the second. etc.
    	// When on spread 1, I need to turn 0 times, on the second once etc. So:
    	// pg 1 -> 0; 2,3 -> 1; 4,5 -> 2
    	// which is just the result of an integer division!
    	// That goes for each page, so for both the current page and the total number of pages...
    	int curSpread = p / 2;
    	int totalSpreads = n / 2;
    	// System.out.println("current spread: " + curSpread + ", total spreads: " + totalSpreads);
    	// ...and the spreads that follow after the current are the difference...
    	int laterSpreads = totalSpreads - curSpread;
//    	System.out.println("current spread: " + curSpread + ", later spreads: " + laterSpreads + ", total: " + totalSpreads);
    	
    	int result;
    	
//    	result = 0; // dummy!
    	result = (curSpread > laterSpreads ? laterSpreads : curSpread);
    	
    	return result;
    	

    }


	public static void main(String[] args) {
		
    	// drawing book
    	// 6 / 1,2,3,...
    	// 7 / 1,2,3,...
    	// get half of the number
    	// test all solutions
    	
    	// (0,1),(2,3),...
    	// oder:
    	// (0),(1,2),(3,4) -> (1),(2,3),(4,5),...
    	
    	// 6,2 -> 1
    	// 5,4 -> 0
    	System.out.println("6,2 -> 1 :: " + pageCount(6,2));
    	System.out.println("5,4 -> 0 :: " + pageCount(5,4));
    	
    	for (int i = 1; i < 7; i++) {
    		for (int j = 1; j <= i; j++) {
    			System.out.println(i + "," + j + "->" + pageCount(i,j));
    		}
    	}


	}

}
