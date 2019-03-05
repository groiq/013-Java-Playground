package at.bfi.assignments.conditionals;

public class NumberToName {
	

	/**
	 * Assignment:
	 * Write a program that converts number from 0 … 9 in words (“zero”, “one”,
	 * “two”, …). You can do this with if-else or switch case, but don’t forget a
	 * default case!
	 */	
	
	static String[] names = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	static String warning = "not a valid number!";
	
	/**
	 * changes a number to its name.
	 * @param num - a positive one-digit decimal int.
	 * @return - the name of that number
	 */
	public static String toNameProper(int num) {
		String name;
		switch(num) {
		case 0: name = "zero";
		break;
		case 1: name = "one";
		break;
		case 2: name = "two";
		break;
		case 3: name = "three";
		break;
		case 4: name = "four";
		break;
		case 5: name = "five";
		break;
		case 6: name = "six";
		break;
		case 7: name = "seven";
		break;
		case 8: name = "eight";
		break;
		case 9: name = "nine";
		break;
		default: name = warning;
		}
//		System.out.println("num: " + num + ", name: " + name);
		return name;
	}
	
	/**
	 * a more concise variant, but it doesn't fulfill the requirements of the assignment.
	 * Though it does technically use an if-else-statement.
	 * @param num
	 * @return
	 */
	public static String toNameQuick(int num) {
		String name;
		if (num >= 0 && num < 10) {
			name = names[num];
		} else {
			name = warning;
		}
//		System.out.println("num: " + num + ", name: " + name);
		return name;
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
