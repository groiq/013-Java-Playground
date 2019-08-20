package at.bfi.coders.bay.exercises.unit2._10.circle;

/**
 * draws a circle.
 * @author groiq
 *
 */
public class Circle {

	public static void main(String[] args) {
		
		char sign = '#';
		char blank = ' ';
		
		int radius = 10;
		int comparer;
		
		for (int y = 0; y < 2*radius+1; y++) {
			for (int x = 0; x < 2*radius+1; x++) {
				comparer = (int) Math.sqrt((Math.pow((x - radius), 2) + Math.pow((y - radius), 2)));
				if (comparer == radius || comparer == (radius * -1)) {
					System.out.print(sign + " ");
				} else {
					System.out.print(blank + " ");
				}
			}
			System.out.println();
		}
		

		
	}

	
}
