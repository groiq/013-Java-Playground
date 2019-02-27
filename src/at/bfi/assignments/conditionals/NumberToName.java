package at.bfi.assignments.conditionals;

public class NumberToName {
	
	static String[] names = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	static String warning = "not a valid number!";
	
	/**
	 * changes a number to its name.
	 * @param num - a positive one-digit decimal int.
	 * @return - the name of that number
	 */
	public static String toNameProper(int num) {
		String result;
		switch(num) {
		case 0: result = "zero";
		break;
		case 1: result = "one";
		break;
		case 2: result = "two";
		break;
		case 3: result = "three";
		break;
		case 4: result = "four";
		break;
		case 5: result = "five";
		break;
		case 6: result = "six";
		break;
		case 7: result = "seven";
		break;
		case 8: result = "eight";
		break;
		case 9: result = "nine";
		break;
		default: result = warning;
		}
		return result;
	}
	
	/**
	 * a more concise variant, but it doesn't fulfill the requirements of the assignment.
	 * Though it does technically use an if-else-statement.
	 * @param num
	 * @return
	 */
	public static String toNameQuick(int num) {
		String result;
		if (num >= 0 && num < 10) {
			result = names[num];
		} else {
			result = warning;
		}
		return result;
	}
	
	/**
	 * a little helper for coding up the switch statement.
	 */
	public static void setUpSwitch() {
		for (int i = 0; i < names.length; i++) {
			System.out.println("case " + i + ": result = \"" + names[i] + "\";\nbreak;");
		}
	}

	public static void main(String[] args) {
		
//		setUpSwitch();
		
		for (int i = -1; i <= 10; i++) {
			System.out.println(i + " -> " + toNameProper(i));
		}
		
		System.out.println("---");
		
		for (int i = -1; i <= 10; i++) {
			System.out.println(i + " -> " + toNameQuick(i));
		}

	}

}
