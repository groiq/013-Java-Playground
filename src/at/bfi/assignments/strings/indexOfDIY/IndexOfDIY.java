package at.bfi.assignments.strings.indexOfDIY;

import java.util.Iterator;

public class IndexOfDIY {

	public static void main(String[] args) {
		
		String text = "There's a trea-treasure hidden somewhere in here.";
		String wanted = "treasure";
		String quote = "\"";

		int position = indexOfDIY(text, wanted);
		
		System.out.println(quote + wanted + quote + " found in " + quote + text + quote + " at position " + position);

	}

	private static int indexOfDIY(String text, String wanted) {

		int pos = -1;
		char digHere = wanted.charAt(0);
		boolean searching = false;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == digHere) {
				searching = true;
				for (int j = 0; j < wanted.length(); j++) {
//					System.out.println("i: " + i + ", j: " + j + ", in text: " + text.charAt(i+j) + ", " + "in wanted: " + wanted.charAt(j));
					if (wanted.charAt(j) != text.charAt(i+j)) {
						searching = false;
						break;
					}
				}
				if (searching) {
					pos = i;
					break;
				}
			}
		}
		
		
		
		return pos;
		
	}

}
