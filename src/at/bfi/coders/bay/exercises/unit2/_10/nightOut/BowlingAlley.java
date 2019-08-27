package at.bfi.coders.bay.exercises.unit2._10.nightOut;

/**
 * Simulates a bowling alley.
 * 
 * @author groiq
 * @version 1.1
 * @since 27.08.2019
 */
public class BowlingAlley {

	private Partygoer contestant;
	private int result;
	private String message = "no result";

	/**
	 * gets the contestant currently bowling.
	 * 
	 * @return a partygoer, the current contestant
	 */
	public Partygoer getContestant() {
		return contestant;
	}

	/**
	 * Enters a new contestant, if not too drunk.
	 * 
	 * @param contestant a partygoer
	 */
	public void setContestant(Partygoer contestant) {
		if (contestant.getGlassesDrunk() < 4) {
			this.contestant = contestant;
			System.out.println("New contestant at the bowling alley: " + contestant.getName() + "!");
		} else {
			System.out.println("Sorry, " + contestant.getName() + ", " + "you've had " + contestant.getGlassesDrunk()
					+ " glasses and are far too pissed for bowling.");
		}

	}

	/**
	 * Gets the latest achieved result.
	 * 
	 * @return an int, the last result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * Prevents contestants from messing with the result table.
	 * 
	 * @param result an int, the would-be result
	 */
	public void setResult(int result) {
		System.out.println("You cannot just write down any result. Result unchanged. Contestant " + contestant
				+ " reported for cheating.");
	}

	/**
	 * Executes a frame.<br>
	 * If the right contestant is rolling and the result is valid, updates the
	 * result and message.<br>
	 * Otherwise prints an error message.
	 * 
	 * @param contestant a partygoer, the contestant trying to roll
	 * @param newResult  an int between 0 and 10, the latest result
	 */
	public void bowl(Partygoer contestant, int newResult) {

		if (contestant == this.contestant) {
			if (newResult <= 10 && newResult >= 0) {
				this.result = newResult;

				switch (newResult) {
				case 0:
					message = "- Miss";
					break;
				case 1:
				case 2:
				case 3:
					message = "Weak hit";
					break;
				case 4:
				case 5:
				case 6:
					message = "ordinary hit";
					break;
				case 7:
				case 8:
				case 9:
					message = "Good hit";
					break;
				case 10:
					message = "X - Strike!!!";
				}

			} else if (newResult > 10) {
				result = 0;
				System.out.println("Yeah, I'm sure you've hit " + newResult + " pins. Counting zero. Contestant "
						+ contestant.getName() + " reported for cheating.");
			} else {
				System.out.println(
						"Thank you for putting up the pins, but right now you are supposed to knock them down. Not counting this turn.");
			}
		} else {
			System.out
					.println("Hey, it's not your turn! Contestant " + contestant.getName() + " reported for cheating.");
		}
	}

	/**
	 * The toString() method returns the latest result with message and contestant
	 * name.
	 */
	@Override
	public String toString() {
		return "Contestant " + contestant.getName() + " has hit " + result + " pins. " + message;
	}

}
