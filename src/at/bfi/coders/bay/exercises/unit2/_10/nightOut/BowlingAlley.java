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
	
	public void bowl(Celebrant contestant, int newResult) {
		
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
				System.out.println("Yeah, I'm sure you've hit " + newResult + " pins. Counting zero. Contestant " + contestant.getName() + " reported for cheating.");
			} else {
				System.out.println("Thank you for putting up the pins, but right now you are supposed to knock them down. Not counting this turn.");

			}
		} else {
			System.out.println("Hey, it's not your turn! Contestant " + contestant.getName() + " reported for cheating.");
		}

	}
//	@Override
//	public String toString() {
//		return "BowlingAlley [contestant=" + contestant + ", result=" + result + ", message=" + message + "]";
//	}
	
	@Override
	public String toString() {
		return "Contestant " + contestant.getName() + " has hit " + result + " pins. " + message;
	}

}
