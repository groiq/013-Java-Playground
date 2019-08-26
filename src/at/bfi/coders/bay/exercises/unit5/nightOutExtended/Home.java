/**
 * 
 */
package at.bfi.coders.bay.exercises.unit5.nightOutExtended;

import java.util.Random;

/**
 * @author  groiq
 * @version 
 * @since   26.08.2019

 */
public class Home extends Location {
	

	private int numOfCookies;
	private final int numOfSteps;

	/**
	 * @param name
	 */
	public Home(String name) {
		super(name);
		Random ran = new Random();
		this.numOfCookies = ran.nextInt(6) + 5;
		this.numOfSteps = ran.nextInt(6) + 10;
	}

	@Override
	public void host(Celebrant celebrant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean orderDrink(Celebrant celebrant) {
		// TODO Auto-generated method stub
		return false;
	}

}
