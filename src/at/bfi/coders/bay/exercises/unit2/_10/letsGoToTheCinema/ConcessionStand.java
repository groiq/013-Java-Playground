/**
 * 
 */
package at.bfi.coders.bay.exercises.unit2._10.letsGoToTheCinema;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   18.09.2019

 */
/*
 * next milestone:
 * purchase multiple products with a String[]
 * implement a Product object
 * do something with a return value for raffle
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
	 * @return the products
	 */
	public HashMap<String, Double> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(HashMap<String, Double> products) {
		this.products = products;
	}

	public void printMenu() {
		System.out.println("\n> examine concession stand menu\n");
		System.out.println(String.format("%30s\tPrice", "Product"));
		System.out.println("----------------------------------------------------");
		for (Map.Entry<String, Double> entry : products.entrySet()) {
			System.out.println(String.format("%30s\t%2.2f", entry.getKey(),entry.getValue()));
		}
		System.out.println("Have you tried our new lottery? Free snacks for all primes and multiples of 10!*");
		System.out.println("*Disclaimer: Only multiples of 10 in decimal. "
				+ "Multiples of 10 in binary not applicable.\n");
	}
	

	
	public double purchase(String product, double budget) {
		Double result = products.get(product);
//		result = products.get(product);
//		System.out.println(result);
		if (result == null) {
			System.out.println("This product wasn't found on the menu.");
			result = -1.0;
		} else if (result > budget) {
			System.out.println("you cannot afford this.");
			result = -1.0;
		} else {
			System.out.println("You purchased a " + product + "!");
		} 
//			result = -1.0;
//		return result;
		return result;
	}

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
//		for (int i = 0; i < isComposite.length; i++) {
//			System.out.println(i + " -> " + isComposite[i]);
//		}
		for (int pos = 2; pos < isComposite.length; pos++) {
			if (!(isComposite[pos])) {
				for (int result = pos * pos; result < isComposite.length; result+= pos) {
					isComposite[result] = true;
				}
			}
		}
		return !(isComposite[number]);
	}
	
//	public int drawLotteryTicket() {
//		return (int)  (Math.random()*100);
//	}
//	
//	public void enterLotteryTicket(int lotteryTicket) {
//		boolean won = false;
//		if (lotteryTicket % 10 == 0) {
//			won = true;
//		} else {
//			// check for prime
//		}
//		if (won) {
//			System.out.println("You have won!");
//			for (Map.Entry<String, Double> entry : products.entrySet()) {
//				entry.setValue(0.0);
//			}
//		}
//	}

}
