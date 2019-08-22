package at.bfi.coders.bay.exercises.unit2._02;

/**
 * <h1>Exercise: Declare and initialize variables</h1>
 * 
 * assignment:<br>
 * 1. Deklariere und Initialisiere Variablen mit den Datentypen<br>
 * -boolean<br>
 * -int<br>
 * -String<br>
 * -double<br>
 * 2. Gib sie mit einem System.out.println in der Konsole aus<br>
 * <br>
 * Aufgabe: verheiratet oder nicht<br>
 * Verwende die Aufgabe wo wir Datentypen initialisiert haben<br>
 * Lege eine Variable isMarried an<br>
 * Je nachdem ob jemand verheiratet ist oder nicht, sollen unterschiedliche
 * Systemausgaben in der Konsole erscheinen
 *
 * @author groiq
 * @version 1.0
 * @since 2019-08-06
 */
public class DeclareVariablesApp {

	private static DeclareVariables declareVariablesSample;

	private static void checkMarriage(DeclareVariables declareVariables) {
		System.out.println("The sample is " 
	+ declareVariables.getMarriageStatus() + ".");
	}

	private static void trySettingMarriageStatus(String newStatus) {
		System.out.println("Trying setting marriage status to: " + newStatus);
		try {
			declareVariablesSample.setMarriageStatus(newStatus);
		} catch (IllegalArgumentException exc) {
			System.out.println(
					"ERROR: Relationship status \"" + newStatus 
					+ "\" not implemented. Marriage status unchanged.");
		}
		checkMarriage(declareVariablesSample);
	}

	public static void main(String[] args) {

		declareVariablesSample 
			= new DeclareVariables(false, 5, "some String", 1.2);
		System.out.println(declareVariablesSample);

		System.out.println("initial state");
		checkMarriage(declareVariablesSample);

		System.out.println("setting true...");
		declareVariablesSample.setMarried(true);
		checkMarriage(declareVariablesSample);
		System.out.println("setting false...");
		declareVariablesSample.setMarried(false);
		checkMarriage(declareVariablesSample);

		trySettingMarriageStatus("unmarried");
		trySettingMarriageStatus("married");
		trySettingMarriageStatus("concubinage");

	}

}
