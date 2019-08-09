package at.bfi.coders.bay.exercises.unit2._10.nightOut;

public class Home {
	
	private final int homeStairs;
	private int homeCookies;
	
	public int getHomeCookies() {
		return homeCookies;
	}
	public void setHomeCookies(int homeCookies) {
		this.homeCookies = homeCookies;
	}
	public int getHomeStairs() {
		return homeStairs;
	}
	
	public Home(int homeCookies) {
		this.homeStairs = 15;
		this.homeCookies = homeCookies;
	}
	
	@Override
	public String toString() {
		return "Home [homeStairs=" + homeStairs + ", homeCookies=" + homeCookies + "]";
	}
	
	

}
