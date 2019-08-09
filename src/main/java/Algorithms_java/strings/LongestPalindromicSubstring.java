package Algorithms_java.strings;

public class LongestPalindromicSubstring {
/*
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
	
	private int start, maxLength;

	public String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;
		
	    for (int i = 0; i < len-1; i++) {
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(start, start + maxLength);
	}

	private void extendPalindrome(String s, int startIndex, int endIndex) {
		while (startIndex >= 0 && endIndex < s.length() && s.charAt(startIndex) == s.charAt(endIndex)) {
			startIndex--;
			endIndex++;
		}
		if (maxLength < endIndex - startIndex - 1) {
			start = startIndex + 1;
			maxLength = endIndex - startIndex - 1;
		}
	}
}
