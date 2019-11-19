package strings;

import java.util.Stack;

/*
 * Given a string s of '(' , ')' and lowercase English characters. 

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 

Example 1:

Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
Example 2:

Input: s = "a)b(c)d"
Output: "ab(c)d"
Example 3:

Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
Example 4:

Input: s = "(a(b(c)d)"
Output: "a(b(c)d)"
 

Constraints:

1 <= s.length <= 10^5
s[i] is one of  '(' , ')' and lowercase English letters.



Approach:

Iterate through the string , for each character , 
	if ( then add to stack 
	if ) then check if top of stack has ( , if so its a valid pair , pop the top of stack
	if not then mark the ) in string with a special character so we know that we have to remove it later.
	 
	 finally after iteration if the stack still has ( left , for each ( set it as a special character in string 
	 
	 
	 return string with all special characters replaced as ''
	 
	
	Time Complexity = O(n) , length of the string . 
 */
public class MinimumRemoveToMakeValidParentheses {
	public String minRemoveToMakeValid(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		Stack<Integer> stack = new Stack<>();
		
		for(int i =0; i < sb.length(); i++) {
			
			if( sb.charAt(i) == '(')
				stack.push(i);
			
			if(sb.charAt(i) == ')') {
				if(!stack.isEmpty())
					stack.pop();
				else
					sb.setCharAt(i, '*');
			}
				
		}

		while(!stack.isEmpty())
			sb.setCharAt(stack.pop(), '*');
		
		return sb.toString().replace("\\*","");
		
	}

}
