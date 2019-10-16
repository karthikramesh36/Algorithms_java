package math;

import org.junit.Test;

public class ConsecutiveNumbersSumTest {

	@Test
	public void test() {
		ConsecutiveNumbersSum c = new ConsecutiveNumbersSum();
		
		int res = c.consecutiveNumbersSum(15);
		res = c.consecutiveNumbersSum(5);
	}
}
