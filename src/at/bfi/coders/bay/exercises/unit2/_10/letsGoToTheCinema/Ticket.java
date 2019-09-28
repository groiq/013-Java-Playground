package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;

/**
 * Data object representing a movie ticket.
 * 
 * @author Hannes Alkin
 * @version 1.0
 * @since 18.09.2019
 */
public class Ticket {

	private final Showing showing;

	/**
	 * Generates a new ticket.
	 * 
	 * @param showing
	 */
	public Ticket(Showing showing) {
		this.showing = showing;
	}

	/**
	 * Returns the showing the ticket is for.
	 * 
	 * @return the showing
	 */
	public Showing getShowing() {
		return showing;
	}

	/**
	 * Returns the film title.
	 * 
	 * @return the film
	 */
	public String getFilm() {
		return this.getShowing().getFilm();
	}

	/**
	 * Returns the time of the showing.
	 * 
	 * @return the time
	 */
	public LocalTime getTime() {
		return this.getShowing().getTime();
	}

	/**
	 * Returns the cinema hall where the film is shown.
	 * 
	 * @return the cinemaHall
	 */
	public int getCinemaHall() {
		return this.getShowing().getCinemaHall();
	}

	/**
	 * Tells whether the showing is sold out.
	 * 
	 * @return the soldOut
	 */
	public boolean isSoldOut() {
		return this.getShowing().isSoldOut();
	}

	/**
	 * Tells whether the film is shown in 3d.
	 * 
	 * @return the in3d
	 */
	public boolean isIn3d() {
		return this.getShowing().isIn3d();
	}

	/**
	 * Returns the ticket price.s
	 * 
	 * @return the price
	 */
	public double getPrice() {
		return this.getShowing().getPrice();
	}

}
