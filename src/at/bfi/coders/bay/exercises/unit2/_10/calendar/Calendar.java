package at.bfi.coders.bay.exercises.unit2._10.calendar;

// string concat: https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8

public class Calendar {
	
	static int monthLen = 31;
	static int methodUsed = 0;
	private static String result;
	
	public static String printCalendar(int weekdayOfFirst) {
		result = "";
		result += "MO|DI|MI|DO|FR|SA|SO\n";
//		result += "--|--|--|--|--|--|--\n";
		result += "--------------------\n";
		
		for (int i = 1; i <weekdayOfFirst; i++) {
			result += "  |";
		}
		
		if (methodUsed == 0) {
			curWeekdayInSeperateVar(weekdayOfFirst);
		} else if (methodUsed == 1) {
			curWeekdayInLoopHeader(weekdayOfFirst);
		} else if (methodUsed == 2) {
			noWeekdayVariable(weekdayOfFirst);
		}
		
		
		// variant: two variables in for loop
		
		
		// variant: calculate weekday on the fly
		
		
		return result;
	}

	private static void curWeekdayInSeperateVar(int weekdayOfFirst) {
		// variant: weekday handled seperately in a variable
		int curWeekday = weekdayOfFirst;
		for (int curDay = 1; curDay <= monthLen; curDay++) {
			result += "00";
			if (curWeekday % 7 == 0) {
				result += "\n";
			} else {
				result += "|";
			}
			curWeekday++;
		}
	}

	private static void curWeekdayInLoopHeader(int weekdayOfFirst) {
		// variant: current weekday gets its own variable in the loop header
		for (int curDay = 1, curWeekday = weekdayOfFirst; curDay <= monthLen; curDay++, curWeekday++) {
			result += "11";
			if (curWeekday % 7 == 0) {
				result += "\n";
			} else {
				result += "|";
			}
		}
		
	}
	
	private static void noWeekdayVariable(int weekdayOfFirst) {
		for (int curDay = 1; curDay <= monthLen; curDay++) {
			result += "22";
			if ((weekdayOfFirst + curDay - 1) % 7 == 0) {
				result += "\n";
			} else {
				result += "|";
			}
		}
	}

}
