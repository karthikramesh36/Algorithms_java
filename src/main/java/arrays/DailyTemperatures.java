package arrays;

import java.util.Stack;

/*
 * Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].


approach - 

for each element in array push its index into a stack.

	if stack is empty then push directly the first index , 
	
	if stack not empty and if the current element is greater than the element at the index present in the top of the stack 
		then find the difference 
	 	which indicates the number of days that we have to wait for the index present in the top of stack 
	 	
	 	add the difference into result for the index we just compared to i,e on top of stack , also pop the element once we are done
	 	keep doing the same 
	 	
	 if current element is not greater than the element present at index at top of stack then push the index onto the stack
	 
 if all elements are done and the if stack is still not empty add zero into res for each index in stack
	
return result.
	
	TimeComplexity - O(n) - n is the number of elements in the input array 
 */
public class DailyTemperatures {
	
	public int[] NextGreaterTemperature(int[] T) {
		int[] res = new int[T.length];
		Stack<Integer> index = new Stack<>();
		for(int i =0; i < T.length ; i++) {
			
			while(!index.isEmpty() && T[i] > T[index.peek()]) {
				
					int prev = index.pop();
					res[prev] =  i- prev;
				
			}
			
			index.push(i);
		}
		
		for ( int i : index) {
			res[i] = 0;
		}
		
		return res;
		
	}

}
