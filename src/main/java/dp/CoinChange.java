package dp;

import java.util.Arrays;
/*You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3 
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Note:
You may assume that you have an infinite number of each kind of coin.

my approach: dynamic programming , solve the subsets of the given amount one by one 
For the iterative solution, we think in bottom-up manner. Before calculating F(i)F(i), we have to compute all minimum counts for amounts up to ii. On each iteration ii of the algorithm F(i)F(i) is computed as

F(i) =  min (coin_j=0...n-1 F(i -coin_j) + 1)


*/
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
    	int max = amount +1;
    	int[] dp = new int[max];
    	Arrays.fill(dp, max);
    	dp[0] = 0;
    	for(int i =0; i <= amount; i++) {
    		for(int j =0; j< coins.length; j++) {
    			if(coins[j] <= i) {
    				dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
    			}
    		}
    	}
    	
    	return dp[amount] > amount ? -1: dp[amount];
    }

}
