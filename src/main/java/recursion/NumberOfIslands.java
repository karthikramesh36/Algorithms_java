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

    public int numberOfIslands(int[][] array) {
        int rows = array.length-1;
        int columns = array[0].length-1;
        int numberOfIslands = 0;
        for(int i = 0; i< rows; i++){
            for( int j =0; j< columns; j++){
                if(array[i][j] == 1){
                    dfs(array, i, j);
                    numberOfIslands++;
                }
            }
        }

        return numberOfIslands;
    }

    public void dfs(int[][] array, int row, int col){
        if(row < 0 || col < 0 || row >= array.length-1 || col >= array[0].length-1){
            return;
        }
         if ( array[row][col] == 1 ){
            array[row][col] = 0;
            return;
        }

        dfs(array, row+1, col);
        dfs(array, row-1, col);
        dfs(array, row, col+1);
        dfs(array, row, col-1);

    }
}