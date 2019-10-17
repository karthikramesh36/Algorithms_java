package binarysearch;

public class BinarySearch {
	
	
	// return nearest left index if not found 
	public static int Search(int[] arr, int target) {
		int low = 0, high = arr.length-1;
		return SearchAdvanced(arr,low,high,target);
	}
	
	public static int SearchAdvanced(int[] arr, int low , int high, int target) {
		while(low <= high) {
			
			int mid = (high - low )/2 + low;
			
			if(target == arr[mid])
				return mid;
			else if ( target < arr[mid])
				high = mid-1;
			else
				low = mid+1;
		}
		
		return low;
	}

}
