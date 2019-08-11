package at.bfi.coders.bay.exercises.unit2._10.calendar;

// string concat: https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8

public class Calendar {
	
	static int monthLen = 31;
	static int methodUsed = 4;
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
		switch (methodUsed) {
		case 0:
			weekdayInLoopBodyResetting(weekdayOfFirst);
			break;
		case 1:
			weekdayInLoopBodyContinuing(weekdayOfFirst);
			break;
		case 2:
			weekdayInLoopHeaderResetting(weekdayOfFirst);
			break;
		case 3:
			weekdayInLoopHeaderContinuing(weekdayOfFirst);
			break;
		case 4:
			noWeekdayVariable(weekdayOfFirst);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + methodUsed);
		}
		
		return result;
	}

	// variant: weekday gets its own variable in the loop body, reset weekly
	private static void weekdayInLoopBodyResetting(int weekdayOfFirst) {
//		System.out.println("<method 0>");
		int curWeekday = weekdayOfFirst % 7;
		for (int curDay = 1; curDay <= monthLen; curDay++) {
//			result += "00";
			result += String.format("%2d", curDay);
			if (curWeekday == 0) {
				result += "\n";
			} else {
				result += "|";
			}
			curWeekday = (curWeekday + 1) %7;
		}
	}

	// variant: weekday gets its own variable in the loop body, not reset weekly
	private static void weekdayInLoopBodyContinuing(int weekdayOfFirst) {
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

	// variant: current weekday gets its own variable in the loop header, reset weekly
		private static void weekdayInLoopHeaderResetting(int weekdayOfFirst) {
		for (int curDay = 1, curWeekday = weekdayOfFirst % 7; curDay <= monthLen; curDay++, curWeekday = (curWeekday + 1) % 7) {
			result += String.format("%2d", curDay);
			if (curWeekday == 0) {
				result += "\n";
			} else {
				result += "|";
			}
		}
		
	}

	// variant: current weekday gets its own variable in the loop header, not reset weekly
	private static void weekdayInLoopHeaderContinuing(int weekdayOfFirst) {
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
