package java_algos;
//Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].

import org.junit.jupiter.api.Test;

public class SearchForRange {
	
	public int[] SearchRange(int[] numbers, int target) {
		
		int[] result = new int[] {-1,-1};
		
		binarysearch(numbers, 0, numbers.length -1 , result , target);		
		return result;		
	}
	
	public void binarysearch(int[] numbers, int left, int right, int[] result, int target) {
		if (right < left) return;
		int midPoint = numbers.length / 2;

		if(left == right && result[left] == target) {
			result[left] = left;
			result[right] = right;
			return;
		}
		
		if(target<numbers[midPoint]) {
			binarysearch(numbers, left, midPoint, result, target);
			
		}
		else if (target > numbers[midPoint]){
			binarysearch(numbers, midPoint, right, result, target);
		}
		else {
			result[0] = midPoint;
			result[1] = midPoint;
			
			int duplicate = midPoint;
			while(duplicate > left && numbers[duplicate] == numbers[duplicate -1] ) {
				result[0] = duplicate -1;
				duplicate--;
			}
			int duplicate2 = midPoint;
			while(duplicate2 < right && numbers[duplicate2] == numbers[duplicate2 +1]) {
				result[1] = duplicate2 +1;
				duplicate2++;
			}
		return;

	}
		
}
	
	@Test
	public void testMethod() {
		SearchForRange s = new SearchForRange();
		int[] x = {1,1,5,5,6,6,6,7,8,9};
		System.out.println(s.SearchRange(x, 6)[0]);
		System.out.println(s.SearchRange(x, 6)[1]);

	}

}
