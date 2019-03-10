package at.bfi.tools.passByReferenceAndReturnValues;

import java.util.ArrayList;

import at.bfi.tools.passByReferenceAndReturnValues.Tester;

public class PassByReferenceAndReturnValues {

	public static void main(String[] args) {
		
		Tester tester = new Tester();
		System.out.println(tester);
		
		

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