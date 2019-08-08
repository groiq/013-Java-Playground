package at.bfi.coders.bay.exercises.unit2._10.nightOut;

public class Celebrant {
	
	/*
	 * Initialize each celebrant with a name.
	 */
	private final String name;
	
	public String getName() {
		return name;
	}
	
	
	
	public Celebrant(String name) {
		super();
		this.name = name;
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
		if (glassContents > 250) {
			System.out.println("You've poured in too much. The glass is overflowing.");
			this.glassContents = 250;
		} else {
			this.glassContents = glassContents;
		}
		
	}
	
	public void checkGlass() {
		if (glassContents < 250) {
			if (glassContents >= 20) {
				System.out.println("The glass is no longer full");
			} else {
				System.out.println("Go to the store and buy some more.");
				glassesDrunk += 1;
			} 
		} else {
			System.out.println("The glass is full.");
		}
	}

	

}
