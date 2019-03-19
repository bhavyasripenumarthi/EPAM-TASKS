import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterest {

	@Test
	/*
	 * Test Cases for Simple Interest
	 */
	public void testSimpleInterest() {
		Calculate c = new Calculate();
		assertEquals(c,c.simpleInterest(10000, 3, 2));
		assertEquals(c,c.simpleInterest(15000, 1.5, 2.5));
		assertEquals(c,c.simpleInterest(100000, 1.5, 1.25));
	}
	
	@Test
	/*
	 * Test Cases for Compound Interest
	 */
	public void testCompoundInterest() {
		Calculate c = new Calculate();
		assertEquals(c,c.compoundInterest(10090, 3, 2));
		assertEquals(c,c.compoundInterest(55000, 1.25, 1.5));
		assertEquals(c,c.compoundInterest(100000, 1.5, 1.25));
	}
}
