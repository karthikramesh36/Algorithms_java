package recursion;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LetterCombinationsTest {

	@Test
	public void test() {
		LetterCombinations ls = new LetterCombinations();
		System.out.println(ls.map.size());
		int r = ls.map.size();
		List<String> res = new ArrayList<String>();
		res = ls.Combinations("246");
		
	}
}
