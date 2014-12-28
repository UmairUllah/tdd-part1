import org.junit.*;

import org.junit.Test;

import junit.framework.TestCase;


public class TestWyCash extends TestCase {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
	
	class Dollar {
		int amount = 10;
		
		public Dollar( int amount) {
			
		}
		
		public void times(int multiplier) {
			
		}
		
	}

}
