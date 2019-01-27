package hackerRank;

// working class for https://www.hackerrank.com/ exercises

public class Solution {
	
    static int pageCount(int n, int p) {
        
    	System.out.println("entering function...");
    	
    	System.out.println("current page: " + p + ", total pages: " + n);
    	
    	// calculate turning from front:
    	// pg 1 -> 0; 2,3 -> 1; 4,5 -> 2
    	// that's exactly the modulo of the page number!
    	
    	// calculate turning from back:
    	// for now, get number of sheets...
    	// that's modulo + 1
    	
    	// number of sheets - sheet of current page = turning from back
    	// that's again modulo + 1 (sheet of pg 1 = first sheet = no turning from front, so 0)
    	int curSheet = (p / 2) + 1;
//    	System.out.println("modulo: " + (p%2) + ", so " + curSheet);
    	int sheets = (n / 2) + 1;
    	
    	int laterSheets = (sheets - curSheet);
    	
    	System.out.println("current: " + curSheet + ", later: " + laterSheets + ", total: " + sheets);
    	
    	int result;
    	if (laterSheets > curSheet) { result = curSheet; }
    	else { result = laterSheets; }
    	
    	
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


	}

}
