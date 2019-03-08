package at.bfi.assignments.strings.stringComparison;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1 = "Fliegen";
		System.out.println("s1: " + s1);
		String s2 = "Fliegen";
		System.out.println("s2: " + s2);
		String lowercase = "fliegen";
		System.out.println("lowercase: " + lowercase);
		String s1copy = s1;
		System.out.println("s1copy: " + s1copy);
		
		System.out.println();
		
		System.out.println("s1 == s2:");
		System.out.println(s1 == s2);
		
		System.out.println("s1.equals(s2):");
		System.out.println(s1.equals(s2));
		
		System.out.println("s1 == s1copy");
		System.out.println(s1 == s1copy);
		
		System.out.println("s1 == 'Fliegen'");
		System.out.println(s1 == "Fliegen");
		
		System.out.println("String and char[]:");
		String brief = "fly";
		char[] briefAr = {'f','l','y'};
//		System.out.println(brief == briefAr); //syntax error
		System.out.println(brief.equals(briefAr));
		
		System.out.println("s1 and lowercase:");
		System.out.println(s1.equals(lowercase));
		System.out.println(s1.contentEquals(lowercase));
		System.out.println(s1.equalsIgnoreCase(lowercase));
		
//		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println("compareTo");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(lowercase));
		
		System.out.println("regex");
		System.out.println(s1.matches(s2));
		System.out.println(s1.matches("Flie.?en"));
		System.out.println(s1.matches("Flieg.?en"));
		System.out.println(s1.matches("Flieg.+en"));
		
	}

}
