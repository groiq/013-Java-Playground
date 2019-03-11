package at.bfi.tools.testSeries;

import java.util.ArrayList;

public class TestSeries {
	
	private static boolean running = false;
	private static int objectCounter = -1;
	private static int changeCounter = -1;
	private static ArrayList<LogEntry> changelog;
	
	/**
	 * @return the objectCounter
	 */
	public static int getObjectCounter() {
		return objectCounter;
	}
	/**
	 * @return the changeCounter
	 */
	public static int getChangeCounter() {
		return changeCounter;
	}
	/**
	 * @return the changelog
	 */
	public static ArrayList<LogEntry> getChangelog() {
		return changelog;
	}
	
	// start()
	
	// make setters depend on whether this thing is running
	// increment numbers on retrieve
	
	// addLogEntry()?

}
