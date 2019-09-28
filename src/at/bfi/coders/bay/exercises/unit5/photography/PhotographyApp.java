
package at.bfi.coders.bay.exercises.unit5.photography;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * <h1>Photograpy Simulator exercise</h1>
 * 
 * <h2>Assignment:</h2>
 * 
 * Erstelle eine Klasse Camera mit folgenden Attributen: megaPixel, displaySize
 * , isStable, brand, focalDistanceMin, focalDistanceMax<br>
 * Diese Klasse hat eine Methode "takePhoto" welche einfach "Klick" ausgiebt<br>
 * Lege für jedes einzelne Attribut deiner Klasse get und set Methoden an. Eine
 * Get Methode liefert immer den Wert des Attributes, und die setMethode setzt
 * den Wert<br>
 * Für setfocalDistanceMin muss überprüft werden, dass der Wert kleiner ist als
 * in Max, sowie in setFocalDistanceMax muss überprüft werden ob er größer ist
 * als das Minimum<br>
 * Für das setzen der Werte möchte ich nur EINE Methode setBrennweite welche
 * beide Werte übergeben bekommt<br>
 * Hauptprogramm: Erzeuge mindestens 3 verschiedene Fotoapparate<br>
 * Zusatz 1:<br>
 * <br>
 * Wähle je nach Wochentag eine andere Kamera aus<br>
 * Am Wochenende möchtest du aufs Land fahren und zusätzliche Materialien
 * mitnehmen. Baue dir eine Erinnerung falls es Sa oder Sonntag ist, deine
 * Materialien einzupacken (Verwendung von Date-Format)<br>
 * Passe deine Methode takePhoto so an, dass du jedesmal ein neues Foto
 * erstellst welches einen Namen hat (fortlaufende Nummer), die pixelCount, die
 * size und ob es schwarz-weiß oder farbe fotografiert wurde<br>
 * <br>
 * <br>
 * Zusatz 2:<br>
 * <br>
 * Erstelle eine neue Klasse Objective mit den Eigenschaften focalDistance
 * Maximum und Minimum<br>
 * Lege eine neue Objektvariable für Objective in der Klasse Kamera an<br>
 * Passe dein Programm so an dass es wieder funktioniert.<br>
 * 
 * 
 * @author Hannes Alkin
 * @version
 * @since 27.08.2019
 */
public class PhotographyApp {

	static final boolean debug = true;

	private static Camera[] weekPlan = new Camera[7];
	private static Camera todaysCamera;
	private static Calendar calendar = Calendar.getInstance();

	/*
	 * generate debug output
	 */
	static void dbg(String message) {
		if (debug) {
			System.out.println("[" + message + "]");
		}
	}

	/*
	 * look up weekday from a given date
	 */
	private static int getWeekday(Date date) {
		dbg("determining weekday from date " + date + "...");
		calendar.setTime(date);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		dbg("calculated weekday is " + new SimpleDateFormat("EE").format(date) + " with number " + weekday);
		/*
		 * Since weekday numbering of the Calendar library is 1-based, starting with
		 * Sunday, and my camera choice method uses zero-based weekday numberings,
		 * starting with Monday, I have to recalculate a bit.
		 */
		weekday = (weekday + 5) % 7;
		dbg("recalculated date is " + DayOfWeek.of(weekday + 1) + " with number " + weekday);
		return weekday;
	}

	/*
	 * pack gear for a specific weekday
	 */
	private static void packForToday(int weekday) {
		todaysCamera = weekPlan[weekday];
		System.out.println("Today is " + DayOfWeek.of(weekday + 1) + ", so I'll pack the " + todaysCamera + ".");
		if (weekday > 4) {
			System.out.println("REMINDER Going to the country today. Did you pack the sturdy shoes?");
		}
	}

	/*
	 * fetch current date and pack gear accordingly
	 */
	private static void packForToday() {
		System.out.println("> pack for today");
		Date today = new Date();
		dbg("date detected is " + today);
		int weekday = getWeekday(today);
		packForToday(weekday);
	}

	/*
	 * try weekday and packing mechanisms for all seven weekdays for debugging
	 */
	private static void debugWeekday() {
		dbg("cycle through weekdays for testing purposes...");
		calendar.set(2019, 8, 15);
		Date date;
		int weekday;
		for (int i = 0; i < 7; i++) {
			System.out.println("---");
			calendar.add(Calendar.DATE, 1);
			date = calendar.getTime();
			weekday = getWeekday(date);
			packForToday(weekday);
		}
	}

	/*
	 * ensure that a camera is set for today
	 */
	private static void checkCamera() {
		if (todaysCamera == null) {
			System.out.println("whoops, forgot to pack a camera...");
			packForToday();
		}
	}

	/*
	 * set focal distance on a camera with exception handling
	 */
	private static void setFocalDistance(Camera camera, int newMin, int newMax) {
		System.out.println("> set focal distance of " + camera + " to " + newMin + "-" + newMax);
		try {
			camera.getObjective().setFocalDistance(newMin, newMax);
			System.out.println("Focal distance set to " + newMin + "-" + newMax + ".");
		} catch (FocalDistanceMismatchException e) {
			if (newMin == newMax) {
				System.out.println(
						"Error: " + newMin + " should be smaller than " + newMax + ", but is equal. Aborting.");
			} else {
				System.out.println("Error: " + newMin + " should be smaller than " + newMax
						+ ", but is bigger. Assuming that you swapped the values.");
				setFocalDistance(camera, newMax, newMin);
			}
		}
	}

	/*
	 * set focal distance on the stored camera
	 */
	private static void setFocalDistance(int newMin, int newMax) {
		checkCamera();
		setFocalDistance(todaysCamera, newMin, newMax);
	}

	/*
	 * 
	 */
	private static void photoTour(String[] motifs) {
		checkCamera();
		System.out.println("> take a photo tour");
		for (String motif : motifs) {
			System.out.println(motif + " catches your eye.");
			todaysCamera.takePhoto(motif);
		}
	}

	public static void main(String[] args) {

		// set up objects
		System.out.println("> buy some cameras");
		Camera ixus = new Camera(5152, 2896, 2.7, true, "Canon Ixus");
		Camera eos = new Camera(6960, 4640, 3, false, "Canon EOS");
		Camera fuji = new Camera(1920, 1920, 3, false, "Fujifilm Instax");
		System.out.println("purchased:");
		System.out.println(ixus);
		System.out.println(eos);
		System.out.println(fuji);
		dbg("print full stats of one of the cameras");
		System.out.println(eos.getFullStats());
		System.out.println();

		// assign cameras to weekdays
		System.out.println("> Use the ixus for Mo-We-Fr, the fuji for Tu-Th and the eos for weekends.");
		weekPlan = new Camera[] { ixus, fuji, ixus, fuji, ixus, eos, eos };
		System.out.println("Your week plan: " + Arrays.toString(weekPlan));
		System.out.println();

		// test camera packing
		packForToday();
		if (debug) {
			System.out.println();
			debugWeekday();
		}

		// test focal distance methods
		System.out.println();
		setFocalDistance(1, 1);
		setFocalDistance(2, 1);
		setFocalDistance(1, 2);
		System.out.println();

		// test taking and viewing photos
		String[] motifs = { "a rolling landscape", "a towering mountain", "a close-up of a flower" };
		photoTour(motifs);
		System.out.println();
		todaysCamera.slideshow();
		todaysCamera.viewPhotoStats();

	}

}
