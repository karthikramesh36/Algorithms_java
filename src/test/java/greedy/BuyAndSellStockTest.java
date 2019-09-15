package greedy;

import org.junit.Test;

import greedy.one.BuyAndSellStock;

/**
 * BuyAndSellStockTest
 */
public class BuyAndSellStockTest {

    @Test
    public void maxProfitTest() {
        BuyAndSellStock bs =  new BuyAndSellStock();
        bs.maxProfit(new int[] {6,3,2,8,1,11});
    }
}