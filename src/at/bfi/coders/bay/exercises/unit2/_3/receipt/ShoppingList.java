package at.bfi.coders.bay.exercises.unit2._3.receipt;

import java.util.Arrays;

public class ShoppingList {
	
	String[] goods;
	int[] amounts;
	
	public String[] getGoods() {
		return goods;
	}
	public void setGoods(String[] goods) {
		this.goods = goods;
	}
	public int[] getAmounts() {
		return amounts;
	}
	public void setAmounts(int[] amounts) {
		this.amounts = amounts;
	}
	
	public ShoppingList(Store theStore, int[] givenAmounts) {
		this.goods = theStore.getGoods();
		this.amounts = new int[goods.length];
		
		for (int i = 0; i < goods.length; i++) {
			if (i < givenAmounts.length) {
				this.amounts[i] = givenAmounts[i];
			} else {
				this.amounts[i] = 0;
			}
		}
		
	}
	@Override
	public String toString() {
		return "ShoppingList [goods=" + Arrays.toString(goods) + ", amounts=" + Arrays.toString(amounts) + "]";
	}
	
	

	
	
	

}
