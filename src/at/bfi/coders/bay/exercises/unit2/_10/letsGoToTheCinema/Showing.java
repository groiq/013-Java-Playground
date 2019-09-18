package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;

public class Showing {

	private final String film;
	private final  LocalTime time;
	private final  int cinemaHall;
	private  boolean soldOut;
	private final  boolean in3d;
	private final  double price;

	/**
	 * @return the film
	 */
	public String getFilm() {
		return film;
	}

	/**
	 * @return the time
	 */
	public LocalTime getTime() {
		return time;
	}

	/**
	 * @return the cinemaHall
	 */
	public int getCinemaHall() {
		return cinemaHall;
	}

	/**
	 * @return the soldOut
	 */
	public boolean isSoldOut() {
		return soldOut;
	}

	/**
	 * @param soldOut the soldOut to set
	 */
	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	/**
	 * @return the in3d
	 */
	public boolean isIn3d() {
		return in3d;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
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



	@Override
	public String toString() {
		return "Showing [film=" + film + ", time=" + time + ", cinemaHall=" + cinemaHall + ", soldOut=" + soldOut
				+ ", in3d=" + in3d + ", price=" + price + "]";
	}

	public String inTable() {
		return String.format("%20s", film) + "\t" + time + "\t" + cinemaHall + "\t" + (in3d ? "3D" : " ") + "\t"
				+ (soldOut ? "SOLD OUT" : String.format("%2.2f", price));
	}

}
