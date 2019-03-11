package at.bfi.tools.passByReferenceAndReturnValues.v03;

import at.bfi.tools.testSeries.TestObject;

public class TestReturnValues {

	public static void main(String[] args) {
		
		TestObject.startNewTestSeries();
		
		TestObject tester = new TestObject();
		
		
		
		TestObject.printOverallLog();

	}
	
	private static TestObject sameObjectSameVariable(TestObject input) {
		input.change();
		return input;
	}
	
	private static TestObject sameObjectNewVariable(TestObject input) {
		TestObject output = input;
		output.change();
		return output;
	}
	
	private static TestObject newObjectSameVariable(TestObject input) {
		input = new TestObject();
		input.change();
		return input;
	}
	
	private static TestObject newObjectNewVariable(TestObject input) {
		TestObject output = new TestObject();
		output.change();
		return output;
	}
	
	private static void sameObjectSameVariableVoid(TestObject input) {
		input.change();
	}
	
	private static void sameObjectNewVariableVoid(TestObject input) {
		TestObject output = input;
		output.change();
	}
	
	private static void newObjectSameVariableVoid(TestObject input) {
		input = new TestObject();
		input.change();
	}
	
	private static void newObjectNewVariableVoid(TestObject input) {
		TestObject output = new TestObject();
		output.change();
	}
	

}
