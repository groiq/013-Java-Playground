package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

/**
 * Simulates a cinema box office.<br>
 * Stores the film guide as an array of Showing objects. Provides a method for
 * purchasing a ticket.
 * 
 * @author Hannes Alkin
 * @version 1.0
 * @since 18.09.2019
 */
public class BoxOffice {

	private Showing[] filmGuide;

	/**
	 * Generate a film guide from a list of film titles and the start time of the
	 * first film.<br>
	 * For simplicity it's assumed that each film is shown once, in a new cinema
	 * hall, and 30 minutes after the last.<br>
	 * Tickets start at 6.00 and increase by .50 for each showing. 3d is randomly
	 * chosen.
	 * 
	 * @param films
	 * @param firstBegin
	 */
	public BoxOffice(String[] films, LocalTime firstBegin) {
		this.filmGuide = new Showing[films.length];
		LocalTime beginTime = firstBegin;
		Random ran = new Random();
		double price = 6.00;
		boolean in3d;
		for (int i = 0; i < filmGuide.length; i++) {
			in3d = ran.nextBoolean();
			filmGuide[i] = new Showing(films[i], beginTime, i, in3d, price);
			beginTime = beginTime.plusMinutes(30);
			price += 0.50;
		}
	}

	/**
	 * Get the film guide as an array of Showing objects.
	 * 
	 * @return the filmGuide
	 */
	public Showing[] getFilmGuide() {
		return filmGuide;
	}

	/**
	 * Overwrites the film guide.
	 * 
	 * @param filmGuide the filmGuide to set
	 */
	public void setFilmGuide(Showing[] filmGuide) {
		this.filmGuide = filmGuide;
	}

	/**
	 * get the list of film titles.
	 * 
	 * @return the list of film titles.
	 */
	public String[] getFilms() {
		String[] result = new String[filmGuide.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = filmGuide[i].getFilm();
		}
		return result;
	}

	/**
	 * Prints the film guide as a table.
	 */
	public void prettyPrintFilmGuide() {
		System.out.println("\n> examine film guide\n");
		System.out.println(String.format("%20s", "Film") + "\tTime\tCinema Hall");
		System.out.println("----------------------------------------------------");

		for (Showing showing : filmGuide) {
			System.out.println(showing.inTable());
		}
		System.out.println();
	}

	/**
	 * basic toString() method.
	 * 
	 * @return object info as a string
	 */
	@Override
	public String toString() {
		return "BoxOffice [filmGuide=" + Arrays.toString(filmGuide) + "]";
	}

	/**
	 * Purchase a ticket. Takes as parameters the index of the selected showing in
	 * the film guide and the amount of money spent. Checks wheter the index is
	 * valid, whether the showing is sold out and whether the money is enough.
	 * 
	 * @param showingNo the index of the selected showing in the list
	 * @param budget    the money spent
	 * @return a ticket for the selected film
	 */
	public Ticket purchase(int showingNo, double budget) {
		Ticket result = null;
		try {
			Showing theShowing = filmGuide[showingNo];
			String title = theShowing.getFilm();
			System.out.println("> Purchase ticket for " + title);
			if (theShowing.isSoldOut()) {
				System.out.println("Sorry, " + title + " is sold out...");
			} else if (theShowing.getPrice() > budget) {
				System.out.println("Sorry, not enough money.");
			} else {
				System.out.println("You've got a ticket for " + theShowing.getFilm() + "!");
				result = new Ticket(theShowing);
			}
			// if the showingNo doesn't refer to a valid showing
		} catch (IndexOutOfBoundsException e) {
			System.out.println("> Purchase ticket for <unknown film>");
			System.out.println("Sorry, that's not playing tonight.");
		}
		return result;
	}

}
