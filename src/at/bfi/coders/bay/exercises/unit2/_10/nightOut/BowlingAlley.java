package at.bfi.coders.bay.exercises.unit2._10.nightOut;

public class BowlingAlley {

	private Celebrant contestant;
	private int result;
	private String message = "no result";
	
	public Celebrant getContestant() {
		return contestant;
	}
	public void setContestant(Celebrant contestant) {
		if (contestant.getGlassesDrunk() < 4) {
			System.out.println("New contestant at the bowling alley: " + contestant.getName() + "!");
		} else {
			System.out.println("Sorry, " + contestant.getName() + ", "
					+ "you've had " + contestant.getGlassesDrunk() + " glasses and are far too pissed for bowling.");
		}
		this.contestant = contestant;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		System.out.println("You cannot just write down any result. Result unchanged. Contestant " + contestant + " reported for cheating.");
	}
	
	public void bowl(int result) {
		if (result <= 10 && result >= 0) {
			this.result = result;
			
		} else {

		}
	}

}
