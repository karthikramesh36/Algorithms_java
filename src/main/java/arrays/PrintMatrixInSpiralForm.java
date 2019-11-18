package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

 */
public class PrintMatrixInSpiralForm {
	
    public List<Integer> spiralOrder(int[][] matrix) {
     
    	int m = matrix.length , n = matrix[0].length;
    	int k = 0,l = 0;
    	List<Integer> result = new ArrayList<>();
    	while( k < m && l < n) {
    		
    		for(int i =0 ; i < n; i++) {
    			System.out.println(matrix[k][i] + " ");
    			result.add(matrix[k][i]);
    		}
    		k++;
    		
    		for(int i= n-1; i < m; i++) {
    			System.out.println(matrix[i][n-1] + " ");
    			result.add(matrix[i][n-1]);
    		}
    		n--;
    		if(k < m) {
        		for(int i = n-1; i>= l; i--) {
        			System.out.println(matrix[m-1][i] + " ");
        			result.add(matrix[m-1][i]);
        		}
        		m--;
    		}
    		if( l < n ) {
        		for(int i = m-1; i >= k ; i--) {
        			System.out.println(matrix[i][l] + " ");
        			result.add(matrix[i][l]);
        		}
        		l++;
    		}

    	}
    	
    	return result;
    	
    }

}
