package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;

/**
 * Data object representing a movie showing.
 * 
 * @author Hannes Alkin
 * @version 1.0
 * @since 18.09.2019
 */
public class Showing {

	private final String film;
	private final LocalTime time;
	private final int cinemaHall;
	private boolean soldOut;
	private final boolean in3d;
	private final double price;

	/**
	 * Returns the film shown as a String.
	 * 
	 * @return the film
	 */
	public String getFilm() {
		return film;
	}

	/**
	 * Returns the start time.
	 * 
	 * @return the time
	 */
	public LocalTime getTime() {
		return time;
	}

	/**
	 * Returns the cinema hall.
	 * 
	 * @return the cinemaHall
	 */
	public int getCinemaHall() {
		return cinemaHall;
	}

	/**
	 * Tells whether the showing is sold out.
	 * 
	 * @return the soldOut
	 */
	public boolean isSoldOut() {
		return soldOut;
	}

	/**
	 * Sets the sold out status.
	 * 
	 * @param soldOut the soldOut to set
	 */
	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	/**
	 * Tells whether the showing is in 3d.
	 * 
	 * @return the in3d
	 */
	public boolean isIn3d() {
		return in3d;
	}

	/**
	 * Returns the ticket price.
	 * 
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Create a new showing from film title, time, cinema hall and 3d status.
	 * Showings are always instantiated as not sold out.
	 * 
	 * @param film
	 * @param time
	 * @param cinemaHall
	 * @param in3d
	 */
	public Showing(String film, LocalTime time, int cinemaHall, boolean in3d, double price) {
		this.film = film;
		this.time = time;
		this.cinemaHall = cinemaHall;
		this.in3d = in3d;
		this.soldOut = false;
		this.price = price;
	}

	/**
	 * basic toString() method.
	 */
	@Override
	public String toString() {
		return "Showing [film=" + film + ", time=" + time + ", cinemaHall=" + cinemaHall + ", soldOut=" + soldOut
				+ ", in3d=" + in3d + ", price=" + price + "]";
	}

	/**
	 * Returns object information formatted for use in a table.
	 * 
	 * @return object information as a formatted string.
	 */
	public String inTable() {
		return String.format("%20s", film) + "\t" + time + "\t" + cinemaHall + "\t" + (in3d ? "3D" : " ") + "\t"
				+ (soldOut ? "SOLD OUT" : String.format("%2.2f", price));
	}

}
