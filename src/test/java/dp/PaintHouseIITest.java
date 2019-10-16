package dp;

import org.junit.Test;

import dp.one.PaintHouseII;

public class PaintHouseIITest {
	
	@Test
	public void test() {
		PaintHouseII p = new PaintHouseII();
		int[][] costs = new int [] [] {{14,15,16},{14,15,16},{14,15,16}};
		
		int res = p.minCost(costs);
	}
	
	
	@Test
	public void test1() {
		PaintHouseII p = new PaintHouseII();
		int[][] costs = new int [] [] {{1,5,16},{2,11,13}};
		
		int res = p.minCost(costs);
	}
}
