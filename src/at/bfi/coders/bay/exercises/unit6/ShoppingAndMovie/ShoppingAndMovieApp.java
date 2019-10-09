package at.bfi.coders.bay.exercises.unit6.ShoppingAndMovie;

/**
 * <h1>Shopping and Movie simulator</h1>
 * 
 * Assignment: Jeder von euch muss von Zeit zu Zeit in einen Supermarkt oder
 * auch in ein Kleidungsgeschäft um etwas zu kaufen.<br>
 * <br>
 * 1) Ich möchte daher eine Klasse Product. Dieses Produkt soll einige Attribute
 * besitzen die ihr selbst wählen könnt. Einen Preis und Namen muss jedes
 * Produkt besitzen<br>
 * 2) Es gibt eine Klasse ShoppingCart die ähnlich aussieht wie die Datei im
 * Anhang. Diese Datei kann nach nach belieben erweitert werden.<br>
 * 3) Beide Klassen (Product und ShoppingCart) sollen mit Getter und Setter
 * Methoden ausgestattet werden<br>
 * 4) In eurem Hauptprogramm sollt du deinen Warenkorb mit einer Liste an
 * Produkten füllen (Array). Verwendet für das Erzeugen der Produkte eine
 * passende Schleife. In dieser Schleife soll eine Liste an Strings für die
 * Bezeichnung und den Preis verwendet werden um die Attribute des Produktes zu
 * befüllen.<br>
 * Also: String[] products="Shirt", "Hose",....<br>
 * double[] price=33.40, 24.30<br>
 * Produkt[] allProducts=...<br>
 * for (Länge der Liste "allProducts")<br>
 * allProducts[i]=new Product......<br>
 * <br>
 * Nachdem anstrengenden Einkauf wollt ihr noch ins Kino gehen<br>
 * <br>
 * Im Kino seht ihr auf dem Monitor das Kinoprogramm. Dieses besteht aus
 * verschiedensten Filmen, Uhrzeiten, einen Kinosaal und einem boolean ob das
 * der Film ausgebucht ist.<br>
 * Erstelle eine Klasse CinemaPlan und eine Klasse Film und erzeuge mindestens 4
 * Filme aus dem aktuellen Kinoprogramm welche du abbilden möchtest<br>
 * 
 * 
 * @author Hannes Alkin
 * @version
 * @since 09.10.2019
 * 
 */
public class ShoppingAndMovieApp {

	public static void main(String[] args) {

		// sample data from mockaroo.com
		String[] products = { "Beef Striploin Aaa", "Flour - Rye", "Cheese Cheddar Processed", "Rambutan",
				"Sauce - White, Mix", "Ketchup - Tomato", "Beef - Tenderloin Tails", "Sugar - Palm", "Quail - Jumbo",
				"Muffin Hinge Container 6", "Peppercorns - Green", "Wine - Sauvignon Blanc Oyster", "Jello - Assorted",
				"Cheese - Bakers Cream Cheese", "Shiratamako - Rice Flour", "Pastry - Trippleberry Muffin - Mini",
				"Wine - Semi Dry Riesling Vineland", "Ranchero - Primerba, Paste", "Lamb - Leg, Diced",
				"Island Oasis - Raspberry" };
		double[] prices = { 2.79, 8.6, 2.95, 1.56, 8.51, 5.08, 9.17, 7.47, 2.14, 3.69, 3.66, 4.42, 0.04, 8.42, 7.29,
				5.83, 9.11, 8.99, 4.73, 7.18 };
		String[] departments = { "Outdoors", "Music", "Books", "Tools", "Games", "Garden", "Home", "Kids",
				"Electronics", "Clothing", "Grocery", "Kids", "Electronics", "Sports", "Electronics", "Movies",
				"Jewelery", "Garden", "Jewelery", "Jewelery" };
		String[] manufacturers = { "Stanton Inc", "Osinski, Kulas and Stoltenberg", "Hauck-Wilkinson", "Fritsch-Brakus",
				"Little, Kozey and Kautzer", "Franecki LLC", "Carroll-Ondricka", "Green-Sporer",
				"Corwin, O'Conner and Gerhold", "Marks Group", "McGlynn Group", "Runolfsson Group", "Rogahn-Friesen",
				"Little and Sons", "Lind-Lowe", "Daniel-Mayert", "Wilkinson-Abernathy", "Russel-Daniel", "Hills Group",
				"Weimann, Volkman and Lebsack" };

	}

}
