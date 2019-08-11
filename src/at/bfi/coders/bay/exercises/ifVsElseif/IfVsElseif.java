package at.bfi.coders.bay.exercises.ifVsElseif;

/**
 * 
 * @author groiq
 *
 */
public class IfVsElseif {
	
	private static void coffeeBreak(boolean aliceIsThere, boolean bobIsThere) {
		
		System.out.println("<method called with these parameters:>");
		System.out.println("<aliceIsThere: " + aliceIsThere + ", bobIsThere: " + bobIsThere + ">");
		System.out.println("It's coffee break time!");
		
		if (aliceIsThere) {
			System.out.println("Alice is making coffee.");
		} else if (bobIsThere) {
			System.out.println("Bob is making coffee.");
		} else {
			System.out.println("Nobody's here, so nobody's making any coffee.");
		}
		
		if (aliceIsThere) {
			System.out.println("Alice is having some coffee.");
		}
		if (bobIsThere) {
			System.out.println("Bob is having some coffee.");
		}
		
		if (aliceIsThere) {
			System.out.println("Alice brought cookies.");
			if (bobIsThere) {
				System.out.println("Bob is having some cookies.");
			}
		}
		
		if (bobIsThere) {
			System.out.println("Bob is loading the dishwasher.");
		} else {
			if (aliceIsThere) {
				System.out.println("Alice is loading the dishwasher.");
			} else {
				System.out.println("Since there's nobody here, there's no dirty cups either.");
			}
		}

		
		
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
