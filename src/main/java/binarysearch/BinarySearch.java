package binarysearch;

public class BinarySearch {
	
	
	// return nearest left index if not found 
	public int Search(int[] arr, int target) {
		int low = 0, high = arr.length-1;
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
