/**
 * An attempt to demonstrate how a method can be called twice in different contexts.
 * Written in German.
 */
package at.bfi.examples.methods.percent;

public class ProzentDeutsch {
	
	private static int prozentAddieren(int basissumme, int prozentsatz) {
		int ergebnis;
		ergebnis = basissumme + (basissumme * prozentsatz / 100);
		return ergebnis;
	}

	public static void main(String[] args) {

		/*
		 * Wir haben eine Methode, die zu einer Basissumme einen bestimmten Prozentsatz dazuz�hlt.
		 * Diese Methode wenden wir auf zwei verschiedene Weisen an.
		 * In einem Fall habe ich eine gewisse Summe auf dem Konto, f�r die ich Zinsen bekomme.
		 * Ich m�chte jetzt ausrechnen, wieviel die Summe mit Zinsen ausmacht. 
		 */
		
		int einlage = 1000;
		int zinsen = 3;
		int kontostand = prozentAddieren(einlage,zinsen);
		System.out.println(einlage + " EUR Einlage zu " + zinsen + " % Zinsen ergibt " + kontostand + " EUR.");
		
		/*
		 * Im zweiten Fall habe ich den Nettopreis f�r ein Produkt und m�chte ausrechnen,
		 * wieviel das Produkt inklusive Mehrwertsteuer kosten soll.
		 */

		int nettopreis = 200;
		int mehrwertsteuer = 20;
		int bruttopreis = prozentAddieren(nettopreis, mehrwertsteuer);
		System.out.println(nettopreis + " EUR netto zu " + mehrwertsteuer + " % Mehrwertsteuer ergibt " + bruttopreis + " EUR.");
		
		/*
		 * Die Rechnung ist in beiden F�llen die gleiche, deshalb kann man dieselbe Methode verwenden.
		 * Aber die Zahlen bedeuten ein bi�chen etwas anderes.
		 * 
		 * Das soll zwei Dinge zeigen: 
		 * wie die Variablen in einer Methodendefinition verwendet werden und wie im Methodenaufruf
		 * 
		 * und dass das Wichtige an einer Methode die Wiederverwendbarkeit ist.
		 */

	}

}
