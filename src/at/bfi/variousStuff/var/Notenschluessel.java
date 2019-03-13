package at.bfi.variousStuff.var;

public class Notenschluessel {
	
	private static int[] upperLimits = {100,90,80,70,50};
	
	private static String[] comments = {
			"Ausgezeichnet",
			"Sehr gut",
			"gut",
			"nicht bestanden, Wiederholung möglich",
			"nicht bestanden, Wiederholung nicht möglich"
	};
	
	public static String giveFeedback(int points) {
		
//		int pos = 0;
		String comment;
		
		if (points < 0) {
			comment = "Error: cannot get negative points";
		} else if (points > upperLimits[0]) {
			comment = "Error: more points than can be achieved";
		} else {
			int pos = 0;
			//while (points < upperLimits[pos] && pos < upperLimits.length-1) { pos++; }
			while (pos < upperLimits.length && points < upperLimits[pos]) { pos++; }
			comment = comments[pos-1];
		}
		
		return comment;
	}
	
	// fun: make points distribution editable

	public static void main(String[] args) {
		/*
		 * 90-100: "Ausgezeichnet"
		 * 80-90: "Sehr gut"
		 * 70-80: "gut"
		 * 50-70: "nicht bestanden, Wiederholung möglich
		 * 0-50: "nicht bestanden, Wiederholung nicht möglich"
		 */
		for (int i = -15; i < 115; i += 10) {
			System.out.println(i + " Punkte: " + giveFeedback(i));
		}

	}

}
