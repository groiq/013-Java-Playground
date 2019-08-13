package at.bfi.coders.bay.exercises.ifVsElseif;


/**
 * Some demonstrations of combining if clauses. Explanations are in the source code.
 * @author groiq
 *
 */
public class CombiningIfClausesNoMethods {

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
		 * You might want to try out the code with various values for aliceIsThere and bobIsThere.
		 */
		boolean aliceIsThere = true;
		boolean bobIsThere = true;
		
		/*
		 * let's start with a bit of debug output...
		 */
		
		System.out.println("<using these parameters:>");
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
		
		/*
		 * Else-if clauses are practical when checking multiple mutually exclusive conditions, for example number ranges.
		 * 
		 * In case I forgot to mention, Alice and Bob are temporal field agents.
		 * In order to blend in when on a mission, they need a little program that takes the target year as an argument
		 * and returns the current trends in music for the decade in question.
		 * 
		 * I'm working with these music trends:
		 * 40s: Swing, Jazz, Blues and Big Band
		 * 50s: Rock ’N Roll, B-bop, Big Band, Country
		 * 60s: Motown, Rock ‘N Roll, and The British Invasion
		 * 70s: Disco, Motown, and R&B
		 * 80s: Glam rock, Pop, Hip-Hop, Country
		 * 90s: Grunge, Alternative, Rap, and Country
		 * 00s: Adult Contemporary and R&B
		 * 10s: EDM and Hip-Hop
		 * 
		 * source: https://medium.com/@Rifftime_Music/music-trends-through-the-decades-b8c5cbbae08b
		 */
		
		int targetYear = 1955;
		String curMusic = "";
		
		/*
		 * With simple if-else clauses, this will be needlessly convoluted:
		 */
		System.out.println("using if-else nesting...");
		if (targetYear < 1940) {
			curMusic = "<no data>";
		} else {
			if (targetYear < 1950) {
				curMusic = "Swing, Jazz, Blues and Big Band";
			} else {
				if (targetYear < 1960) {
					curMusic = "Rock ’N Roll, B-bop, Big Band, Country";
				} else {
					if (targetYear < 1970) {
						curMusic = "Motown, Rock ‘N Roll, and The British Invasion";
					} else {
						if (targetYear < 1980) {
							curMusic = "Disco, Motown, and R&B";
						} else {
							if (targetYear < 1990) {
								curMusic = "Glam rock, Pop, Hip-Hop, Country";
							} else {
								if (targetYear < 2000) {
									curMusic = "Grunge, Alternative, Rap, and Country";
								} else {
									if (targetYear < 2010) {
										curMusic = "Adult Contemporary and R&B";
									} else {
										if (targetYear < 2020) {
											curMusic = "EDM and Hip-Hop";
										} else {
											curMusic = "<no data>";
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("The cool kids are listening to " + curMusic + ".");
		System.out.println();
		
		/*
		 * else-if makes the code cleaner:
		 */
		System.out.println("using else-if...");
		if (targetYear < 1940) {
			curMusic = "<no data>";
		} else if (targetYear < 1950) {
			curMusic = "Swing, Jazz, Blues and Big Band";
		} else if (targetYear < 1960) {
			curMusic = "Rock ’N Roll, B-bop, Big Band, Country";
		} else if (targetYear < 1970) {
			curMusic = "Motown, Rock ‘N Roll, and The British Invasion";
		} else if (targetYear < 1980) {
			curMusic = "Disco, Motown, and R&B";
		} else if (targetYear < 1990) {
			curMusic = "Glam rock, Pop, Hip-Hop, Country";
		} else if (targetYear < 2000) {
			curMusic = "Grunge, Alternative, Rap, and Country";
		} else if (targetYear < 2010) {
			curMusic = "Adult Contemporary and R&B";
		} else if (targetYear < 2020) {
			curMusic = "EDM and Hip-Hop";
		} else {
			curMusic = "<no data>";
		}
		System.out.println("The cool kids are listening to " + curMusic + ".");
		System.out.println();
		
		System.out.println("-----------------------------------");
		System.out.println();
		
		
		/*
		 * Note that when conditions are mutually exclusive, else-if is equivalent to independent if checks.
		 * In this case, else-if is more efficient because it doesn't waste time on checks that don't change the result anyway.
		 * Let's say Alice and Bob have a new assignment and need to check whether to go forward or back in time...
		 */
		
		targetYear = 1965;
		int currentYear = 1941;
		
		System.out.println("using else-if...");
		if (currentYear < targetYear) {
			System.out.println("We need to go forward in time!");
		} else if (currentYear > targetYear) {
			System.out.println("We need to go backward in time!");
		} else {
			System.out.println("Looks like we're already there!");
		}
		System.out.println();
		
		System.out.println("using independent if clauses...");
		System.out.println("testing whether we need to go forward...");
		if (currentYear < targetYear) {
			System.out.println("We need to go forward in time!");
		}
		System.out.println("Testing whether we need to go back...");
		if (currentYear > targetYear) {
			System.out.println("We need to go back in time!");
		}
		System.out.println("Testing whether we're already there...");
		if (currentYear == targetYear) {
			System.out.println("Looks like we're already there!");
		}

	}
	

}
