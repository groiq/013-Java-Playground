package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

public class Circle {

	public static void main(String[] args) {
		
		char sign = '#';
		char blank = '_';
		
		int x;
		int y;
		int radius;
		
		for (int i = 0; i < 100; i++) {
			
			y = i / 10;
			x = i % 10;
//			System.out.println("x" + x + ",y" + y);
//			if (x > y) {
//				System.out.print(sign);
//			} else {
//				System.out.print(blank);
//			}
			if (x == 9) {
				System.out.println();
			}
			
		}
		
	}

	
}
