package hackerRank;

// working class for https://www.hackerrank.com/ exercises

public class Solution {
	
    static int countingValleys(int n, String s) {

    	int result = 0;
    	int barometer = 0;
    	
    	for (int i = 0; i < n; i++) {
    		if (s.charAt(i) == 'D') {
    			barometer -= 1;
    			if (barometer == -1) {
    				result += 1;
    			} 
    		} else {
    			barometer += 1;
    		}
    	}
    	
    	
    	return result;

    }

	

	public static void main(String[] args) {
		
		System.out.println("1: " + countingValleys(8, "UDDDUDUU"));
    	


	}

}
