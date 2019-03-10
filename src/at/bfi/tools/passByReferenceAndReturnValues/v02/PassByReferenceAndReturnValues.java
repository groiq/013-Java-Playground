package at.bfi.tools.passByReferenceAndReturnValues.v02;

import java.util.ArrayList;

import at.bfi.tools.passByReferenceAndReturnValues.v02.Tester;

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
	
	/*
	 * These are basically newObjectSameVariable, sameObjectSameVariable and newObjectNewVariable.
	 * What's missing is 'sameObjectNewVariable'. That'd be 'Tester output = input;'.
	 */
	
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
	private final int objectIndex;
	
	private static int changeCounter = 0;
	private final static ArrayList<ChangeLogEntry> overallChangeLog = new ArrayList<ChangeLogEntry>();
	private final ArrayList<ChangeLogEntry> changeLog;
	
	
	
	static int getObjectCounter() {
		return objectCounter;
	}
	static void setObjectCounter(int objectCounter) {
		Tester.objectCounter = objectCounter;
	}
	static int getChangeCounter() {
		return changeCounter;
	}
	static void setChangeCounter(int changeCounter) {
		Tester.changeCounter = changeCounter;
	}
	int getObjectIndex() {
		return objectIndex;
	}
	static ArrayList<ChangeLogEntry> getOverallchangelog() {
		return overallChangeLog;
	}
	ArrayList<ChangeLogEntry> getChangeLog() {
		return changeLog;
	}
	
	public Tester() {
		super();
		this.objectIndex = objectCounter;
		objectCounter++;
		this.changeLog = new ArrayList<ChangeLogEntry>();
//		this.changeLog.add(changeCounter);
		changeInternal("constructor");
	}
	
	@Override
	public String toString() {
		return "Tester [objectIndex=" + objectIndex + ", changeLog=" + changeLog + "]";
	}
	
	public void change() {
		changeInternal("change()");
	}
	
	private void changeInternal(String command) {
		ChangeLogEntry newEntry = new ChangeLogEntry(changeCounter, this, command);
		this.changeLog.add(newEntry);
		overallChangeLog.add(newEntry);
		changeCounter++;
	}
	/*
	 * For later: store objects in a hashmap keyed by what is now the object index,
	 * and changes in a hashmap keyed by the change indices.
	 * Make those two static fields of the Tester class.
	 * 
	 * Make "change tracking class" a side project. When finished with that, do the pass-by-reference tests again.
	 * To be more elegant, make a "test series" class that holds the changelog and object list.
	 */
	
}

class ChangeLogEntry {
	
	private final int index;
	private final Tester object;
	private final String command;
	int getIndex() {
		return index;
	}
	Tester getObject() {
		return object;
	}
	String getCommand() {
		return command;
	}
	
	public ChangeLogEntry(int index, Tester object, String command) {
		super();
		this.index = index;
		this.object = object;
		this.command = command;
	}
	@Override
	public String toString() {
		return "ChangeLogEntry [index=" + index + ", object=" + object.getObjectIndex() + ", command=" + command + "]";
	}
	
	

	
	
	
}