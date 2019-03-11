package at.bfi.tools.testSeries;

import java.util.ArrayList;

public class TestObject {
	
	private static boolean running = false;
	private static int objectCounter = -1;
	private static int changeCounter = -1;
	private static ArrayList<LogEntry> overallChangelog;
	
	private final int objectIndex;
	private final ArrayList<LogEntry> changelog;
	
	static boolean isRunning() {
		return running;
	}
	static int getObjectCounter() {
		return objectCounter;
	}
	static int getChangeCounter() {
		return changeCounter;
	}
	static ArrayList<LogEntry> getOverallChangelog() {
		return overallChangelog;
	}
	int getObjectIndex() {
		return objectIndex;
	}
	ArrayList<LogEntry> getChangelog() {
		return changelog;
	}
	
	//constructor
	public TestObject() {
		this.objectIndex = objectCounter;
		this.changelog = new ArrayList<LogEntry>();
		this.changeInternal("constructor");
		objectCounter++;
	}
	
	//change()
	public void change() {
		this.changeInternal("change()");
	}
	
	private void changeInternal(String command) {
		LogEntry newEntry = new LogEntry(this, changeCounter, command);
		this.changelog.add(newEntry);
		overallChangelog.add(newEntry);
		changeCounter++;
	}
	
	// start()
	public static void startNewTestSeries() {
		running = true;
		objectCounter = 0;
		changeCounter = 0;
		overallChangelog = new ArrayList<LogEntry>();
	}
	
	public static void stopTestSeries() {
		running = false;
	}
	
	public static void printOverallLog() {
		System.out.println("overall change log:");
		for (LogEntry logEntry : overallChangelog) {
			System.out.println(logEntry);
		}
	}
	
	public void printLog() {
		System.out.println("change log for object " + this.objectIndex);
		for (LogEntry logEntry : changelog) {
			System.out.println(logEntry);
		}
	}

	/*
	 * for later:
	 * handle cases where objects are manipulated when there's no test series running
	 * make some better print routines
	 */


}
