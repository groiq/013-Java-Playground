package at.bfi.coders.bay.exercises.unit2._10.nightOut;

public class Celebrant {
	
	/*
	 * Initialize each celebrant with a name.
	 */
	private final String name;
	
	public String getName() {
		return name;
	}
	
	
	
	public Celebrant(String name, int homeCookies) {
		super();
		this.name = name;
		this.home = new Home(homeCookies);
	}


	/*
	 * Task: monitor glasses drunk and contents of glass
	 */

	
	private int glassesDrunk;
	private double glassContents;
	
	public int getGlassesDrunk() {
		return glassesDrunk;
	}
	public void setGlassesDrunk(int glassesDrunk) {
		this.glassesDrunk = glassesDrunk;
	}
	public double getGlassContents() {
		return glassContents;
	}
	
	public void setGlassContents(double glassContents) {
		
		if (glassContents < this.glassContents) {
			System.out.println("taking a gulp...");
			this.glassContents = glassContents;
		} else if (glassContents > this.glassContents) {
			System.out.println("Please don't refill the glass yourself. Drink up and order a new one.");
		}

	}
	
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
	
	public void orderGlass() {
		this.glassContents = 250.0;
	}

	/*
	 * Task: do situps
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
		}
	}
	
	private void doSitupsWithWhile(int count) {
		System.out.println("(using while loop)");
		int counter = 0;
		while (counter < count) {
			counter++;
			situp(counter);
		}
	}
	
	private void doSitupsWithDoWhile(int count) {
		System.out.println("(using do-while loop)");
		int counter = 0;
		do {
			counter++;
			situp(counter);
		} while (counter < count);
	}
	
	private void doSitupsWithFor(int count) {
		System.out.println("(using for loop)");
		for (int i = 0; i < count; i++) {
			situp(i+1);
		}
	}
	
	private void doSitupsWithForeach(int count) {
		System.out.println("(using foreach loop)");
		int[] counter = new int[count];
		for (int i = 0; i < counter.length; i++) {
			counter[i] = i;
		}
		for (int i : counter) {
			situp(i+1);
		}
	}
	
	private void situp(int counter) {
		System.out.println("Everybody shouts, \'" + counter + "\'!");
		switch (counter) {
		case 10:
			System.out.println("Phew, I hope this'll be over soon.");
			break;
		case 15:
			System.out.println("I don't think I'll make it");
			break;
		case 19:
			System.out.println("YES WE CAN!!!!");
			break;
		case 20:
			System.out.println("OLEOLEOLEEEEE");
			break;
		}
	}
	
	/*
	 * task: coming home
	 */
	
	private Home home;

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}
	
	public void goHome() {
		System.out.println(name + " is going home...");
		if (glassesDrunk < 4) {
			System.out.println("taking a shower...");
			System.out.println("brushing teeth...");
			System.out.println("putting on pajamas...");
			if (glassesDrunk > 1) {
				System.out.println("getting hungry...");
				int cookieCounter = 0;
				while (home.getHomeCookies() > 0) {
					home.setHomeCookies(home.getHomeCookies() - 1);
					cookieCounter++;
					System.out.println("eaten cookie number " + cookieCounter + ".");
				}
			}
		} else {
			int manageableSteps = home.getHomeStairs() - glassesDrunk;
			for (int i = 0; i < manageableSteps; i++) {
				System.out.println("mounted step " + (i+1));
			}
			System.out.println("Now I've got to sleep.");

		}
	}
	
	
}
