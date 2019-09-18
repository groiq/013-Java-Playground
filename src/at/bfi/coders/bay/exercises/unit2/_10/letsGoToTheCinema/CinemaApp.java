/**
 * 
 */
package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * <h1>Cinema simulator</h1>
 * 
 * Assignment:<br>
 * 
 * Aufgabe: Gehen wir ins Kino<br>
 * <br>
 * Im Kino seht ihr auf dem Monitor das Kinoprogramm. Dieses besteht aus
 * verschiedensten Filmen, Uhrzeiten, einen Kinosaal, ausgebucht (j/n) und eine
 * Info ob der Film in 3D ist oder nicht. Erstelle eine kleine Anzeigentafel in
 * der Konsole in der du ein paar aktuelle Filme du du zb bei Cineplexx findest,
 * anzeigst<br>
 * <br>
 * Gehe zum Ticketschalter und hole dir dein Ticket. Das Ticket musst du
 * abspeichern denn ansonsten darfst du nicht in den Kinosaal.<br>
 * <br>
 * Schaue auf die Uhr und finde heraus wie spät es ist.<br>
 * <br>
 * Hast du noch mehr als 10 Minuten Zeit, dann kannst du noch aufs WC gehen UND
 * dir etwas zu essen holen<br>
 * Hast du weniger als 10 Minuten Zeit reicht es leider nur mehr für den Gang
 * zur Toilette<br>
 * Wenn du in Punkt 3 herausgefunden hast, dass du noch mehr als 10 Minuten Zeit
 * hast, dann kannst du dir noch etwas zu essen holen. Du kannst dir alles
 * kaufen was du gerne möchtest, allerdings musst du überprüfen ob du genug Geld
 * mit hast. Der Preis der Produkte darf also nicht höher sein, als die Menge an
 * Geld die du in der Geldtasche hast. ACHTUNG: Das Kino hat heute eine
 * besondere Aktion, jeder Kunde darf eine Zahl ziehen. Wenn diese Zahl eine
 * Primzahl (2,3,5,7...usw) ist ODER aber eine Runde Zahl (10,20,30...), dann
 * brauchst du den Einkauf nicht bezahlen. Generiere mittels Random eine
 * Zufallszahl und versuch dein Glück<br>
 * 
 * 
 * @author Hannes Alkin
 * @version
 * @since 16.09.2019
 * 
 */
public class CinemaApp {

	private static BoxOffice boxOffice;
	private static LocalTime now;
	private static Ticket ticket;
	private static double budget;
//	private static long timeLeft;

//	private static boolean debug = true;

	private static void buyTicket(int showingNo) {
		now = now.plusMinutes(5);
		ticket = boxOffice.purchase(showingNo, budget);
		// next milestone: throw exceptions in purchase() and catch them here
		if (ticket != null) {
			budget -= ticket.getShowing().getPrice();
		}
		System.out.println("You have " + budget + " Euros left.");
	}

//	private static void checkTime() {
//		System.out.println("> Check time");
//		System.out.println("It is now " + now + ".");
//	}

//	private static long silentCheckTimeLeft() {
//		long mins = now.until(ticket.getShowing().getTime(), ChronoUnit.MINUTES);
////		timeLeft = mins;
//		return mins;
//	}

//	private static void checkTimeLeft() {
//		System.out.println("> Check time left");
//		long mins = silentCheckTimeLeft();
////		System.out.println(ticket.getShowing().getTime());
//		System.out.println("You have " + mins + " minutes left.");
////		timeLeft = mins;
//	}

	private static void goToToilet() {
		System.out.println("> Go to toilet");
		now = now.plusMinutes(4);
		System.out.println("I'll skip over the details.");
	}

	private static void buySnacks() {
		System.out.println("> buy snacks");
		now = now.plusMinutes(4);
	}

	private static void makeSchedule() {
		System.out.println("> check time left");
		long mins = now.until(ticket.getShowing().getTime(), ChronoUnit.MINUTES);
		System.out.println("It is " + now + " and the film starts at " + ticket.getShowing().getTime()
				+ ", so there are " + mins + " minutes left.");
		goToToilet();
		if (mins > 10) {
			buySnacks();
		}
		System.out.println();
	}

//	private static void 

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println();

		// sample data from mockaroo.com
		String[] films = { "Daddy and Them", "Gone Girl", "Otakus in Love", "Dark Angel, The", "Mon Oncle Antoine",
				"Human Scale, The", "Spring Forward", "Signs" };
		now = LocalTime.of(19, 30);
		LocalTime firstShowing = now.plusMinutes(30);
		boxOffice = new BoxOffice(films, firstShowing);
		budget = 7.00;

		boxOffice.prettyPrintFilmGuide();
		System.out.println("<setting one of the films to sold out>");
		boxOffice.getFilmGuide()[1].setSoldOut(true);
		boxOffice.prettyPrintFilmGuide();

		System.out.println("<try purchasing a sold out ticket>");
		buyTicket(1);
		System.out.println("<try purchasing a too expensive ticket>");
		buyTicket(7);
		System.out.println("<try purchasing a ticket not on the list>");
		buyTicket(10);
		System.out.println("<try purchasing a valid ticket>");
		buyTicket(2);
		System.out.println();

		System.out.println("<Case: less than 10 minutes left>");
		System.out.println("<simulating the passing of time...>");
		now = LocalTime.of(20, 55);
		makeSchedule();
		
		System.out.println("<Case: more than 10 minutes left>");
		System.out.println("<manipulating spacetime...>");
		now = LocalTime.of(20, 30);
		makeSchedule();

	}

}
