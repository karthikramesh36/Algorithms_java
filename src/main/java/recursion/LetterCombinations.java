package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
	public HashMap<Character, String> map;
	public LetterCombinations() {
		map = new HashMap<Character, String>();
		map.put('1',"");
		map.put('2',"abc");
		map.put('3',"def");
		map.put('4',"ghi");
		map.put('5',"jkl");
		map.put('6',"mno");
		map.put('7',"pqrs");
		map.put('8',"tuv");
		map.put('9',"wxyz");
	}

	
	
	
	public  List<String> Combinations(String digits){
		ArrayList<String> res = new ArrayList<String>();
		
		char[] ch = new char[digits.length()];
		
		Combinations(0, ch, digits, res);
		
		
		return res;
	}

	private void Combinations(int index, char[] ch, String digits,  ArrayList<String> res) {
		
		if(index == digits.length()) {
			res.add(new String(ch));
			return;
		}
			
		
		String letters = map.get(digits.charAt(index));
		
		for(int i = 0 ; i < letters.length(); i++) {
			
			ch[index] = letters.charAt(i);
			
			Combinations(index + 1, ch, digits, res);
		}
		
	}

}
