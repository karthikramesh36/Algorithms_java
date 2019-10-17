package math;


/*Given a positive integer N, how many ways can we write it as a sum of consecutive positive integers?

Example 1:

Input: 5
Output: 2
Explanation: 5 = 5 = 2 + 3
Example 2:

Input: 9
Output: 3
Explanation: 9 = 9 = 4 + 5 = 2 + 3 + 4
Example 3:

Input: 15
Output: 4
Explanation: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
Note: 1 <= N <= 10 ^ 9.



approach : arithmetic series formula . Sum of (a + kd) = n/2 ( 2a + (k-1) d) , where a is the first term of series , d is  the difference .

therefore to find N that is made of sum of consecutive numbers , we can represent N = (x+1) + (x+2)...(x+k). 

	2N = k(2x + k +1)
 	x = ((2N/k) -k -1 )/2 
 	
 	
 	purpose of k condition in for can reduce the run time by a lot .
 	
 	
 	Time Complexity O(sqrtN)
 	space Complexity O(1)
*/
public class ConsecutiveNumbersSum {

    public int consecutiveNumbersSum(int N) {
        
    	int res = 0;
    	for(int k =1; k <=(int) Math.sqrt(2 * N); k++ ) {
    		if(2*N % k != 0) continue;
    		int y = 2*N /k -k -1;
    		if(y % 2 ==0 && y >=0)
    			res++;
    		
    	}
    	return res;
    }
}