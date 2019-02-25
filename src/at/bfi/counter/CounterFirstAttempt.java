package at.bfi.counter;

public class CounterFirstAttempt {
	
	// first attempt at a counter method. Restarted in a new package.
	
	private static int lineBreak = 20;
	
	public static void count(int start, int end, int step) {
		
//		if (step == 0) {
//			step = 1;
//		} else if (start > end && step > 0) {
//			step *= -1;
//		} else if (start > end && step > 0) {
//			step *= -1;
//		}
		
		int min;
		int max;
		if (start < end && step >= 0) {
			min = start;
			max = end;
		} else {
			min = end;
			max = start;
		}

		if (step == 0) {
			step = 1;
		}
		else if (step < 0) {
			
			step *= -1;
		}
		
		int monitorLines = 1;
		System.out.print("|");
		for (int i = min; i < max + 1; i += step) {
			System.out.print((start <= end ? i : start - i) + "|");
			if (monitorLines % lineBreak == 0) {
				System.out.println();
			}
			monitorLines++;
		}
		
	
		System.out.println();
		
	}
	
	public static void count(int end) {
		count(0,end, 1);
	}
	
	public static void count(int start, int end) {
		count(start, end, 1);
	}



}
