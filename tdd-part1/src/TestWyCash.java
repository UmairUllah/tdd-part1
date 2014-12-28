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
		int amount;
		
		public Dollar( int amount) {
			this.amount = amount;
		}
		
		public void times(int multiplier) {
			amount *= multiplier;
		}
		
	}

}
