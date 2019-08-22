package at.bfi.coders.bay.exercises.unit2._03;

public class UsingStringsObjectReference {

	static String hello;
	static String goodbye;
	
	private static void check() {
		System.out.println("value of first string: \"" 
	+ hello + "\"; value of second string: \"" + goodbye + "\".");
	}

	public static void main(String[] args) {
		
		// initialize Strings
		hello = "Hello World!";
		goodbye = "Good night";
		check();
		
		// put the two strings together
		hello += goodbye;
		check();
		
		// overwrite the first String with the value of the second String
//		hello = new String(goodbye);
		hello = goodbye;
		// apparently these two commands do the same thing.
		check();
		goodbye = "whut?";
		check();

	}

	
}
