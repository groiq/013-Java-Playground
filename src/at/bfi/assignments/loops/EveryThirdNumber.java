package at.bfi.assignments.loops;

public class EveryThirdNumber {
	
	private static void everyThird(int threshold) {
		int pprev = 1;
		int prev = 2;
//		int cur = 3;
		System.out.print(pprev + " " + prev + " ");
		for (int i = 3; i <= threshold; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " "); 
			} else {
				System.out.print(pprev + prev + " ");
			}
			pprev = prev;
			prev = i;
		}
		System.out.println();
	}
	
	private static void everyThirdShortcut(int threshold) {
		for (int i = 1; i <= threshold; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " ");
			} else {
				// (i-2)+(i-1) = i + i - 2 - 1 = 2i - 3
				System.out.print((2*i-3)+" ");
			}
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		int threshold = 20;
//		System.out.println(Arrays.toString(everyThird(threshold)));
//		System.out.println(Arrays.toString(everyThirdShortcut(threshold)));
		everyThird(threshold);
		everyThirdShortcut(threshold);

	}

}
