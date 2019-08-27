package at.bfi.coders.bay.exercises.unit2._10.circle;

/**
 * An (almost) complete library for working with circles.
 * 
 * @author groiq
 * @version 1.0
 * @since 27.08.2019
 */
public class Circle {

	private static char defaultSign = '#';
	private static char defaultBlank = ' ';

	/**
	 * Get the default char to represent points on the circle.<br>
	 * Default values can be overridden in the method call.
	 * 
	 * @return the defaultSign
	 */
	public static char getDefaultSign() {
		return defaultSign;
	}

	/**
	 * Set the default char to represent points on the circle.<br>
	 * Default values can be overridden in the method call.
	 * 
	 * @param defaultSign the defaultSign to set
	 */
	public static void setDefaultSign(char defaultSign) {
		Circle.defaultSign = defaultSign;
	}

	/**
	 * Get the default char to represent points not on the circle.<br>
	 * Default values can be overridden in the method call.
	 * 
	 * @return the defaultBlank
	 */
	public static char getDefaultBlank() {
		return defaultBlank;
	}

	/**
	 * Set the default char to represent points not on the circle.<br>
	 * 
	 * @param defaultBlank the defaultBlank to set
	 */
	public static void setDefaultBlank(char defaultBlank) {
		Circle.defaultBlank = defaultBlank;
	}

	/**
	 * Draws an ascii circle of a given radius.<br>
	 * Points on the circle are represented by the char passed as "sign".<br>
	 * Points off the circle are represented by the char passed as "blank".
	 * 
	 * @param radius an int, the radius of the circle
	 * @param sign   a char, the char to represent points on the circle.
	 * @param blank  a char, the char to represent points not on the circle.
	 */
	public static void draw(int radius, char sign, char blank) {

		int comparer;

		for (int y = 0; y < 2 * radius + 1; y++) {
			for (int x = 0; x < 2 * radius + 1; x++) {
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

	/**
	 * Draws an ascii circle of a given radius.<br>
	 * Points on the circle are represented by the char passed as "sign".<br>
	 * Points not on the circle are represented by the defaultBlank attribute.<br>
	 * This is initialized as ' ', but can be changed using setDefaultBlank().
	 * 
	 * @param radius an int, the radius of the circle
	 * @param sign   a char, the char to represent points on the circle.
	 */
	public static void draw(int radius, char sign) {
		draw(radius, sign, defaultBlank);
	}

	/**
	 * Draws an ascii circle of a given radius.<br>
	 * Points on the circle are represented by the defaultSign attribute.<br>
	 * This is initialized as '#', but can be changed using setDefaultSign().<br>
	 * Points not on the circle are represented by the defaultBlank attribute.<br>
	 * This is initialized as ' ', but can be changed using setDefaultBlank().
	 * 
	 * @param radius an int, the radius of the circle
	 */
	public static void draw(int radius) {
		draw(radius, defaultSign, defaultBlank);
	}

} // end of class
