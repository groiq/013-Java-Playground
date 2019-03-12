/*
 * Tests the testSeries package.
 */
package at.bfi.tools.testSeries;

public class TestSeriesApp {

	public static void main(String[] args) {
		
		// start test series
		TestObject.startNewTestSeries();
		
		// create an object
		TestObject obj_1 = new TestObject("test");
		
		// change the object
		TestObject obj_2 = new TestObject("test");
		
		obj_1.change("test");
		
		
		// stop test series
		TestObject.stopTestSeries();

		// view log 
		TestObject.printOverallLog();
		System.out.println();
		obj_1.printLog();
	
		
	}

}
