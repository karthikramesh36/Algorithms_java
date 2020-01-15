package arrays;

import java.util.Arrays;

/*Given an array of integers nums and a positive integer k, find whether it's possible to divide this array into k non-empty subsets whose sums are all equal.

 

Example 1:

Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
Output: True
Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
 

Note:

1 <= k <= len(nums) <= 16.
0 < nums[i] < 10000.
*/
public class PartitionToKEqualSumSubsets {

	
    public boolean canPartitionKSubsets(int[] nums, int k) {
     
    	int sum = Arrays.stream(nums).sum();
    	
    	if(sum%k >0) return false;
    	
    	int target = sum/k;
    	
    	Arrays.sort(nums);
    	
    	int index = nums.length-1;
    	
    	if(nums[index] > target) return false;
    	while( index >=0 && nums[index] == target ) {
    		index--;
    		k--;
    	}
    	
    	return helper(new int[k] , nums, target, index);
    	
    }
    
    public boolean helper(int[] groups, int[] nums, int target, int index) {
    	if(index < 0) return true;
    	int v = nums[index];
    	index--;
    	for(int i=0; i<groups.length; i++) {
    		if(groups[i] + v <= target) {
    			groups[i] += v;
    			if(helper(groups,nums,target,index)) return true;
    			groups[i] -=v;
    		}
    		if(groups[i] == 0)
    			break;	
    		
    	}
    	
    	return false;
    }
}
