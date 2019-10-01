/**
 * 
 */
package other.exercises.e02.junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   01.10.2019

 */
public class JunitHelloWorldTest {
	
	@Test
	public void testHelloWorld() {
		assertEquals("Hello world!", JunitHelloWorld.helloWorld());
	}

}
