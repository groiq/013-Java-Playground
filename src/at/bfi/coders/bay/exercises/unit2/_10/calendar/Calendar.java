package at.bfi.coders.bay.exercises.unit2._10.calendar;

/**
 * Calendar printing utility.
 * @author groiq
 *
 */
public class Calendar {
	
	static int monthLen = 31;
	static int methodUsed = 4;
	private static String result;
	
	/**
	 * Generates a multi-line string depicting a one-month calendar in table format.
	 * 
	 * For now, the month is hardcoded to have 31 days.
	 * 
	 * Takes the weekday of the first of the month as argument.
	 * Week starts with Monday, counting with 1. thus:
	 * 1 - Monday
	 * 2 - Tuesday
	 * 3 - Wednesday
	 * 4 - Thursday
	 * 5 - Friday
	 * 6 - Saturday
	 * 7 - Sunday
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
		
		/*
		 * I've tried out several ways of tracking the day of week.
		 * Methods are switched through the field "methodUsed".
		 */
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
