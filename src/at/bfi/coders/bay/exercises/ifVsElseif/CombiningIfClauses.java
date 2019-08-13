package at.bfi.coders.bay.exercises.ifVsElseif;


/**
 * Some demonstrations of combining if clauses. Explanations are in the source code.
 * @author groiq
 *
 */
public class CombiningIfClauses {

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
		 * who's having coffee - independent if-clauses
		 * 
		 */
		
		/* 
		 * who's having cookies - second if clause is only checked if first one is true
		 */
		
		/*
		 * who's making coffee - second if clause is only checked if first one is false
		 */
		
		/*
		 * who's loading the dishwasher - same with if-else
		 */


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
		/* 
		 * who's having coffee - independent if-clauses
		 * 
		 */
		
		/* 
		 * who's having cookies - second if clause is only checked if first one is true
		 */
		
		/*
		 * who's making coffee - second if clause is only checked if first one is false
		 */
		
		/*
		 * who's loading the dishwasher - same with if-else
		 */

	}

}
