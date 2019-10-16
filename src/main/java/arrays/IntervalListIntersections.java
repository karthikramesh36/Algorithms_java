package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
	
	/*Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.

Return the intersection of these two interval lists.

(Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.  
The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.  
For example, the intersection of [1, 3] and [2, 4] is [2, 3].)

 

Example 1:



Input: A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
Reminder: The inputs and the desired output are lists of Interval objects, and not arrays or lists.
 
Simplified
Input: A = [1,3] , B= [2,4]
Output [[2,3]]
Note:

0 <= A.length < 1000
0 <= B.length < 1000
0 <= A[i].start, A[i].end, B[i].start, B[i].end < 10^9

*constraints and pointers - disjoint meaning , inside each array the elements do not intersect . 
*
*Approach - single loop through both arrays with two pointers
*check if two elements for each array intersect , if they do add the intersection interval to result 
* increment the array with lowest ending element . 
*/
	
public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        int i =0;
        int j =0;
        List<int[]> res = new ArrayList<>();
        
        while( i < A.length && j< B.length){
            
            int lo = Math.max(A[i][0],B[j][0]);
            int hi = Math.min(A[i][1],B[j][1]);

            if(lo <= hi){
                res.add(new int[]{lo,hi});
            }
            
            if(A[i][1] < B[j][1] ){
                i++;
            }
            else{
                j++;
            }
        }
        
        int[][] r = new int[res.size()][2];
        for(int k =0; k < res.size();k++){
            r[k] = res.get(k);
        }
        
        return r;
        
    }

}
