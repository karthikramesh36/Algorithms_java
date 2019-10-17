package math;

/*
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Could you solve it without converting the integer to a string?

approach:reduce the number of digits by half , and reverse the extracted half . compare it to get if number is palindrome.

Time complexity : O(log10(n))

We divided the input by 10 for every iteration, so the time complexity is O(log10(n))

Space complexity : O(1)

 */
public class PalindromeNumber {
	
    public boolean isPalindrome(int x) {
    	
    	if(x <0 || (x%10 ==0 && x !=0))
    		return false;
    	
    	int reverseNumber = 0;
    	
    	while(x > reverseNumber) {
    		
    		reverseNumber = reverseNumber * 10 + x % 10;
    		
    		x = x/10;
    	}
    	
    	return reverseNumber == x || reverseNumber/10 == x;
    }

}
