package arrays;

/*Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[]. The array might also contain duplicates. You may assume that both x and y are different and present in arr[].

Examples:
Input: arr[] = {1, 2}, x = 1, y = 2
Output: Minimum distance between 1 and 2 is 1.

Input: arr[] = {3, 4, 5}, x = 3, y = 5
Output: Minimum distance between 3 and 5 is 2.

Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
Output: Minimum distance between 3 and 6 is 4.

Input: arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2
Output: Minimum distance between 3 and 2 is 1.
*/

public class FindMinimumDistanceBetweenTwoNumbers {

	
	public int MinDist(int[] arr, int x, int y) {
		
		int prevIndex = -1;
		int dis = Integer.MAX_VALUE;
		
		for(int i=0; i< arr.length; i++) {
			
			if(arr[i] == x || arr[i] == y) {
				if(prevIndex != -1 && arr[i] != arr[prevIndex]) {
					
					dis = Math.min(dis, i-prevIndex);
				}
				
				prevIndex = i;
			}
		}
		
		return dis;
	}
}
