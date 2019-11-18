package strings;

public class LongestValidParantheses {
	
	public int FindLength(String p) {
		
		int left =0,right = 0;
		int max_length = Integer.MIN_VALUE;
		for(int i=0;i< p.length();i++) {
			if(p.charAt(i) =='(') {
				left++;
			}
			else {
				right++;
			}
			
			if(left == right) max_length = Math.max(max_length, right *2);
			else if (right > left) {
				left = right = 0;
			}
		}
		
		left = right = 0;
		
		for(int i = p.length()-1; i >= 0; i--) {
			
			if(p.charAt(i) == ')')
				right++;
			else
				left++;
			
			if(right == left) max_length = Math.max(max_length, left *2);
			else if (left > right) left = right =0;
			
			
		}
		
		
		return max_length;
	}

}
