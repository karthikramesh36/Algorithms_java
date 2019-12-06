package arrays;

/*
 * Today, the bookstore owner has a store open for customers.length minutes.  Every minute, some number of customers (customers[i]) enter the store, and all those customers leave after the end of that minute.

On some minutes, the bookstore owner is grumpy.  If the bookstore owner is grumpy on the i-th minute, grumpy[i] = 1, otherwise grumpy[i] = 0.  When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise they are satisfied.

The bookstore owner knows a secret technique to keep themselves not grumpy for X minutes straight, but can only use it once.

Return the maximum number of customers that can be satisfied throughout the day.

 

Example 1:

Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
Output: 16
Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
 

Note:

1 <= X <= customers.length == grumpy.length <= 20000
0 <= customers[i] <= 1000
0 <= grumpy[i] <= 1



APPROACH: for every minute i.e. every iteration in customer . keep track of satisfied and not satisfied 
				in variables depending on grumpy array.
				
				not satisfied variable consists of only not satisfied customers in a sliding window of size X
				once the not satisfied window is greater than X , keep deleting the not satisfied customer from the left of the window.
				note: when store owner not grumpy i.ie customer is satisfied we dont have to remove from the left of window this is why we use 
				grumpy[i - X] * customers[i-X]
				
				finally for every window keep track of the max sliding window  i.e. window with max not satisfied customers ;
			return satisfied + maxSliding window;

a
 */

public class GrumpyBookstoreOwner {
	
	 public int maxSatisfied(int[] customers, int[] grumpy, int X) {
		 int maxWindow =0, satisfied =0;
		 
		 for(int i=0, notSatisfiedWindow=0; i < customers.length; i++) {
			 
			 if(grumpy[i] ==0)
				 satisfied += customers[i];
			 else
				 notSatisfiedWindow += customers[i];
			 
			 if( i >= X) {
				 notSatisfiedWindow = notSatisfiedWindow - (grumpy[i - X] * customers[i-X]);
			 }
		 }
		 
		 return maxWindow + satisfied;
	 }
}
