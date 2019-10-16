package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * given a string example "abaacab" , and given a list of indexes , for each character at a index from list , find the closest character , if tie give the left character
 */
public class ShortestDistanceToTargetLetter {
	
	public List<Integer> solution(String s , List<Integer> queries){
		
		HashMap<Character,List<Integer>> map = new HashMap<>();
		
		for(int i =0 ; i < s.length();i++) {
			map.computeIfAbsent(s.charAt(i),(K)-> new ArrayList<Integer>()).add(i);
			//map.put(s.charAt(i), map.getOrDefault(s.charAt(i), new ArrayList<Integer>()).add(i));
		}
		
		List<Integer> res = new ArrayList<>(queries.size());
		for(int q:queries) {
			
			List<Integer> indexes = map.getOrDefault(s.charAt(q), new ArrayList<Integer>());
			res.add(Collections.binarySearch(indexes, q));
		}
		
		return res;
	}

}
