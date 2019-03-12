package at.bfi.tools.passByReferenceAndReturnValues.v03;

import at.bfi.tools.testSeries.TestObject;

public class TestReturnValues {

	public static void main(String[] args) {
		
		TestObject.startNewTestSeries();
		
		TestObject tester = new TestObject("tester = new TestObject()");
		
		tester = sameObjectSameVariable(tester, "tester = sameObjectSameVariable(tester)");
		sameObjectSameVariable(tester, "sameObjectSameVariable(tester)");
		tester = sameObjectNewVariable(tester, "tester = sameObjectNewVariable(tester)");
		sameObjectNewVariable(tester, "sameObjectNewVariable(tester)");
		tester = newObjectSameVariable(tester, "tester = newObjectSameVariable(tester)");
		newObjectSameVariable(tester, "newObjectSameVariable(tester)");
		tester = newObjectNewVariable(tester, "tester = newObjectNewVariable(tester)");
		newObjectNewVariable(tester, "newObjectNewVariable(tester)");
		
		sameObjectSameVariableVoid(tester, "sameObjectSameVariableVoid(tester)");
		sameObjectNewVariableVoid(tester, "sameObjectNewVariableVoid(tester)");
		newObjectSameVariableVoid(tester, "newObjectSameVariableVoid(tester)");
		newObjectNewVariableVoid(tester, "newObjectNewVariableVoid(tester)");
		
		
		TestObject.printOverallLog();

	}
	
	private static TestObject sameObjectSameVariable(TestObject input, String command) {
		input.change(command);
		return input;
	}
	
	private static TestObject sameObjectNewVariable(TestObject input, String command) {
		TestObject output = input;
		output.change(command);
		return output;
	}
	
	private static TestObject newObjectSameVariable(TestObject input, String command) {
		input = new TestObject(command);
		input.change(command);
		return input;
	}
	
	private static TestObject newObjectNewVariable(TestObject input, String command) {
		TestObject output = new TestObject(command);
		output.change(command);
		return output;
	}
	
	private static void sameObjectSameVariableVoid(TestObject input, String command) {
		input.change(command);
	}
	
	private static void sameObjectNewVariableVoid(TestObject input, String command) {
		TestObject output = input;
		output.change(command);
	}
	
	private static void newObjectSameVariableVoid(TestObject input, String command) {
		input = new TestObject(command);
		input.change(command);
	}
	
	private static void newObjectNewVariableVoid(TestObject input, String command) {
		TestObject output = new TestObject(command);
		output.change(command);
	}
	

}
