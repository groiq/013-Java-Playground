package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;

public class Showing {

	String film;
	LocalTime time;
	int cinemaHall;
	boolean soldOut;
	boolean in3d;

	/**
	 * @return the film
	 */
	public String getFilm() {
		return film;
	}

	/**
	 * @param film the film to set
	 */
	public void setFilm(String film) {
		this.film = film;
	}

	/**
	 * @return the time
	 */
	public LocalTime getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(LocalTime time) {
		this.time = time;
	}

	/**
	 * @return the cinemaHall
	 */
	public int getCinemaHall() {
		return cinemaHall;
	}

	/**
	 * @param cinemaHall the cinemaHall to set
	 */
	public void setCinemaHall(int cinemaHall) {
		this.cinemaHall = cinemaHall;
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
	 * @param in3d the in3d to set
	 */
	public void setIn3d(boolean in3d) {
		this.in3d = in3d;
	}

	/**
	 * @param film
	 * @param time
	 * @param cinemaHall
	 * @param in3d
	 */
	public Showing(String film, LocalTime time, int cinemaHall, boolean in3d) {
		this.film = film;
		this.time = time;
		this.cinemaHall = cinemaHall;
		this.in3d = in3d;
		this.soldOut = false;
	}

	@Override
	public String toString() {
		return "Showing [film=" + film + ", time=" + time + ", cinemaHall=" + cinemaHall + ", soldOut=" + soldOut
				+ ", in3d=" + in3d + "]";
	}

	public String inTable() {
		return String.format("%10s", film) + "\t" + time + "\t" + cinemaHall + "\t" + (in3d ? "3D" : " ") + "\t"
				+ (soldOut ? "SOLD OUT" : "BUY TICKETS");
	}

}
