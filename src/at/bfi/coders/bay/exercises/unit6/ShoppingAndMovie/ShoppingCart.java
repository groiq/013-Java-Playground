package at.bfi.coders.bay.exercises.unit6.ShoppingAndMovie;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   09.10.2019
 */
public class ShoppingCart {
	
	private double invoiceTotal;
	private int articleCount;
	private final int maxArticleCount;
	private double containedVAT;
	
	private Product[] productList;

	/**
	 * @param maxArticleCount
	 */
	public ShoppingCart(int maxArticleCount) {
		
		this.maxArticleCount = maxArticleCount;
		this.productList = new Product[articleCount];
		
		this.invoiceTotal = 0;
		this.containedVAT = 0;
		this.articleCount = 0;
		
	}

	public void add(Product product) {
		// check for full
		// add product to list
		// increase invoice
		// increase vat
		// increase article count
	}
	
	public void remove(int positionInProductList) {
		// catch null errors
		// decrease vat
		// decrease invoice
		// decrease article count
	}
	
	private void calculateVAT() {
		this.containedVAT = 20 * this.invoiceTotal / 120;
	}

	
	public void printInvoiceData() {
		
	}
	
	// go through getters and setters

}
