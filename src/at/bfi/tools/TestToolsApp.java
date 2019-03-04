/**
 * Testing ground for any tools I might write in this package.
 */

package at.bfi.tools;

public class TestToolsApp {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3};
		String[] strArray = {"a-one","a-two","a-one-two-three-four"};
		
//		P.print(intArray);
//		P.print(strArray);
		
		for (Object o : strArray) {
			System.out.println(o);
		}
		
		for (Object o : intArray) {
			System.out.println(o);
		}

	}

}
