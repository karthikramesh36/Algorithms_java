package arrays;

import java.util.ArrayList;
import java.util.List;

/*Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

*/
public class LeadersInArray {

	public List<Integer> FindLeaders(int[] arr){
		int currentLeader = -1;
		List<Integer> res = new ArrayList<Integer>();
		
		for(int i = arr.length-1 ; i >=0; i--) {
			
			if(arr[i] >= currentLeader) {
				res.add(arr[i]);
				currentLeader = arr[i];
			}
		}
		
		return res;
	}
}
