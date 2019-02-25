package at.bfi.counter;

public class Counter {
	

	public static void main(String[] args) {
		
//		// test pprint()
//		int[] testArr = new int[64];
//		for (int i = 0; i < testArr.length; i++) {
//			testArr[i] = i;
//		}
//		pprint(testArr);
		
		int min = 0;
		int max = 10;
		
		pprint(count(max));
		pprint(count(min,max));
		pprint(count(min,max,1));
		
		pprint(count(min,max,1));
		pprint(count(min,max,-1));
		pprint(count(max,min,1));
		pprint(count(max,min,-1));
//		
		pprint(count(min,max,2));
		pprint(count(min,max,-2));
//		
		pprint(count(2,2,1));
		pprint(count(2,2,-1));
//		
		pprint(count(2,3,1));
		pprint(count(2,3,-1));
//		
		pprint(count(3,2,1));
		pprint(count(3,2,-1));
		
		pprint(count(min,max,0));

	}
	

	public static int[] count(int start, int end, int step) {
		
		System.out.println("start=" + start + ", end=" + end + ", step=" + step);
	
		if (step == 0) {
			step = 1;
		}
		
		if (start > end && step > 0) {
			step *= -1;
		}
		
		if (step < 0 && start < end ) {
			int clipboard = start;
			start = end;
			end = clipboard;
		}
			
		int[] result;
//		int resultSize = (end - start) / Math.abs(step);
		int resultSize = Math.abs((end - start) / step);
//		int resultSize = (start <= end ? end - start : start - end) / Math.abs(step);  // TODO check for off-by-one; write case for start > end
		result = new int[resultSize];
		
		int current = start;
		
		for (int i = 0; i < result.length; i++) {
			result[i] = current;
			current += step;
		}
		
		return result;
	}
		
	
	
	
	
	
	public static int[] count(int end) {
		System.out.println("end=" + end);
		return count(0,end,1);
	}

	public static int[] count(int start, int end) {
		System.out.println("start=" + start + ", end=" + end);
		return count(start,end,1);
	}
		
		


	/**
	 * prints the contents of an array with regular line breaks
	 * @param input - an int[]
	 */
	public static void pprint(int[] input) {
		int lineBreak = 20;
		//System.out.print("|");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "|");
			if ( (i+1) % lineBreak == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
}


