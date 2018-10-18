package simple_algorithms;

import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSum(int[] arr, int target) {
	    if(arr==null || arr.length<2)
	        return new int[]{0,0};
	 
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<arr.length; i++){
	        if(map.containsKey(arr[i])){
	            return new int[]{map.get(arr[i]), i};
	        }else{
	            map.put(target-arr[i], i);
	        }
	    }
	 
	    return new int[]{0,0};
	}
}
