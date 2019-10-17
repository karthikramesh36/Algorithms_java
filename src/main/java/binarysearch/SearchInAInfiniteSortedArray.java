package binarysearch;

public class SearchInAInfiniteSortedArray {
	
	public int Search(int[] arr, int target) {
		
		if (arr.length ==0)
			return -1;
		
		int low =0, high = 2;
		
		while(arr[high] < target) {
			low = high;
			if(target < arr[high])
				break;
			
			if( 2* high > arr.length-1)
				high = arr.length-1;
			else
				high = 2 * high;
		}
		
		return BinarySearch.SearchAdvanced(arr, low, high, target);
	}

}
