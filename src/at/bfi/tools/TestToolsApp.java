/**
 * Testing ground for any tools I might write in this package.
 */

package at.bfi.tools;

public class TestToolsApp {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3};
		String[] strArray;
//		strArray = {"a-one","a-two","a-one-two-three-four"};
		strArray = new String[100];
		
		for (Integer i = 0; i < strArray.length; i++) {
//			String string = strArray[i];
			strArray[i] = i.toString();
		}
		
		P.print(strArray);
		
		
		
//		P.print(intArray);
//		P.print(strArray);
//		System.out.println(intArray.getClass());
//		System.out.println(strArray.getClass());
		
//		for (Object o : strArray) {
//			System.out.println(o);
//		}
		
//		for (Object o : intArray) {
//			System.out.println(o);
//		}

	}

}
