package at.bfi.coders.bay.exercises.ifVsElseif;

/**
 * Some demonstrations of combining if clauses. Explanations are in the source code.
 * @author groiq
 *
 */
public class IfVsElseif {
	
	/*
	 * order:
	 * whosHavingCoffee
	 * whosHavingCookies
	 * whosMakingCoffee
	 * whosLoadingTheDishwasher
	 */
	
	/*
	 * In my example I assume that Alice and Bob are two coworkers who often have coffee break together.
	 * Right now it's coffee break time, and what's happening in the break room depends on
	 * (a) whether Alice is having a break right now and 
	 * (b) whether Bob is having a break right now.
	 * 
	 * I am defining two variables named aliceIsThere and bobIsThere. These are both boolean,
	 * meaning they can be true or false.
	 * 
	 * I will then write a few code blocks, each of which checks for both variables in different combinations.
	 */
	private static void coffeeBreak(boolean aliceIsThere, boolean bobIsThere) {
		
		/*
		 * Let's start with a bit of output for clarity...
		 */
		System.out.println("<method called with these parameters:>");
		System.out.println("<aliceIsThere: " + aliceIsThere + ", bobIsThere: " + bobIsThere + ">");
		System.out.println("It's coffee break time!");
		
		/*
		 * First, I'll print who is having a break right now.
		 * For that, I'm checking each variable on its own.
		 */
		if (aliceIsThere) {
			System.out.println("Alice is having a break.");
		}
		
		if (bobIsThere) {
			System.out.println("Bob is having a break.");
		}
		
		/*
		 * Now I'll use an else if clause to decide who's making the coffee.
		 * First I check whether Alice is there. If yes, then she volunteers to make coffee.
		 * Only if Alice is not there, I'll check whether Bob is there to make coffee.
		 * (If Bob isn't there either, there's no need for coffee anyway.)
		 */
		if (aliceIsThere) {
			System.out.println("Alice is making coffee.");
		} else if (bobIsThere) {
			System.out.println("Bob is making coffee.");
		} else {
			System.out.println("Nobody's here, so nobody's making any coffee.");
		}
		
		/*
		 * Now I'll use two independent if clauses behind one another to decide who's having coffee.
		 * First I check whether Alice having some, and then - no matter what came out in the first check - 
		 * I check for Bob.
		 * Yes, that's just what I did in the beginning.
		 */
		if (aliceIsThere) {
			System.out.println("Alice is having some coffee.");
		}
		if (bobIsThere) {
			System.out.println("Bob is having some coffee.");
		}
		
		/*
		 * Now I use an if clause that *depends* on another.
		 * If Alice is here, she brought some cookies. If Bob is also here, he is having some.
		 * Whether Bob is here is only checked if Alice is here.
		 * 
		 */
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

	/*
	 * Now we run that code four times.
	 * 
	 * First we assume that neither Alice nor Bob are there,
	 * then that only Bob is there,
	 * then that only Alice is there,
	 * then that both are there.
	 */
	public static void main(String[] args) {
		
		coffeeBreak(false,false);
		coffeeBreak(false,true);
		coffeeBreak(true,false);
		coffeeBreak(true,true);
		

	}

}
