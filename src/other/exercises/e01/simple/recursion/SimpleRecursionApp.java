package other.exercises.e01.simple.recursion;

import java.util.Arrays;

/**
 * Simple example for recursion from https://www.essentialsql.com/recursive-ctes-explained/
 * @author HAL
 *
 */
public class SimpleRecursionApp {
	
	private static String[] names;
	private static Queuer[] queuers;

	public static Queuer getQueuer(String name) {
		int pos = Arrays.asList(names).indexOf(name);
//		System.out.println(pos);
		return queuers[pos];
	}
	

	public static void main(String[] args) {
		
		
		names = new String[26];
		queuers = new Queuer[26];
		
		Queuer lastInLine = null;
		Queuer nextInLine;
		
		
		for (int i = 0; i < names.length; i++) {
			char charForName = (char) ('A' + i);
			names[i] = String.valueOf(charForName);
			
			nextInLine = new Queuer(names[i]);
			nextInLine.queueBehind(lastInLine);
			lastInLine = nextInLine;
			queuers[i] = nextInLine;
			
		}
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(queuers));

//		// some tests
//		System.out.println("calling " + getQueuer("Q"));
//		System.out.println("calling " + getQueuer("U"));
//		System.out.println("calling " + getQueuer("E"));
//		System.out.println("calling " + getQueuer("U"));
//		System.out.println("calling " + getQueuer("E"));

		System.out.println(getQueuer("A").getPosition());
		System.out.println(getQueuer("C").getPosition());
		System.out.println(getQueuer("C").getPosition());
		System.out.println(getQueuer("G").getPosition());

	}

}
