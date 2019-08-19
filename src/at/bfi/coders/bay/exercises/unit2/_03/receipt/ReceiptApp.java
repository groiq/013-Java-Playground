package at.bfi.coders.bay.exercises.unit2._03.receipt;

/*
 * Es soll ein Programm geschrieben werden, das einen Kassenbon auf der Konsole anzeigt (mit System.out.println). Am Anfang des Programmes werden in Form von Variablen folgende Werte festgelegt:

Anzahl von mindestens vier verschiedenen Waren, die gekauft werden sollen.
Einzelpreise der Waren. (Ja, jede Warensorte hat einen anderen Preis)
Inhalt der Brieftasche.
Das Programm soll den Gesamtpreis der eingangs festgelegten Waren ermitteln. �bersteigt der Gesamtpreis den Inhalt der Brieftasche, wird der Benutzer auf den fehlenden Betrag hingewiesen. Reicht der Inhalt der Brieftasche f�r den Einkauf aus, wird ein Kassenbon ausgegeben, der die gekauften Waren mit Anzahl und Preis sowie am Ende den Gesamtpreis auflistet.

Hinweis: Erstellt zuerst die Ausgabe des Kassenbons und f�llt sie anschlie�end mit Berechnungen und der Fallunterscheidung.


Beispiel wie ein Kassenbon aussehen k�nnte:

Wurst      1 x  4.20 EUR
                          4.20 EUR
K�se       1 x  2.30 EUR
                          2.30 EUR
Brot       1 x  2.10 EUR
                          2.10 EUR
DVD        2 x 12.00 EUR
                         24.00 EUR
----------------------------------
Gesamt                   32.60 EUR
Gegeben                  50.00 EUR

Zur�ck                   17.40 EUR

 */
public class ReceiptApp {

	public static void main(String[] args) {
		
		String[] theGoods;
		double[] thePrices;
		int[] theAmounts;
		double wallet;
		
		Store groceryStore;
		ShoppingList groceryList;
		
		theGoods = new String[] { "apples","onions","potatoes","rice","vinegar","milk" };
		thePrices = new double[] {1.0,1.5,2.0,2.5,3.0,3.5};
		
		groceryStore = new Store(theGoods, thePrices);
		
		theAmounts = new int[] {0,1,2,3};
//		theAmounts = new int[] {0,1,2,3,4,5,6,7};
		theAmounts = new int[] {0,1,2,3,4,5};
		
		groceryList = new ShoppingList(groceryStore,theAmounts);
//		System.out.println(groceryList);
		
		wallet = 47.0;
		
		ReceiptPrinter.printReceipt(groceryStore, groceryList, wallet);
		


	}

}
