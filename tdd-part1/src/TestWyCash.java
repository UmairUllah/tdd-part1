import org.junit.*;

import org.junit.Test;

import junit.framework.TestCase;


public class TestWyCash extends TestCase {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
		five.times(3);
		assertEquals(15, five.amount);
	}	
	
}
