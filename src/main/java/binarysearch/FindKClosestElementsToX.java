package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKClosestElementsToX {
	
	/* Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order.
	 If there is a tie, the smaller elements are always preferred.

	Example 1:

	Input: [1,2,3,4,5], k=4, x=3
	Output: [1,2,3,4]
	Example 2:

	Input: [1,2,3,4,5], k=4, x=-1
	Output: [1,2,3,4]
	Note:

	The value k is positive and will always be smaller than the length of the sorted array.
	Length of the given array is positive and will not exceed 104
	Absolute value of elements in the array and x will not exceed 104 
	
	if target x is less than first element then return first to k elements
	if target is greater than last element then return last k elements 
	
	else find the index of x , if not present find the element greater than x using binary search
	
	then choose left buffer of k-1 elements from index  and the same to right side .
	
	start eliminating from this array. if low is 0 or (x - low) is greater than high - x then decrement high
	if high is array length or high -x is lower than x-low then increment low
	
	return array when size of array is k 
	
	*/
	
    public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        
    	if(x <= arr.get(0)) {		
    		return arr.subList(0, k);
    	}
    	
    	if(x>arr.get(arr.size()-1)) {
    		return arr.subList(arr.size()-k, arr.size());
    	}
    	
    	int low = 0 , high = arr.size()-1;
    	int index = -1;
    	while(low < high) {
    		int mid = (high - low)/2 + low;
    		if( x == arr.get(mid)) {
    			index = mid;
    			break;
    		}
    		else if(x < arr.get(mid) ) {
    			high = mid-1;
    		}
    		else {
    			low = mid +1;
    		}
    	}
    	
    	if(index == -1)
    		index = low;
    	
    	low = Math.max(0, index - k -1);
    	high = Math.min(arr.size()-1,  index + k -1);
    	
    	
    	while(high - low > k -1) {
    		if(low < 0 || x - arr.get(low) > arr.get(high) - x )
    			low +=1;
    		else if (high > arr.size()-1 || x - arr.get(low) <= arr.get(high)-x)
    			high -=1;
    		
    	}
    	
    	return arr.subList(low, high + 1);
   }

}
