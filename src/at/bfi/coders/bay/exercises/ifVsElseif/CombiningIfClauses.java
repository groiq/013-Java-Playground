package at.bfi.coders.bay.exercises.ifVsElseif;


/**
 * Some demonstrations of combining if clauses. Explanations are in the source code.
 * @author groiq
 *
 */
public class CombiningIfClauses {

	public static void main(String[] args) {
		
		/*
		 * An example for various ways of combining two if clauses.
		 * Let Alice and Bob be two coworkers who often have coffee break together.
		 * Right now it's coffee break time, and what's happening in the break room depends on
		 * (a) whether Alice is having a break right now and 
		 * (b) whether Bob is having a break right now.
		 * 
		 * I am using two variables named aliceIsThere and bobIsThere.
		 * These two are boolean, meaning that the possible values are true and false.
		 * 
		 * I will then write a few code blocks, each of which checks for both variables in different combinations.
		 * 
		 * I will run the code four times.
		 * 
		 * First we assume that neither Alice nor Bob are there,
		 * then that only Bob is there,
		 * then that only Alice is there,
		 * then that both are there.
		 * 
		 * Of course I don't want to write the same code four times, so I'll throw it all into a method.
		 */
		coffeeBreak(false,false);
		coffeeBreak(false,true);
		coffeeBreak(true,false);
		coffeeBreak(true,true);
		

	}

	private static void coffeeBreak(boolean aliceIsThere, boolean bobIsThere) {

		/*
		 * let's start with a bit of debug output...
		 */
		
		System.out.println("<method called with these parameters:>");
		System.out.println("<aliceIsThere: " + aliceIsThere + ", bobIsThere: " + bobIsThere + ">");
		System.out.println();

		
		/* 
		 * First, I'll check who is actually having a coffee break.
		 * First I check the Alice variable, 
		 * and then I check the Bob variable *independent of* what the first check returned.
		 * 
		 */
		
		System.out.println("It's coffee break time!");

		if (aliceIsThere) {
			System.out.println("Alice is having a break.");
		}
		
		if (bobIsThere) {
			System.out.println("Bob is having a break.");
		}
		
		System.out.println();
		
		/* 
		 * Next, *if* Alice is there, she brought some cookies along.
		 * If Bob is there *too*, he'll have some.
		 * Bob's variable is checked *only* if Alice's check returned true.
		 */
		if (aliceIsThere) {
			System.out.println("Alice brought cookies.");
			if (bobIsThere) {
				System.out.println("Bob is having some cookies.");
			}
		}
		
		System.out.println();

		
		/*
		 * Now to decide who's making the coffee.
		 * If Alice is here, she volunteers to make coffee, so Bob doesn't have to.
		 * If Bob is here and Alice isn't, he'll make the coffee.
		 * So Bob's variable is checked only if Alice's returned false.
		 */
		
		if (aliceIsThere) {
			System.out.println("Alice is making coffee.");
		} else {
			if (bobIsThere) {
				System.out.println("Bob is making coffee.");
			} else {
				System.out.println("Nobody's here, so nobody's making any coffee.");
			}
		}
		System.out.println();
		
		
		/*
		 * After the break somebody needs to clean up and load the dishwasher.
		 * Alice insisted that this time we check for Bob first. If he isn't there, we'll check for Alice.
		 * So the code is equivalent to the previous one, but this time we'll use an if-else clause.
		 */
		
		if (bobIsThere) {
			System.out.println("Bob is loading the dishwasher.");
		} else if (aliceIsThere) {
			System.out.println("Alice is loading the dishwasher.");
		} else {
			System.out.println("Since there's nobody here, there's no dirty cups either.");
		}
		
		System.out.println();

		/*
		 * I'll wrap up the output with a delimiter...
		 */
		
		System.out.println("-----------------------------------");
		System.out.println();

	}
	

}
