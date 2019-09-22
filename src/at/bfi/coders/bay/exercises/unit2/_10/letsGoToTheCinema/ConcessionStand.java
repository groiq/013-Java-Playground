/**
 * 
 */
package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Simulates a concession stand.</h1>
 * 
 * Provides a menu, a method to purchase a product and a raffle.<br>
 * Products are handled as a HashMap with name and price.
 * 
 * @author Hannes Alkin
 * @version
 * @since 18.09.2019
 * 
 */
/*
 * next milestone: purchase multiple products with a String[], implement a
 * Product object, do something with a return value for raffle
 */
public class ConcessionStand {

	private HashMap<String, Double> products;

	public ConcessionStand(String[] productNames) {
		products = new HashMap<String, Double>();
		double price = 2.0;
		for (String productName : productNames) {
			products.put(productName, price);
			price += 0.5;
		}
	}

	/**
	 * Returns the menus with product name and price as a HashMap.
	 * 
	 * @return the products
	 */
	public HashMap<String, Double> getProducts() {
		return products;
	}

	/**
	 * Sets a new menu.
	 * 
	 * @param products the products to set
	 */
	public void setProducts(HashMap<String, Double> products) {
		this.products = products;
	}

	/**
	 * Prints the menu as a table.
	 */
	public void printMenu() {
		System.out.println("\n> examine concession stand menu\n");
		System.out.println(String.format("%30s\tPrice", "Product"));
		System.out.println("----------------------------------------------------");
		for (Map.Entry<String, Double> entry : products.entrySet()) {
			System.out.println(String.format("%30s\t%2.2f", entry.getKey(), entry.getValue()));
		}
		System.out.println("Have you tried our new lottery? Free snacks for all primes and multiples of 10!*");
		System.out.println(
				"*Disclaimer: Only multiples of 10 in decimal. " + "Multiples of 10 in binary not applicable.\n");
	}

	/**
	 * Purchase a product. Takes product name and an amount of money as parameters.
	 * Checks whether product name is valid and whether the amount is enough.
	 * Returns the price of the product, or -1 if the purchase fails.
	 * 
	 * @param product the product name
	 * @param budget  the amount of money given
	 * @return the price of the product
	 */
	public double purchase(String product, double budget) {
		Double result = products.get(product);
		if (result == null) {
			System.out.println("This product wasn't found on the menu.");
			result = -1.0;
		} else if (result > budget) {
			System.out.println("you cannot afford this.");
			result = -1.0;
		} else {
			System.out.println("You purchased a " + product + "!");
		}
		return result;
	}

	/**
	 * Implements the concession stand's raffle.<br>
	 * Generates a random number. If the number is a multiple of 10 or a prime, all
	 * prices are set to zero.<br>
	 * In debug mode, the number is manually set to a prime.
	 */
	public void playRaffle() {
		int raffleTicket = (int) (Math.random() * 1024);
		System.out.println("Your number is " + raffleTicket);
		if (CinemaApp.debug) {
			System.out.println("...but in debug mode the raffle is rigged...");
			raffleTicket = 14;
			System.out.println("Your number is now 12. Is that a prime?");
			System.out.println(isPrime(raffleTicket));
			raffleTicket = 13;
			System.out.println("Apparently not. How about 13?");
			System.out.println(isPrime(raffleTicket));
			System.out.println("Okay, let's stick with " + raffleTicket + " as your lucky number.");
		}
		if (raffleTicket % 10 == 0 || isPrime(raffleTicket)) {
			System.out.println("Congrats, you have won! Everything is free for you today!");
			for (Map.Entry<String, Double> entry : products.entrySet()) {
				entry.setValue(0.0);
			}
		} else {
			System.out.println("Sorry, it's a blank.");
		}
	}

	private boolean isPrime(int number) {
		boolean[] isComposite = new boolean[number + 1];
		for (int pos = 2; pos < isComposite.length; pos++) {
			if (!(isComposite[pos])) {
				for (int result = pos * pos; result < isComposite.length; result += pos) {
					isComposite[result] = true;
				}
			}
		}
		return !(isComposite[number]);
	}

}
