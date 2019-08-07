package at.bfi.coders.bay.exercises.unit2._2;

/**
 * @author groiq
 * 
 * assignment:
 * 1. Deklariere und Initialisiere Variablen mit den Datentypen 
 * -boolean
 * -int
 * -String
 * -double
 * 2. Gib sie mit einem System.out.println in der Konsole aus
 *
 */
public class DeclareVariablesApp {
	
	private static void checkMarriage(DeclareVariables declareVariables) {
		System.out.println("The sample is " + declareVariables.getMarriageStatus() + ".");
	}

	public static void main(String[] args) {
		
		DeclareVariables declareVariablesSample = new DeclareVariables(false, 5, "some String", 1.2);
		System.out.println(declareVariablesSample);
		
		System.out.println("initial state");
		checkMarriage(declareVariablesSample);
		System.out.println("setting true...");
		declareVariablesSample.setMarried(true);
		checkMarriage(declareVariablesSample);
		System.out.println("setting false...");
		declareVariablesSample.setMarried(false);
		checkMarriage(declareVariablesSample);
		System.out.println("setting married...");
		declareVariablesSample.setMarriageStatus("married");
		checkMarriage(declareVariablesSample);
		System.out.println("setting unmarried...");
		declareVariablesSample.setMarriageStatus("unmarried");
		checkMarriage(declareVariablesSample);
		System.out.println("setting invalid string...");
		declareVariablesSample.setMarriageStatus("in wilder Ehe");
		checkMarriage(declareVariablesSample);
		
	}

}
