package strings;

import java.util.HashMap;
import java.util.Map;

/*Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:

If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.

constraints to clarify : will there be whitespaces 

Approach: 2 point approach with sliding window

 find substring inside string by increasing right pointer , once found , reduce left pointer and check if smaller one can be found .
*/


public class MinimumWindowSubstring {
	
	public String minWindow(String s, String t) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			map.put(c, 0);
		}
		
		for(char c : t.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
				return "";
		}
		
		
		int left = 0, right = 0, minleft = 0, minlength = Integer.MAX_VALUE, counter = t.length();
		
		while(right < s.length()) {
			
			char ch_right = s.charAt(right);
			if(map.get(ch_right) > 0) {
				counter--;
			}
			map.put(ch_right,map.get(ch_right) -1);
			right++;
			
			while(counter == 0) {
				if(minlength > right-left) {
					minlength = right - left;
					minleft = left;
				}
				
				char ch_left = s.charAt(left);
				map.put(ch_left, map.get(ch_left)+1);
				if(map.get(ch_left)>0) {
					counter++;
				}
				left++;
			}
			
		}
		
		return minlength == Integer.MAX_VALUE ? "" : s.substring(minleft, minleft+minlength);
	}
}