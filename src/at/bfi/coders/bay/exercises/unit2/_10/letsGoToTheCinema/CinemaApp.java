package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;

/**
 Aufgabe: Gehen wir ins Kino
Im Kino seht ihr auf dem Monitor das Kinoprogramm. Dieses besteht aus verschiedensten Filmen, Uhrzeiten, einen Kinosaal, 
ausgebucht (j/n) und eine Info ob der Film in 3D ist oder nicht. 
Erstelle eine kleine Anzeigentafel in der Konsole in der du ein paar aktuelle Filme du du zb bei Cineplexx findest, anzeigst

Gehe zum Ticketschalter und hole dir dein Ticket. Das Ticket musst du abspeichern denn ansonsten darfst du nicht in den Kinosaal. 
Schaue auf die Uhr und finde heraus wie spät es ist.
Hast du noch mehr als 10 Minuten Zeit, dann kannst du noch aufs WC gehen UND dir etwas zu essen holen
Hast du weniger als 10 Minuten Zeit reicht es leider nur mehr für den Gang zur Toilette
Wenn du in Punkt 3 herausgefunden hast, 
dass du noch mehr als 10 Minuten Zeit hast, dann kannst du dir noch etwas zu essen holen. 
Du kannst dir alles kaufen was du gerne möchtest, allerdings musst du überprüfen ob du genug Geld mit hast. 
Der Preis der Produkte darf also nicht höher sein, als die Menge an Geld die du in der Geldtasche hast. 
ACHTUNG: Das Kino hat heute eine besondere Aktion, jeder Kunde darf eine Zahl ziehen. 
Wenn diese Zahl eine Primzahl (2,3,5,7...usw) ist ODER aber eine Runde Zahl (10,20,30...), 
dann brauchst du den Einkauf nicht bezahlen. Generiere mittels Random eine Zufallszahl und versuch dein Glück
 * @author groiq
 *
 */
public class CinemaApp {

	private static Showing[] tonight;
	private static Ticket ticket;

	public static void main(String[] args) {
		
		String[] titles = {"2001","Alien","Tron","War Games"};
//		boolean[] in3ds = {false,true,false,true};
//		boolean[] in3ds = new boolean[titles.length]
		
		tonight = new Showing[titles.length];
		
		LocalTime beginTime = LocalTime.of(19, 30);
//		int hrs = 19;
//		int mins = 0;
//		int totalMins = hrs * 60;
//		LocalTime time;
//		System.out.println(time);
		boolean in3d;
		int randomizer;
		
//		return String.format("%10s", film) + "\t" + time + "\t" + cinemaHall + "\t" + (in3d ? "3D" : " ")+ "\t"  + (soldOut ? "SOLD OUT" : "BUY TICKETS");
		
		for (int i = 0; i < tonight.length; i++) {
			
			randomizer =  (int) ((Math.random() * 10));
//			System.out.println(randomizer);
			in3d = (randomizer % 2 == 0);
			
			beginTime = beginTime.plusMinutes(30);
//			totalMins += 30;
//			hrs = (totalMins / 60);
//			mins = totalMins % 60;
//			time = LocalTime.of(hrs, (mins));
//			System.out.println(time);
			tonight[i] = new Showing(titles[i], beginTime, i+1, in3d);
//			System.out.println(tonight[i]);
//			System.out.println(tonight[i].inTable());
			
		}
		
		LocalTime time = LocalTime.of(19, 55);
		
		printTonight();
		System.out.println("now Alien is sold out...");
		System.out.println();
		tonight[1].setSoldOut(true);
		printTonight();

		BoxOffice boxOffice = new BoxOffice(tonight);
		
		ticket = boxOffice.purchase(1);
		ticket = boxOffice.purchase(2);

	}

	private static void printTonight() {
		
		System.out.println(String.format("%10s", "Film") + "\tTime\tCinema Hall");
		System.out.println("----------------------------------------------------");
		
		for (Showing showing : tonight) {
			System.out.println(showing.inTable());
		}
		System.out.println();

	}
	
	// check times for activities
	// execute activities accordingly
	
	// for later: generate a Cinema object that has, among others, a local time that can be influenced by the activities
	

}
