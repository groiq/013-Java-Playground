package at.bfi.coders.bay.exercises.unit2._10.nightOut;

import java.util.Random;

/**
 * A partygoer who can drink, do situps and go home.
 * 
 * @author groiq
 * @version 1.1
 * @since 27.08.2019
 */
public class Partygoer {

	private final String name;

	private int glassesDrunk;
	/*
	 * According to the assignment, the contents of the glass can be given in ml
	 * with or without decimal places, and the notion amused me that ml isn't
	 * fine-grained enough for a simulation of this level of intricacy.
	 */
	private double glassContents;

	private final int stepsAtHome = 15;
	private int cookiesAtHome = 5;

	/**
	 * Get the partygoer's name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the glasses the partygoer has already drunk.
	 * 
	 * @return the glassesDrunk
	 */
	public int getGlassesDrunk() {
		return glassesDrunk;
	}

	/**
	 * Manually set the number of glasses drunk by the partygoer.
	 * 
	 * @param glassesDrunk
	 */
	public void setGlassesDrunk(int glassesDrunk) {
		this.glassesDrunk = glassesDrunk;
	}

	/**
	 * Get the contents of the current glass.
	 * 
	 * @return the glassContents
	 */
	public double getGlassContents() {
		return glassContents;
	}

	/**
	 * Sets the contents of the glass. The only way to change the contents is to
	 * reduce them by taking a sip.
	 * 
	 * @param glassContents
	 */
	public void setGlassContents(double glassContents) {

		if (glassContents < this.glassContents) {
			System.out.println("taking a sip...");
			this.glassContents = glassContents;
		} else if (glassContents > this.glassContents) {
			System.out.println("Please don't refill the glass yourself. Drink up and order a new one.");
		}

	}

	/**
	 * Get the number of steps at the partygoer's home.
	 * 
	 * @return the stairsAtHome
	 */
	public int getStairsAtHome() {
		return stepsAtHome;
	}

	/**
	 * Get the number of cookies in the partygoer's home.
	 * 
	 * @return the cookiesAtHome
	 */
	public int getCookiesAtHome() {
		return cookiesAtHome;
	}

	/**
	 * Make a new partygoer and give them a name.
	 * 
	 * @param name
	 */
	public Partygoer(String name) {
		super();
		this.name = name;

	}

	/**
	 * Checks the contents of the glass and prints a message.<br>
	 * If the glass is empty, orders a new one.
	 */
	public void checkGlass() {
		if (glassContents < 250) {
			if (glassContents >= 20) {
				System.out.println("The glass is no longer full");
			} else {
				System.out.println("Go to the store and buy some more.");
				glassesDrunk += 1;
				orderGlass();
			}
		} else {
			System.out.println("The glass is full.");
		}
	}

	/**
	 * Orders a new glass.
	 */
	public void orderGlass() {
		this.glassContents = 250.0;
	}

	/**
	 * Does a number of situps, using a randomly selected kind of loop.<br>
	 * 
	 * @param count an int, the number of situps
	 */
	public void doSitups(int count) {
		Random ran = new Random();
		int loopSwitcher = ran.nextInt(4);
		doSitups(count, loopSwitcher);
	}

	/**
	 * Does a number of situps. The loop used depends on the value of
	 * loopSwitcher:<br>
	 * 0 - use a While loop<br>
	 * 1 - use a Do-While loop<br>
	 * 2 - use a For loop<br>
	 * 3 - use a Foreach loop<br>
	 * If the value is none of these, a loop is selected randomly.<br>
	 * The crowd counts each situp.<br>
	 * Some situps print an extra message.
	 * 
	 * @param count        an int, the number of situps
	 * @param loopSwitcher an int between 0 and 4, selects a loop
	 */
	public void doSitups(int count, int loopSwitcher) {
		System.out.println("doing " + count + " situps...");
		switch (loopSwitcher) {
		case 0:
			doSitupsWithWhile(count);
			break;
		case 1:
			doSitupsWithDoWhile(count);
			break;
		case 2:
			doSitupsWithFor(count);
			break;
		case 3:
			doSitupsWithForeach(count);
			break;
		default:
			doSitups(count);
		}
	}

	/**
	 * Does situps using a while loop.
	 * 
	 * @param count an int, the number of situps
	 */
	private void doSitupsWithWhile(int count) {
		System.out.println("<using while loop>");
		int counter = 0;
		while (counter < count) {
			counter++;
			situp(counter);
		}
	}

	/**
	 * Does situps using a do-while loop.
	 * 
	 * @param count an int, the number of situps
	 */
	private void doSitupsWithDoWhile(int count) {
		System.out.println("(using do-while loop)");
		int counter = 0;
		do {
			counter++;
			situp(counter);
		} while (counter < count);
	}

	/**
	 * Does situps using a for loop.
	 * 
	 * @param count an int, the number of situps
	 */
	private void doSitupsWithFor(int count) {
		System.out.println("(using for loop)");
		for (int i = 0; i < count; i++) {
			situp(i + 1);
		}
	}

	/**
	 * Does situps using a foreach loop.
	 * 
	 * @param count an int, the number of situps
	 */
	private void doSitupsWithForeach(int count) {
		System.out.println("(using foreach loop)");
		int[] counter = new int[count];
		for (int i = 0; i < counter.length; i++) {
			counter[i] = i;
		}
		for (int i : counter) {
			situp(i + 1);
		}
	}

	/**
	 * Executes a situp by printing an appropriat message
	 * 
	 * @param counter an int, the count of the situp
	 */
	private void situp(int counter) {
		System.out.println("Everybody shouts, \"" + counter + "\"!");
		switch (counter) {
		case 10:
			System.out.println("\"Phew, I hope this'll be over soon.\"");
			break;
		case 15:
			System.out.println("\"I don't think I'll make it\"");
			break;
		case 19:
			System.out.println("\"YES WE CAN!!!!\"");
			break;
		case 20:
			System.out.println("\"OLEOLEOLEEEEE\"");
			break;
		}
	}

	/**
	 * Simulates coming home.<br>
	 * If not too drunk, partygoer is going through their evening routine.<br>
	 * If slightly drunk, plunders the cookie jar. If really pissed, falls asleep on
	 * the stairs.
	 */
	public void goHome() {
		System.out.println(name + " is going home...");
		if (glassesDrunk < 4) {
			System.out.println("taking a shower...");
			System.out.println("brushing teeth...");
			System.out.println("putting on pajamas...");
			if (glassesDrunk > 1) {
				System.out.println("getting hungry...");
				int cookieCounter = 0;
				while (cookiesAtHome > 0) {
					cookiesAtHome--;
					cookieCounter++;
					System.out.println("eaten cookie number " + cookieCounter + ".");
				}
			}
		} else {
			int manageableSteps = stepsAtHome - glassesDrunk;
			for (int i = 0; i < manageableSteps; i++) {
				System.out.println("mounted step " + (i + 1));
			}
			System.out.println("Now I've got to sleep.");

		}
	}

}
