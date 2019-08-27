
package at.bfi.coders.bay.exercises.unit2._10.circle;

/**
 * Tester for the circle drawing program.
 * 
 * @author groiq
 * @version 1.0
 * @since 27.08.2019
 * 
 */
public class CircleTester {

	/**
	 * Draws three ascii circles with a fixed radius, using varying chars.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int radius = 10;

		Circle.draw(radius);
		System.out.println();
		Circle.draw(radius, '.');
		System.out.println();
		Circle.draw(radius, 'X', '.');

	}

}
