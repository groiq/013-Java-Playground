/**
 * 
 */
package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

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
 * @version 1.0
 * @since 16.09.2019
 * 
 */
public class CinemaApp {
	
	static boolean debug = true;

	private static double budget;

	private static LocalTime now;
	private static BoxOffice boxOffice;
	private static Ticket ticket;
	private static ConcessionStand concessionStand;
	private static final List<String> snacks = new ArrayList<String>();
	
	static void dbg(String debugInfo) {
		System.out.println("[" + debugInfo + "]");
	}

	private static void printBudget() {
		System.out.println(String.format("You have %2.2f Euros left.", budget));
	}
	
	private static void buyTicket(int showingNo) {
		now = now.plusMinutes(5);
		ticket = boxOffice.purchase(showingNo, budget);
		// next milestone: throw exceptions in purchase() and catch them here
		if (ticket != null) {
			budget -= ticket.getPrice();
		}
		printBudget();
	}

	private static void goToToilet() {
		System.out.println("> Go to toilet");
		now = now.plusMinutes(4);
		System.out.println("I'll skip over the details.");
	}
	
	private static void tryToBuy(String product) {
		System.out.println("> buy " + product);
		double purchased = concessionStand.purchase(product, budget);
		if (purchased >= 0) {
			budget -= purchased;
			snacks.add(product);
			System.out.println(product + " is now in your inventory.");
		}
		printBudget();
	}

	private static void buySnacks() {
		System.out.println("> buy snacks");
		System.out.println("going over to the concession stand...");
		now = now.plusMinutes(4);
		concessionStand.printMenu();
		dbg("trying to buy something not on the menu");
		tryToBuy("ordinary popcorn");
		dbg("trying to buy something too expensive");
		dbg("setting budget to 2.50");
		budget = 2.50;
		tryToBuy("Calaloo");
		dbg("successful purchase");
		dbg("setting budget to 10.00");
		budget = 10.0;
		tryToBuy("Calaloo");
		concessionStand.playRaffle();
		concessionStand.printMenu();
		dbg("trying to buy something that would be too expensive without the raffle...");
		tryToBuy("Tamarind Paste");
	}

	private static void makeSchedule() {
		System.out.println("> check time left");
		long mins = now.until(ticket.getTime(), ChronoUnit.MINUTES);
		System.out.println("It is " + now + " and the film starts at " + ticket.getTime() + ", so there are " + mins
				+ " minutes left.");
		goToToilet();
		if (mins > 6) {
			buySnacks();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println();

		budget = 7.00;
		now = LocalTime.of(19, 30);
		LocalTime firstShowing = now.plusMinutes(30);
		// sample data from mockaroo.com
		String[] films = { "Daddy and Them", "Gone Girl", "Otakus in Love", "Dark Angel, The", "Mon Oncle Antoine",
				"Human Scale, The", "Spring Forward", "Signs" };
		boxOffice = new BoxOffice(films, firstShowing);
		String[] products = { "Oneshot Automatic Soap System", "Coffee Cup 12oz 5342cd", "Yogurt - Raspberry, 175 Gr",
				"Rum - White, Gg White", "Fireball Whisky", "Calaloo", "Pineapple - Regular", "Yogurt - Peach, 175 Gr",
				"Mushroom - Porcini, Dry", "Tamarind Paste" };
		concessionStand = new ConcessionStand(products);

		boxOffice.prettyPrintFilmGuide();
		dbg("setting one of the films to sold out");
		boxOffice.getFilmGuide()[1].setSoldOut(true);
		boxOffice.prettyPrintFilmGuide();

		dbg("try purchasing a sold out ticket");
		buyTicket(1);
		dbg("try purchasing a too expensive ticket");
		buyTicket(7);
		dbg("try purchasing a ticket not on the list");
		buyTicket(10);
		dbg("try purchasing a valid ticket");
		buyTicket(2);
		System.out.println();

		dbg("Case: less than 10 minutes left");
		dbg("simulating the passing of time...");
		now = LocalTime.of(20, 55);
		makeSchedule();

		dbg("Case: more than 10 minutes left");
		dbg("manipulating spacetime...");
		now = LocalTime.of(20, 30);
		makeSchedule();
		
		System.out.println(" --- You're ready to watch \'" + ticket.getFilm() + "\'... --- ");

	}

}
