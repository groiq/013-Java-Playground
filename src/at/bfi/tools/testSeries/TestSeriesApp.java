/**
 * Tests the testSeries package.
 */
package at.bfi.tools.testSeries;

public class TestSeriesApp {

	public static void main(String[] args) {
		
		// start test series
		TestObject.startNewTestSeries();
		
		// create an object
		TestObject obj_1 = new TestObject();
		
		// change the object
		TestObject obj_2 = new TestObject();
		
		obj_1.change();
		
		
		// stop test series
		TestObject.stopTestSeries();

		// view log 
		TestObject.printOverallLog();
		obj_1.printLog();
	
		
	}

}
