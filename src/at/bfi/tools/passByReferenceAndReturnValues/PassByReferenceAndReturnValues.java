/**
 * Some tests on the subject of changing object variables in-place.
 */

package at.bfi.tools.passByReferenceAndReturnValues;

import java.util.Arrays;

public class PassByReferenceAndReturnValues {
	
	private static int changes = 0;
//	private static int 

	public static void main(String[] args) {
		
		Tester t1 = new Tester("t1",0);
		Tester t2 = new Tester("t2",0);
		System.out.println(t1);
		System.out.println(t2);

	}
	
	
}

 class Tester {
	
	 final String name;
	 int changes;
	 final int objCount;
	 private static int runningObjectCounter = 0;
	 
	int getChanges() {
		return changes;
	}
	void setChanges(int changes) {
		this.changes = changes;
	}
	String getName() {
		return name;
	}
	int getObjCount() {
		return objCount;
	}
	public Tester(String name, int changes) {
		super();
		this.name = name;
		this.changes = changes;
		this.objCount = runningObjectCounter;
		runningObjectCounter += 1;
	}
	@Override
	public String toString() {
		return "Tester [name=" + name + ", changes=" + changes + ", objCount=" + objCount + "]";
	}
	 
	 

	 
	
	 
}