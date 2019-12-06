package arrays;
/*
 * You are given a circular array nums of positive and negative integers. If a number k at an index is positive, then move forward k steps. Conversely, if it's negative (-k), move backward k steps. Since the array is circular, you may assume that the last element's next element is the first element, and the first element's previous element is the last element.

Determine if there is a loop (or a cycle) in nums. A cycle must start and end at the same index and the cycle's length > 1. Furthermore, movements in a cycle must all follow a single direction. In other words, a cycle must not consist of both forward and backward movements.

 

Example 1:

Input: [2,-1,1,2,2]
Output: true
Explanation: There is a cycle, from index 0 -> 2 -> 3 -> 0. The cycle's length is 3.
Example 2:

Input: [-1,2]
Output: false
Explanation: The movement from index 1 -> 1 -> 1 ... is not a cycle, because the cycle's length is 1. By definition the cycle's length must be greater than 1.
Example 3:

Input: [-2,1,-1,-2,-2]
Output: false
Explanation: The movement from index 1 -> 2 -> 1 -> ... is not a cycle, because movement from index 1 -> 2 is a forward movement, but movement from index 2 -> 1 is a backward movement. All movements in a cycle must follow a single direction.
 

Note:

-1000 <= nums[i] <= 1000
nums[i] != 0
1 <= nums.length <= 5000


Approach : for every element check if cycle exists

	to check cycle
		-direction either go forward or backward
		-the number of visits must be lesser than the number of elements else chances of infinite loop occur
		-start at given index i
		while number of visits less than length of elements
			if direction violation return false;
			go to next element
			if current index out of array bounds then circle back by either adding or subtracting array length until inside array bounds
			increment number of visits
			if current index after hopping is the same index as i
				if number of hops is greater than 1 then return true else false
		
		if no cycle found then return false;
 */
public class CircularArrayLoop {

    public boolean circularArrayLoop(int[] nums) {
        boolean res;
        for(int i =0; i < nums.length; i++){
            res = CheckCycle(nums, i);
            if(res == true)
                return true;
        }
        
        return false;
    }
    
    public boolean CheckCycle(int[] nums, int i){
        
        boolean forward = nums[i] > 0 ? true : false;
        int hops = 0;
        int start = i;
        while( hops < nums.length){
        	if(!forward && nums[start] >0 )
        		return false;
        	else if (forward && nums[start]<0)
        		return false;
            start = start + nums[start];
            if(forward && start > nums.length - 1)
                start = start - nums.length;
            else if(!forward && start < 0 )
                start = start + nums.length;
            hops++;
            if(start == i) {
            	if( hops > 1)
            		return true;
            	else 
            		return false;
            }
        }
        return false;
        
    }
}
