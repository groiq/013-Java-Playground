package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.util.Arrays;

public class BoxOffice {
	
	private Showing[] tonight;

	/**
	 * @return the tonight
	 */
	public Showing[] getTonight() {
		return tonight;
	}

	/**
	 * @param tonight the tonight to set
	 */
	public void setTonight(Showing[] tonight) {
		this.tonight = tonight;
	}

	@Override
	public String toString() {
		return "BoxOffice [tonight=" + Arrays.toString(tonight) + "]";
	}

	/**
	 * @param tonight
	 */
	public BoxOffice(Showing[] tonight) {
		this.tonight = tonight;
	}
	
	// next milestone: catch outOfBounds exceptions
	public Ticket purchase(int showingNo) {
		Showing theShowing = tonight[showingNo];
		if (theShowing.isSoldOut()) {
			System.out.println("Sorry, " + theShowing.getFilm() + " is sold out...");
			return null;
		} else {
			System.out.println("You've got a ticket for " + theShowing.getFilm() + "!");
			return new Ticket(theShowing);
		}
	}

}
