package at.bfi.tools.passByReferenceAndReturnValues;

import java.util.ArrayList;

import at.bfi.tools.passByReferenceAndReturnValues.Tester;

public class PassByReferenceAndReturnValues {

	public static void main(String[] args) {
		
		Tester tester = new Tester();
		System.out.println(tester);
		
		System.out.println("reassignObject");
		System.out.println(tester);
		tester = reassignObject(tester);
		System.out.println(tester);
		reassignObject(tester);
		System.out.println(tester);
		
		System.out.println("changeObjectInPlace");
		System.out.println(tester);
		tester = changeObjectInPlace(tester);
		System.out.println(tester);
		changeObjectInPlace(tester);
		System.out.println(tester);
		
		System.out.println("returnNewVariable");
		System.out.println(tester);
		tester = returnNewVariable(tester);
		System.out.println(tester);
		returnNewVariable(tester);
		System.out.println(tester);
		
		System.out.println("reassignObjectVoid");
		System.out.println(tester);
		reassignObjectVoid(tester);
		System.out.println(tester);
		
		System.out.println("changeObjectInPlaceVoid");
		System.out.println(tester);
		changeObjectInPlaceVoid(tester);
		System.out.println(tester);
		
		System.out.println("returnNewVariableVoid");
		System.out.println(tester);
		returnNewVariableVoid(tester);
		System.out.println(tester);

	}
	
	private static Tester reassignObject(Tester input) {
		input = new Tester();
		return input;
	}
	
	private static Tester changeObjectInPlace(Tester input) {
		input.change();
		return input;
	}
	
	private static Tester returnNewVariable(Tester input) {
		Tester output = new Tester();
		return output;
	}
	
	private static void reassignObjectVoid(Tester input) {
		input = new Tester();
	}
	
	private static void changeObjectInPlaceVoid(Tester input) {
		input.change();
	}
	
	private static void returnNewVariableVoid(Tester input) {
		Tester output = new Tester();
	}
	



}

class Tester {
	
	private static int objectCounter = 0;
	private static int changeCounter = 0;
	private final int objectIndex;
	private ArrayList<Integer> changeLog;
	ArrayList<Integer> getChangeLog() {
		return changeLog;
	}
	void setChangeLog(ArrayList<Integer> changeLog) {
		this.changeLog = changeLog;
	}
	static int getObjectCounter() {
		return objectCounter;
	}
	static int getChangeCounter() {
		return changeCounter;
	}
	int getObjectIndex() {
		return objectIndex;
	}
	
	public Tester() {
		super();
		this.objectIndex = objectCounter;
		objectCounter++;
		this.changeLog = new ArrayList<Integer>();
		this.changeLog.add(changeCounter);
		changeCounter++;
	}
	@Override
	public String toString() {
		return "Tester [objectIndex=" + objectIndex + ", changeLog=" + changeLog + "]";
	}
	
	public void change() {
		this.changeLog.add(changeCounter);
		changeCounter++;
	}
	/*
	 * for later: write a more verbose changelog, including change number, command invoked and object involved.
	 * Also write an object list.
	 */
	
	
}