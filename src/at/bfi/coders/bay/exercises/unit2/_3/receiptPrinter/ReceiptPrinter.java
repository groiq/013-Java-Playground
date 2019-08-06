package at.bfi.coders.bay.exercises.unit2._3.receiptPrinter;

/*
 * 
Erstellen eines Kassabons
Es soll ein Programm geschrieben werden, das einen Kassenbon auf der Konsole anzeigt (mit System.out.println). Am Anfang des Programmes werden in Form von Variablen folgende Werte festgelegt:

Anzahl von mindestens vier verschiedenen Waren, die gekauft werden sollen.
Einzelpreise der Waren. (Ja, jede Warensorte hat einen anderen Preis)
Inhalt der Brieftasche.
Das Programm soll den Gesamtpreis der eingangs festgelegten Waren ermitteln. Übersteigt der Gesamtpreis den Inhalt der Brieftasche, wird der Benutzer auf den fehlenden Betrag hingewiesen. Reicht der Inhalt der Brieftasche für den Einkauf aus, wird ein Kassenbon ausgegeben, der die gekauften Waren mit Anzahl und Preis sowie am Ende den Gesamtpreis auflistet.

Hinweis: Erstellt zuerst die Ausgabe des Kassenbons und füllt sie anschließend mit Berechnungen und der Fallunterscheidung.


Beispiel wie ein Kassenbon aussehen könnte:

Wurst      1 x  4.20 EUR
                          4.20 EUR
Käse       1 x  2.30 EUR
                          2.30 EUR
Brot       1 x  2.10 EUR
                          2.10 EUR
DVD        2 x 12.00 EUR
                         24.00 EUR
----------------------------------
Gesamt                   32.60 EUR
Gegeben                  50.00 EUR

Zurück                   17.40 EUR
 */
public class ReceiptPrinter {
	
	static ShoppedItem[] shoppingList;
	static String hr;

	public static void main(String[] args) {
		
		hr = "------------";
		
		String[] theGoods;
		double[] thePrices;
		int[] theAmounts;
		double wallet;

		theGoods = new String[] { "apples","onions","lemons","rice","vinegar","milk" };
		thePrices = new double[] {1.0,1.5,2.0,2.5,3.0,3.5};
		theAmounts = new int[] {0,1,2,3,4,5};

		wallet = 47.0;
		
		int size = Math.min(theGoods.length, thePrices.length);
		
		double total = 0.0;
		
		shoppingList = new ShoppedItem[size];
		
		for (int i = 0; i < shoppingList.length; i++) {
			int curAmount;
			if (i < theAmounts.length) {
				curAmount = theAmounts[i];
			} else {
				curAmount = 0;
			}
			shoppingList[i] = new ShoppedItem(theGoods[i], curAmount, thePrices[i]);
			total += shoppingList[i].getPrice();
		}
		
		if (total > wallet) {
			System.out.println("Total price exceeds budget. Please be more wealthy.");
		} else {
			
			System.out.println("printing recipe...");
			System.out.println(hr);
			for (ShoppedItem curItem : shoppingList) {
				if (curItem.getAmount() > 0) {
					System.out.println(curItem);
				}
			}
			System.out.println(hr);
			System.out.println("total:\t\t\t" + total + " EUR");
			System.out.println("given:\t\t\t" + wallet + " EUR");
			System.out.println("change:\t\t\t" + (wallet - total) + " EUR");

			
		}

	}

}
