package dp.one;


/*Paint House II
There are a row of n houses, each house can be painted with one of the k colors. The cost of painting each house with a certain color is different.

You have to paint all the houses such that no two adjacent houses have the same color. The cost of painting each house with a certain color is represented by a n x k cost matrix.

For example, costs[0][0] is the cost of painting house 0 with color 0; costs[1][2] is the cost of painting house 1 with color 2, and so on… Find the minimum cost to paint all houses.

 
Note:
All costs are positive integers.
*/


public class PaintHouseII {
	
	public int minCost(int[][] costs) {
		
		if(costs.length == 0 || costs == null)
			return 0;
		
		int minCost = 0;
		int secMinCost =0;
		int lastColor = -1;
		for(int i =0; i< costs.length; i++) {
			int curMinCost = Integer.MAX_VALUE;
			int curSecMinCost = Integer.MAX_VALUE;
			int curColor = 0;
			for(int j =0; j < costs[0].length; j++) {
				if(j == lastColor)
					costs[i][j] += secMinCost;
				else
					costs[i][j] += minCost;
				
				if( costs[i][j] < curMinCost) {
					curSecMinCost = curMinCost;
					curMinCost = costs[i][j];
					curColor = j;
				}
				else if ( costs[i][j] < curSecMinCost)
					curSecMinCost = costs[i][j];
			}
			
			lastColor = curColor;
			minCost = curMinCost;
			secMinCost = curSecMinCost;
		}
		
		return minCost;
	}
}
