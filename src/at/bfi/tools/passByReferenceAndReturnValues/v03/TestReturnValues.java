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
		System.out.println();
		tester.printLog();
		
//		Output:
//			
//			overall change log:
//				index: 0, object: 0, command: "tester = new TestObject(): constructor"]
//				index: 1, object: 0, command: "tester = sameObjectSameVariable(tester): change()"]
//				index: 2, object: 0, command: "sameObjectSameVariable(tester): change()"]
//				index: 3, object: 0, command: "tester = sameObjectNewVariable(tester): change()"]
//				index: 4, object: 0, command: "sameObjectNewVariable(tester): change()"]
//				index: 5, object: 1, command: "tester = newObjectSameVariable(tester): constructor"]
//				index: 6, object: 1, command: "tester = newObjectSameVariable(tester): change()"]
//				index: 7, object: 2, command: "newObjectSameVariable(tester): constructor"]
//				index: 8, object: 2, command: "newObjectSameVariable(tester): change()"]
//				index: 9, object: 3, command: "tester = newObjectNewVariable(tester): constructor"]
//				index: 10, object: 3, command: "tester = newObjectNewVariable(tester): change()"]
//				index: 11, object: 4, command: "newObjectNewVariable(tester): constructor"]
//				index: 12, object: 4, command: "newObjectNewVariable(tester): change()"]
//				index: 13, object: 3, command: "sameObjectSameVariableVoid(tester): change()"]
//				index: 14, object: 3, command: "sameObjectNewVariableVoid(tester): change()"]
//				index: 15, object: 5, command: "newObjectSameVariableVoid(tester): constructor"]
//				index: 16, object: 5, command: "newObjectSameVariableVoid(tester): change()"]
//				index: 17, object: 6, command: "newObjectNewVariableVoid(tester): constructor"]
//				index: 18, object: 6, command: "newObjectNewVariableVoid(tester): change()"]
//
//				change log for object 3
//				index: 9, object: 3, command: "tester = newObjectNewVariable(tester): constructor"]
//				index: 10, object: 3, command: "tester = newObjectNewVariable(tester): change()"]
//				index: 13, object: 3, command: "sameObjectSameVariableVoid(tester): change()"]
//				index: 14, object: 3, command: "sameObjectNewVariableVoid(tester): change()"]
//

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
