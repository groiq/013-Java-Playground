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
		System.out.println(result);
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
	
	public int drawLotteryTicket() {
		return (int)  (Math.random()*100);
	}
	
	public void enterLotteryTicket(int lotteryTicket) {
		boolean won = false;
		if (lotteryTicket % 10 == 0) {
			won = true;
		} else {
			// check for prime
		}
		if (won) {
			System.out.println("You have won!");
			for (Map.Entry<String, Double> entry : products.entrySet()) {
				entry.setValue(0.0);
			}
		}
	}

}
