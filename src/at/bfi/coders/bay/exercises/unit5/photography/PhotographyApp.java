/**
 * 
 */
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
 * Lege f�r jedes einzelne Attribut deiner Klasse get und set Methoden an. Eine
 * Get Methode liefert immer den Wert des Attributes, und die setMethode setzt
 * den Wert<br>
 * F�r setfocalDistanceMin muss �berpr�ft werden, dass der Wert kleiner ist als
 * in Max, sowie in setFocalDistanceMax muss �berpr�ft werden ob er gr��er ist
 * als das Minimum<br>
 * F�r das setzen der Werte m�chte ich nur EINE Methode setBrennweite welche
 * beide Werte �bergeben bekommt<br>
 * Hauptprogramm: Erzeuge mindestens 3 verschiedene Fotoapparate<br>
 * Zusatz 1:<br>
 * <br>
 * W�hle je nach Wochentag eine andere Kamera aus<br>
 * Am Wochenende m�chtest du aufs Land fahren und zus�tzliche Materialien
 * mitnehmen. Baue dir eine Erinnerung falls es Sa oder Sonntag ist, deine
 * Materialien einzupacken (Verwendung von Date-Format)<br>
 * Passe deine Methode takePhoto so an, dass du jedesmal ein neues Foto
 * erstellst welches einen Namen hat (fortlaufende Nummer), die pixelCount, die
 * size und ob es schwarz-wei� oder farbe fotografiert wurde<br>
 * <br>
 * <br>
 * Zusatz 2:<br>
 * <br>
 * Erstelle eine neue Klasse Objective mit den Eigenschaften focalDistance
 * Maximum und Minimum<br>
 * Lege eine neue Objektvariable f�r Objective in der Klasse Kamera an<br>
 * Passe dein Programm so an dass es wieder funktioniert.<br>
 * 
 * 
 * @author Hannes Alkin
 * @version
 * @since 27.08.2019
 * 
 */
public class PhotographyApp {

	static final boolean debug = true;

	private static Camera[] weekPlan = new Camera[8];
	private static Camera todaysCamera;
//	private static String[] motifs;

	static void dbg(String message) {
		if (debug) {
			System.out.println("[" + message + "]");
		}
	}

//	private static void setWeekPlan(Camera[] newPlan) {
//		for (int i = 1; i < weekPlan.length; i++) {
//			try {
//				weekPlan[i] = newPlan[i-1];
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Week plan aborts at " + DayOfWeek.of(i));
//				System.out.println(Arrays.toString(weekPlan));
//				break;
//			}
//		}
//	}
//	
//	private static String getWeekPlan() {
//		String result = "|";
//		for (int i = 0; i < weekPlan.length; i++) {
//			if (weekPlan[i] != null) {
//				result += DayOfWeek.of(i) + ": " + weekPlan[i] + "|";
//			}
//		}
//		return result;
//	}

	private static int getWeekday() {
		Calendar calendar = Calendar.getInstance();
		Date today = new Date();
		calendar.setTime(today);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		dbg("calculated weekday is " + new SimpleDateFormat("EE").format(today) + " with number " + weekday);
		/*
		 * Since weekday numbering of the Calendar library is 1-based, starting with
		 * Sunday, and DayOfWeek is 1-based, starting with Monday, I have to recalculate
		 * a bit.
		 * 
		 * Note that DayOfWeek is 1-based, starting with Monday.
		 */
		weekday = (weekday + 6) % 7;
		return weekday;
	}

	private static void packForToday(int weekday) {
//		System.out.println("> pack for today");
		todaysCamera = weekPlan[weekday - 1];
		System.out.println("Today is " + DayOfWeek.of(weekday) + ", so I'll pack the " + todaysCamera + ".");

		if (weekday > 5) {
			System.out.println("REMINDER Going to the country today. Did you pack the sturdy shoes?");
		}
	}

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

	private static void setFocalDistance(int newMin, int newMax) {
		setFocalDistance(todaysCamera, newMin, newMax);
	}

	private static void photoTour(String[] motifs) {

		System.out.println("> take a photo tour");
		for (String motif : motifs) {
			todaysCamera.takePhoto(motif);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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

//		System.out.println("> Use first the ixus, then the fuji, then the eos.");
//		setWeekPlan(new Camera[] {ixus, fuji, eos});
		System.out.println("> Use the ixus for Mo-We-Fr, the fuji for Tu-Th and the eos for weekends.");
		weekPlan = new Camera[] { ixus, fuji, ixus, fuji, ixus, eos, eos };
		System.out.println("Your week plan: " + Arrays.toString(weekPlan));
		System.out.println();

		System.out.println("> Pack for today");

		int weekday = getWeekday();
		System.out.println(weekday + " " + DayOfWeek.of(weekday).toString());
		System.out.println(weekPlan[weekday]);

		if (debug) {
			dbg("for debugging, go through various weekdays");
			weekday = 1;
			dbg("weekday set to " + weekday + " -> " + DayOfWeek.of(weekday));
			packForToday(weekday);
			weekday = 2;
			dbg("weekday set to " + weekday + " -> " + DayOfWeek.of(weekday));
			packForToday(weekday);
			weekday = 6;
			dbg("weekday set to " + weekday + " -> " + DayOfWeek.of(weekday));

		}

		packForToday(weekday);
		System.out.println();

		setFocalDistance(1, 1);
		setFocalDistance(2, 1);
		setFocalDistance(1, 2);
		System.out.println();

		String[] motifs = { "a rolling landscape", "a towering mountain", "a close-up of a flower" };
		photoTour(motifs);
		System.out.println();

		todaysCamera.slideshow();
		todaysCamera.viewPhotoStats();

//		for (int sideLenMultiplier = 0; sideLenMultiplier < 12; sideLenMultiplier++) {
//			int baseSquare = (int) Math.pow(sideLenMultiplier, 2);
//			int mpx = baseSquare * 12;
//			
//			double calcBaseSquare = Math.sqrt(mpx / 12);
//			int wid = (int) (calcBaseSquare * 4);
//			int height = (int) (calcBaseSquare * 3);
//			System.out.println(sideLenMultiplier + " -> " + baseSquare + " -> " + mpx + " -> " + calcBaseSquare + " -> "
//					+ wid + " x " + height);
//
//		}

	}

}
