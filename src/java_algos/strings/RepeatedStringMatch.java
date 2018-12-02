package java_algos.strings;

public class RepeatedStringMatch {
	
	// given string a = "ab" and b = "ababab" 
	// find number of times a has to be repeated , so that b is a substring of a
	
	
	// find minimum number of times to be repeated before checking
	// repeat a that required number of times
	//check if b is substring of a by repeating a three more times
	// why three? b could overflow on either side of a 
	
	public int numberOfRepetitions(String A, String B) {
		if(A == null || A.length() == 0) return -1;
		int minRepeat = B.length() / A.length() ;
		StringBuilder sb = new StringBuilder();
		minRepeat = (minRepeat == 0) ? 1 : minRepeat;
		for(int i = 0; i < minRepeat ; i ++) {
			sb.append(A);
		}
		
		for(int i = 0; i < 3; i++) {
			if(sb.toString().contains(B))	return minRepeat;
			else {
				sb.append(A);
				minRepeat ++;
			}
		}
		return -1;
	}

}
