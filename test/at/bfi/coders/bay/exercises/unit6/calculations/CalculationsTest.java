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
	
	/// handling basic calculations
	@Test
	public void TestChooseCalculation() {
		assertEquals(6+2, Calculations.chooseCalculation(6, 2, '+'));
		assertEquals(6-2, Calculations.chooseCalculation(6, 2, '-'));
		assertEquals(6*2, Calculations.chooseCalculation(6, 2, '*'));
		assertEquals(6/2, Calculations.chooseCalculation(6, 2, '/'));
	}
	
	// handling illegal arguments for operator
	@Test(expected = IllegalArgumentException.class)
	public void TestIllegalArgumentExceptionOnOperator() {
		Calculations.chooseCalculation(6, 2, '.');
	}
	
	// handle divide - by - zero cases
	@Test(expected = IllegalArgumentException.class)
	public void TestDivideByZero() {
		Calculations.chooseCalculation(6, 0, '/');
	}

}
