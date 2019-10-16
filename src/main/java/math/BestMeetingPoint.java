package math;

import java.util.ArrayList;
import java.util.List;

/*
 * A group of two or more people wants to meet and minimize the total travel distance. 
 * You are given a 2D grid of values 0 or 1, where each 1 marks the home of someone in the group. 
 * The distance is calculated using Manhattan Distance, where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.

Example:

Input: 

1 - 0 - 0 - 0 - 1
|   |   |   |   |
0 - 0 - 0 - 0 - 0
|   |   |   |   |
0 - 0 - 1 - 0 - 0

Output: 6 

Explanation: Given three people living at (0,0), (0,4), and (2,2):
             The point (0,2) is an ideal meeting point, as the total travel distance 
             of 2+2+2=6 is minimal. So return 6.
             

constraints to clarify : what the max size of 2d array 

brute force solution : for every point in the 2d array find the distance to buildings by performing a BFS
while using queue store node with x , y coordinate and its distance by using a point object
search the array by add neighbors to queue with distance plus 1 . also add to visited queue to keep track of 
visited so we don't visit the same node again. whenever we hit a 1 in grid add the current distance to the total distance 
repeat process and find total distance for all points and thus returning the coordinate with the lowest total distance. 


optimal solution : collect coordinates in sorted order to use median
explanation : manhattan distance can be split as sum of all x coordinate distances
and sum of all y coordinate distances

so trying to solve rows and columns separately as one dimension

formula to remember for future , the distance / operations taken to convert every element to the middle element
and to find minimum distance between points we need to find median of array
             */
public class BestMeetingPoint {
	
    public int minTotalDistance(int[][] grid) {
     List<Integer> rows = CollectRows(grid);
     List<Integer> cols = CollectCols(grid);
     int row = rows.get(rows.size()/2);
     int col = cols.get(cols.size()/2);
     
     int distance = minTotalDistance1D(rows,row) + minTotalDistance1D(cols,col);
     return distance;
    }

	private int minTotalDistance1D(List<Integer> points, int median) {
		int distance = 0;
		for (Integer point : points) {
			distance += Math.abs(point - median);
			
		}
		return distance;
	}

	private List<Integer> CollectRows(int[][] grid) {
		List<Integer> rows = new ArrayList<>();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if(grid[row][col] == 1) {
					rows.add(row);
				}
			}
			
		}
		return rows;
	}
	
	private List<Integer> CollectCols(int[][] grid) {
		List<Integer> cols = new ArrayList<>();
		for (int col = 0; col < grid[0].length; col++) {
			for (int row = 0; row < grid.length; row++) {
				if(grid[row][col] == 1) {
					cols.add(col);
				}
			}
			
		}
		return cols;
	}

}
