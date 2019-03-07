package at.bfi.assignments.conditionals;

public class NumberToName {
	

	/**
	 * Assignment:
	 * Write a program that converts number from 0 … 9 in words (“zero”, “one”,
	 * “two”, …). You can do this with if-else or switch case, but don’t forget a
	 * default case!
	 */	
	
//	static String[] names = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	/*
	 *  Was a field originally, but I felt I'd misrepresent the respective complexities of the methods
	 *  if I didn't include the array in the definition of toNameQuick().
	 */
	
	/*
	 * for later: replace error-message-as-return-string with a proper exception. Needs some strategies to reusing exception code.
	 */
	static String warning = "not a valid number. num must be a positive one-digit decimal integer.";
	
	public static void blowUp() {
		throw new IllegalArgumentException("num must be a positive one-digit decimal integer");
	}
	
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
//		default: name = warning;
		default: throw new IllegalArgumentException(warning);
//		default: blowUp();
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
		String[] names = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String name;
		if (num >= 0 && num < 10) {
			name = names[num];
		} else {
//			name = warning;
			throw new IllegalArgumentException(warning);
//			blowUp();
		}
//		System.out.println("num: " + num + ", name: " + name);
		return name;
	}
	
	/**
	 * a little helper for coding up the switch statement.
	 */
	public static void setUpSwitch() {
		String[] names = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for (int i = 0; i < names.length; i++) {
			System.out.println("case " + i + ": result = \"" + names[i] + "\";\nbreak;");
		}
	}

	public static void main(String[] args) {
		
//		setUpSwitch();
		int start,end;
//		start = -1; // test error handling: negative values
		start = 0;
		end = 10;
//		end = 11; // test error handling: multi-digit integers
		
		
		
		System.out.println("Using a switch statement:");
		for (int i = start; i < end; i++) {
			System.out.println(i + " -> " + toNameProper(i));
		}
		
		System.out.println("---");
		
		System.out.println("using a String[]:");
		for (int i = start; i < end; i++) {
			System.out.println(i + " -> " + toNameQuick(i));
		}
		
		/*
		 * For later: fix this setup. The way it is done, exception handling on the second method is never tested
		 * because if the code throws exception on one method, it throws on both of them.
		 */

	}

}
