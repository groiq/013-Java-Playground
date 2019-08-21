package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.time.LocalTime;

public class Activity {

	private static int duration;
	private static String description;
	
	/**
	 * @return the duration
	 */
	public static int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public static void setDuration(int duration) {
		Activity.duration = duration;
	}
	/**
	 * @return the description
	 */
	public static String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public static void setDescription(String description) {
		Activity.description = description;
	}
	
	public static LocalTime execute(LocalTime time) {
		System.out.println(description);
		time = time.plusMinutes(duration);
		furtherActions();
		return time;
	}
	
	private static void furtherActions() {}


}
