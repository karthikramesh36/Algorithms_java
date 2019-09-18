package strings;


import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;


//Given a string, find the length of the longest substring without repeating characters.

//Examples:

//Given "abcabcbb", the answer is "abc", which the length is 3.

//Given "bbbbb", the answer is "b", with the length of 1.

//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class LongestSubstring {

	public int LongestSubstringWithlength(String s) {
		if (s.length() == 1) {
			System.out.println(s);
			return 1;
		}
		int ans =0;
		Map<Character, Integer> longestSubstring = new HashMap<Character, Integer>();
		
		
		for ( int i =0,start =0; i < s.length(); i++ ) {
			
			if(longestSubstring.containsKey(s.charAt(i))) {
				start = Math.max(start, longestSubstring.get(s.charAt(i)));
			}
			ans = Math.max(ans, i-start +1);

			longestSubstring.put(s.charAt(i), i+1);
			
			
		}
		//longestSubstring.keySet().stream().forEach(System.out::println);
		return ans;
		
	}
	
	@Test
	public void test() {
		String s = "avnendjaivn";
		String s1 = "pwwkew";
		LongestSubstring ls = new LongestSubstring();
		assertEquals(3, ls.LongestSubstringWithlength(s1));
	}
}


