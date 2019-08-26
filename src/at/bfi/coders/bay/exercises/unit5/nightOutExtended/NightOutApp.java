/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.nightOutExtended;

/**
 * Assignment:
 * 
 * Aufgabe: Night Out<br>
 * Definiere eine Variable in der du ml abspeichern kannst (egal ob mit oder
 * ohne Nachkommazahlen). Lege einen Wert fest und �berpr�fe mit einer geigneten
 * Verzweigung, folgende Situation:<br>
 * Das Glas hat genau 250ml Inhalt --> Ausgabe "Das Glas ist voll"<br>
 * Das Glas hat weniger als 250ml Inhalt --> Ausgabe "Das Glas ist nicht mehr
 * voll"<br>
 * Das Glas hat weniger als 20ml oder ist ganz leer --> Ausgabe "Kellner neues
 * Bier*"<br>
 * Statt Bier kann gerne auch Spritzer bestellt werden<br>
 * <br>
 * Optional: Du verbringst den ganzen Abend in einem Lokal und wirst eine
 * bestimmte Anzahl an Gl�sern trinken. Speichere dir deine Anzahl an
 * getrunkenen Gl�sern in eine Variable die wir sp�ter brauchen werden.<br>
 * <br>
 * 2. Als n�chsten Stop in eurer Abendgestaltung gehst du in eine Spielbar in
 * der ihr bowlen geht. F�r die Punktevergabe gibt es folgende Regeln.<br>
 * Wenn alle 10 Pins getroffen werden dann ist das ein Strike. Ausgabe auf der
 * Punktetafel soll daher "X - Strike!!!" sein.<br>
 * Wenn 7-9 Pins getroffen werden dann soll "Guter Treffer" ausgegeben
 * werden<br>
 * Wenn 4-6 Pins getroffen werden dann soll "Normaler Treffer" ausgegeben
 * werden<br>
 * Wenn 1-3 Pins getroffen werden dann soll "Schwacher Treffer" ausgegeben
 * werden<br>
 * Wenn kein Pin getroffen wird dann "- Miss" ausgegeben<br>
 * <br>
 * Optional: Du darfst nur Spielen wenn du im vorherigen Lokal weniger als 4
 * Getr�nke hattest<br>
 * <br>
 * 3. Nach eurem erfolgreichen Spiel wollt ihr eine Gruppe von M�dels (Jungs)
 * beeindrucken und noch Klimmz�ge am T�rrahmen (Alternativ Sit-ups) machen.<br>
 * Um den Gruppeneffekt zu st�rken z�hlen alle laut mit.<br>
 * Programmiere mit allen Schleifenvarianten die du kennst, die Ausgabe der
 * Z�hlung "1", "2",...<br>
 * Anmerkung: F�r die Anzahl soll eine Variable verwendet werden die in der
 * Schleife hochgez�hlt wird.<br>
 * <br>
 * Optional: Bei 10 Liegest�tz (Sit-Ups) f�ngst du zum schnaufen an und sagst
 * laut "Phu ich hoffe das ist bald vorbei"<br>
 * Bei 15 sagst du "Ich glaub ich schaff das nicht"<br>
 * Bei 19 sagst du "JA ICH SCHAFFE ES!!!!!"<br>
 * Bei 20 jubeln alle und singen "OLEOLEOLEEEEE"<br>
 * <br>
 * 4. Am Abend liegst du im Bett und es gibt nun folgende F�lle abzudecken:<br>
 * Fall 1: Du hast nur ein Getr�nk getrunken und gehst dich daher noch Duschen,
 * Z�hne putzen und ziehst dir deine Schlafkleidung an. Aufgabe, du sollst deine
 * T�tigkeiten mit einer println Funktion ausgeben.<br>
 * Fall 2: Du hast weniger als 3 Gl�ser getrunken und machst das selbe wie in
 * Fall 1. Zus�tzlich bemerkst du, dass du Hunger hast. Du gehst zum K�hlschrank
 * und isst alle Kekse die du findest. Aufgabe: Du gibst deine T�tigkeiten aus.
 * F�r die Anzahl der Kekse soll immer ausgegeben werden "Keks "+Nr.1
 * +"gegessen", "Keks "+Nr.2 +"gegessen", .......<br>
 * Fall 3: Du hast mehr als 3 Gl�ser getrunken und willst direkt ins Bett gehen.
 * Du versuchst �ber die Stufen zu gehen, schaffst aber die Anzahl der Stufen
 * NICHT die du Getr�nke getrunken hast. Die Stiege hat 15 Stufen. Hast du also
 * 4 Getr�nke getrunken, schaffst du es nur bis zur 11 Stufe. Aufgabe: Gib jede
 * einzelne Stufe die du erklommen hast aus. Bei der letzten Stufe die du
 * schaffst gibst du aus "Jetzt muss ich schlafen"<br>
 * <br>
 * 5. �ndere dein Programm so, dass du f�r die erste Aufgabenstellung eine Liste
 * an ml hast (mindestens 3) die du in einer Schleife auf die bestehenden
 * Abfragen �berpr�fst.<br>
 * <br>
 * 6. �ndere dein Programm so, dass du mindestens 10 mal bowlst und immer
 * unterschiedliche Ergebnisse erzielst (Verwendung einer Liste)<br>
 * <br>
 * Erweiterung "Night out"<br>
 * Unser Programm "Night out" soll nun folgende Erweiterungen bekommen:<br>
 * <br>
 * 1) Wir bauen eine Methode drink(), die EINE Ausgansvariable hat, n�mlich die
 * Anzahl an getrunkenen Gl�sern<br>
 * <br>
 * 2) Unseren Bowlingabend verpacken wir ebenfalls in eine eigene Methode die
 * EINE Eingangsvariable hat, die Anzahl der getrunkenen Gl�ser aus unserer
 * ersten Methode<br>
 * <br>
 * 3) Die Liegest�tze/Klimmz�ge/Situps sollen in EINE Methode gepackt werden,
 * welche unterschiedliche Schleifen durchgehen. Die Entscheidung, welche
 * Schleife gew�hlt wird soll aufgrund einer Zufallszahl von 1 bis 3 gew�hlt
 * werden. Ich �bergebe der Methode also einen Eingangsparamenter int, welche
 * eine Zahl von 1 bis 3 ist. Je nach Auspr�gung wird eine andere Schleife
 * verwendet<br>
 * <br>
 * 4) Unser Nach Hause kommen wird in eine neue Methode verpackt die eine
 * Eingangs und eine Ausgangsvariable hat. Eingangsvariable ist die Anzahl der
 * getrunkenen Gl�ser und Ausgangsvariable sind die Stufen die du geschafft
 * hast<br>
 * 
 * 
 * Erweiterung "Night out"<br>
 * Unser Programm "Night out" soll nun folgende Erweiterungen bekommen:<br>
 * <br>
 * 1) Wir bauen eine Methode drink(), die EINE Ausgansvariable hat, n�mlich die
 * Anzahl an getrunkenen Gl�sern<br>
 * <br>
 * 2) Unseren Bowlingabend verpacken wir ebenfalls in eine eigene Methode die
 * EINE Eingangsvariable hat, die Anzahl der getrunkenen Gl�ser aus unserer
 * ersten Methode<br>
 * <br>
 * 3) Die Liegest�tze/Klimmz�ge/Situps sollen in EINE Methode gepackt werden,
 * welche unterschiedliche Schleifen durchgehen. Die Entscheidung, welche
 * Schleife gew�hlt wird soll aufgrund einer Zufallszahl von 1 bis 3 gew�hlt
 * werden. Ich �bergebe der Methode also einen Eingangsparamenter int, welche
 * eine Zahl von 1 bis 3 ist. Je nach Auspr�gung wird eine andere Schleife
 * verwendet<br>
 * <br>
 * 4) Unser Nach Hause kommen wird in eine neue Methode verpackt die eine
 * Eingangs und eine Ausgangsvariable hat. Eingangsvariable ist die Anzahl der
 * getrunkenen Gl�ser und Ausgangsvariable sind die Stufen die du geschafft
 * hast<br>
 * 
 * 
 * @author groiq
 * @version
 * @since 26.08.2019
 * 
 */
public class NightOutApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
