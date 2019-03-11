package at.bfi.tools.testSeries;

public class LogEntry {
	
//	private final TestSeries series;
	private final TestObject object;
	private final int index;
	private final String command;
	
	public LogEntry(TestObject object, int index, String command) {
		super();
		this.object = object;
		this.index = index;
		this.command = command;
	}
	
	

}
