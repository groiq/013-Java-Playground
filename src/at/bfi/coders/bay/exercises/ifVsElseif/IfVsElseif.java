package at.bfi.coders.bay.exercises.ifVsElseif;

public class IfVsElseif {
	
	private static void coffeeBreak(boolean aliceIsThere, boolean bobIsThere) {
		
		System.out.println("<method called with these parameters:>");
		System.out.println("<aliceIsThere: " + aliceIsThere + ", bobIsThere: " + bobIsThere + ">");
		System.out.println("It's coffee break time!");
		
		
		
		
		System.out.println("-----------------------------------");
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		coffeeBreak(false,false);
		coffeeBreak(false,true);
		coffeeBreak(true,false);
		coffeeBreak(true,true);
		

	}

}
