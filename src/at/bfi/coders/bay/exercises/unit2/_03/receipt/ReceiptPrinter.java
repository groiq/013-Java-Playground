package at.bfi.coders.bay.exercises.unit2._03.receipt;

public class ReceiptPrinter {
	
	static String hr = "----------";
	
	public static void printReceipt(Store store, ShoppingList shoppingList, double wallet) {
		
		System.out.println("inside printReceipt");
		System.out.println(hr);
		
		String[] goods = store.getGoods();
		double[] piecePrices = store.getPrices();
		int[] amounts = shoppingList.getAmounts();
		
		// for later: check if the goods array in the shopping list matches the store.
		
		double total = 0.0;
		double curPrice;
		
		for (int i = 0; i < goods.length; i++) {
			
			if (amounts[i] == 0) continue;
			
			curPrice = amounts[i] * piecePrices[i];
			
			total += curPrice;
			
			System.out.println(goods[i] + "\t" + amounts[i] + " * " + piecePrices[i] + " EUR\t" + curPrice + " EUR");
			
		}
		
		System.out.println(hr);
		
		System.out.println("end of printReceipt");
		
	}

}
