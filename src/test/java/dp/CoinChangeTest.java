package dp;

import org.junit.Test;


public class CoinChangeTest {
	@Test
	public void test() {
		CoinChange c = new CoinChange();
		int res = c.coinChange(new int[] {1, 2, 5}, 11);
	}
}
