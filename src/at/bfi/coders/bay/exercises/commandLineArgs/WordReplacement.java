package at.bfi.coders.bay.exercises.commandLineArgs;

/**
 * A demonstration of the basics of command line arguments.
 * This takes a sequence of words and replaces all instances of a given word with another one.
 * Expects at least three command line args.
 * The first is the word to be replaced (case-sensitive),
 * the second the replacement word
 * and all other arguments are the sequence to be processed.
 * 
 * Prints the replaced word, the replacement and the processed sequence.
 * 
 * If fewer than three args are given, prints a message and shuts down.
 * 
 * sample call:
 * >java WordReplacement fliegen robben wenn fliegen hinter fliegen fliegen fliegen fliegen fliegen nach
 * word to be replaced: fliegen
 * replacement word: robben
 * wenn robben hinter robben robben robben robben robben nach
 * 
 * @author groiq
 *
 */
public class WordReplacement {

	public static void main(String[] args) {
		
		if (args.length < 3) {
			System.out.println("Fewer than three arguments given. Shutting down.");
			return;
		}
		
		System.out.println("word to be replaced: " + args[0]);
		System.out.println("replacement word: " + args[1]);
		
		String result = "";
		for (int i = 2; i < args.length; i++) {
			if (args[i].equals(args[0])) {
				result += args[1];
			} else {
				result += args[i];
			}
			result += " ";
		}
//		System.out.println("result:");
		System.out.println(result);

	}

}
