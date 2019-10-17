package dp.one;

/*
 * A man is wants to travel N countries using 3 mode of transport i.e Plane, Ship, Helicopter cost of each of them is different for each coutry.
You need to minimize the total cost for traveling.
Condition : Person can't travel with same transport for two cities continuously and traveling is done in input specified order.

input : N denotes the number of countries , a 2d array describing the cost associated with each mode of travel corresponding to a country.

rows - countries , columns - modes of transport

print the minimum cost of travel possible 

 */
public class MinimumCostOfTravel {
	
	public int minimumCost(int n, int[][] cost) {
		
		
		if( n == 0 || cost.length == 0)
			return 0;
		
		int lastTransportId = -1;
		int secMinCost = 0;
		int minCost = 0;		
		for(int i =0;i<n;i++) {
			int curMinCost = Integer.MAX_VALUE;
			int curSecMinCost = Integer.MAX_VALUE;
			int curTransportId = 0;

			for(int j=0;j<cost[0].length;j++) {
				
				if(lastTransportId == j)
					cost[i][j] += secMinCost;
				else
					cost[i][j] += minCost;
				
				if(cost[i][j] < curMinCost ) {
					curMinCost = cost[i][j];
					curSecMinCost = curMinCost;
					curTransportId = j;
				}
				else if(cost[i][j] < curSecMinCost) {
					curSecMinCost = cost[i][j];
				}
			}
			
			lastTransportId = curTransportId;
			secMinCost = curSecMinCost;
			minCost = curMinCost;
		}
		
		return minCost;
		
		
	}

}
