package at.bfi.coders.bay.exercises.unit2._03.receipt;

public class Store {
	
	String[] goods;
	double[] prices;
	
	public String[] getGoods() {
		return goods;
	}
	public void setGoods(String[] goods) {
		this.goods = goods;
	}
	public double[] getPrices() {
		return prices;
	}
	public void setPrices(double[] prices) {
		this.prices = prices;
	}
	public Store(String[] goods, double[] prices) {
		int size = Math.min(goods.length,prices.length);
		
		this.goods = new String[size];
		this.prices = new double[size];
		
		for (int i = 0; i < size; i++) {
			this.goods[i] = goods[i];
			this.prices[i] = prices[i];
		}
	}
	
	

}
