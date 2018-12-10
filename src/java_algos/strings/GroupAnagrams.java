package java_algos.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
/*
 * Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */
	
    public List<List<String>> groupAnagrams(String[] strs) {
    	
    	
    		HashMap<Integer,List<String>> map= new HashMap<>();
	    	for(String str : strs) {
	        	char[] array = str.toCharArray();
	        	int value = findValue(array);
	        	if(!map.containsKey(value))	map.put(value, new ArrayList<String>());
	        	map.get(value).add(str);

	    	}
	    	return new ArrayList<List<String>>(map.values());
    }
    
    public int findValue(char[] array) {
	    	int[] dict = {3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
	    	int value = 1;

	    	for(char ch : array) {
	    		value *= dict[ch - 'a'];
	    	}
	    	return value;
    }
}
