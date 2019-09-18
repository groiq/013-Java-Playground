package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;

public class Ticket {
	
	private final Showing showing;

	/**
	 * @return the showing
	 */
	public Showing getShowing() {
		return showing;
	}

	/**
	 * @param showing
	 */
	public Ticket(Showing showing) {
		this.showing = showing;
	}
	
	/**
	 * @return the film
	 */
	public String getFilm() {
		return this.getShowing().getFilm();
	}

	/**
	 * @return the time
	 */
	public LocalTime getTime() {
		return this.getShowing().getTime();
	}

	/**
	 * @return the cinemaHall
	 */
	public int getCinemaHall() {
		return this.getShowing().getCinemaHall();
	}

	/**
	 * @return the soldOut
	 */
	public boolean isSoldOut() {
		return this.getShowing().isSoldOut();
	}

	/**
	 * @return the in3d
	 */
	public boolean isIn3d() {
		return this.getShowing().isIn3d();
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return this.getShowing().getPrice();
	}

	
}
