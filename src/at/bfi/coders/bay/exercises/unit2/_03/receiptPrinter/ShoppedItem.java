package at.bfi.coders.bay.exercises.unit2._03.receiptPrinter;

/**
 * <h1>A shopped item</h1>
 * An item that can be shopped for the receipt printer.
 * 
 * @author  groiq
 * @version 1.0
 * @since   22.08.2019
 */
public class ShoppedItem {
	
	// Fields
	private String name;
	private int amount;
	private double piecePrice;
	
	// Getters + Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPiecePrice() {
		return piecePrice;
	}
	public void setPiecePrice(double piecePrice) {
		this.piecePrice = piecePrice;
	}
	
	// virtual getter for total piece price
	public double getPrice() {
		return piecePrice * amount;
	}
	
	// Constructor
	public ShoppedItem(String name, int amount, double piecePrice) {
		this.name = name;
		this.amount = amount;
		this.piecePrice = piecePrice;
	}
	
	// toString
	@Override
	public String toString() {
		return name + "\t" + amount + " x " + piecePrice 
				+ " EUR\t" + getPrice() + " EUR";
	}
	
	

}
