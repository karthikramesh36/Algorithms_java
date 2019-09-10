package strings;

public class ReverseString {
/*
 * Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
 */
	
	public String reverseString(String s) {
        if(s.length() < 2 || s.trim().length() < 2) return s;
        char[] str = s.toCharArray();
        for(int i =0, j = str.length-1; i <j; i++, j--){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        return new String(str);
    }
}
