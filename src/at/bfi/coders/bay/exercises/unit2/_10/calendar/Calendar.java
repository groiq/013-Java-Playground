package at.bfi.coders.bay.exercises.unit2._10.calendar;

// string concat: https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8

public class Calendar {
	
	static int monthLen = 31;
	static int methodUsed = 2;
	private static String result;
	
	/**
	 * 
	 * @param weekdayOfFirst - the weekday the first of the month falls on.
	 * @return a calendar table as a multi-line string
	 */
	public static String printCalendar(int weekdayOfFirst) {
		result = "";
		result += "MO|DI|MI|DO|FR|SA|SO\n";
//		result += "--|--|--|--|--|--|--\n";
		result += "--------------------\n";
		
		for (int i = 1; i <weekdayOfFirst; i++) {
			result += "  |";
		}
		
		System.out.println("<using method " + methodUsed + ">");
		if (methodUsed == 0) {
			curWeekdayInSeperateVar(weekdayOfFirst);
		} else if (methodUsed == 1) {
			curWeekdayInLoopHeader(weekdayOfFirst);
		} else if (methodUsed == 2) {
			noWeekdayVariable(weekdayOfFirst);
		}
		
		return result;
	}

	// variant: weekday handled seperately in a variable
	private static void curWeekdayInSeperateVar(int weekdayOfFirst) {
//		System.out.println("<method 0>");
		int curWeekday = weekdayOfFirst;
		for (int curDay = 1; curDay <= monthLen; curDay++) {
//			result += "00";
			result += String.format("%2d", curDay);
			if (curWeekday % 7 == 0) {
				result += "\n";
			} else {
				result += "|";
			}
			curWeekday++;
		}
	}

		// variant: current weekday gets its own variable in the loop header
		private static void curWeekdayInLoopHeader(int weekdayOfFirst) {
		for (int curDay = 1, curWeekday = weekdayOfFirst; curDay <= monthLen; curDay++, curWeekday++) {
			result += String.format("%2d", curDay);
			if (curWeekday % 7 == 0) {
				result += "\n";
			} else {
				result += "|";
			}
		}
		
	}
	
	// variant: no weedkay variable, weekday is calculated on-the-fly
	private static void noWeekdayVariable(int weekdayOfFirst) {
		for (int curDay = 1; curDay <= monthLen; curDay++) {
			result += String.format("%2d", curDay);
			if ((weekdayOfFirst + curDay - 1) % 7 == 0) {
				result += "\n";
			} else {
				result += "|";
			}
		}
	}

}
