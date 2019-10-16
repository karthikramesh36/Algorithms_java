package strings;

public class AddStrings {
/*Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.


approach , if length of both string greater than 0 , 
iterate from the end of strings with two pointers
get the last character and add and save carry
and for each iteration multiply * 10

*/
	
public String addStrings(String num1, String num2) {
	
	int i = num1.length()-1;
	int j = num2.length()-1;
	int carry =0;
	StringBuilder sb = new StringBuilder();
	while(i >= 0 || j>=0 || carry ==1) {
		
		int one = i <=0 ? 0: num1.charAt(i) - '0';
		int two = j <0 ? 0: num2.charAt(j) - '0';
		sb.insert(0, (one+two+carry )%10);
		carry = (one + two + carry)/10 ; 
		i--;
		j--;
		}
	
	return sb.toString();
	}
}
