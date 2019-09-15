package recursion;

/**
 * NumberOfIslands
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
 */
public class NumberOfIslands {

	/*
	 * pseudo
	 * for every element in matrix
	 * perform dfs as recursion if element 1 
	 * exit recursion is element out of bounds or 0
	 * during dfs , set current element as 0
	 * and explore only nodes above , below, left and right */
    public int numberOfIslands(char[][] array) {
    	int nr = array.length;
    	int nc = array[0].length;
    	int numberOfIslands = 0;
    	for (int i = 0; i < nr; i++) {
    		for (int j = 0; j < nc; j++) {
				if(array[i][j] == '1') {
					numberOfIslands++;
					dfs(array,i,j);
				}
			}
			
		}
    	
    	return numberOfIslands;
    }

	private void dfs(char[][] array, int row, int col) {
    	int nr = array.length;
    	int nc = array[0].length;
    	
    	if(row<0 || col<0 || row >= nr || col >= nc || array[row][col] == '0')
    		return;
    	
    	array[row][col] = '0';
    	dfs(array, row+1, col);
    	dfs(array, row, col+1);
    	dfs(array, row-1, col);
    	dfs(array, row, col-1);
    	
    	
		
	}
}