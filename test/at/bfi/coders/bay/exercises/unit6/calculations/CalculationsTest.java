/**
 * 
 */
package at.bfi.coders.bay.exercises.unit6.calculations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   02.10.2019

 */
public class CalculationsTest {
	
	@Test
	public void TestChooseCalculation() {
		assertEquals(6+2, Calculations.chooseCalculation(6, 2, "+"));
		assertEquals(6-2, Calculations.chooseCalculation(6, 2, "-"));
		assertEquals(6*2, Calculations.chooseCalculation(6, 2, "*"));
		assertEquals(6/2, Calculations.chooseCalculation(6, 2, "/"));
	}

}
