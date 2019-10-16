package strings;

import org.junit.Test;

public class AddStringsTest {
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
	@Test
public void test() {
		
		AddStrings ad = new AddStrings();
		ad.addStrings("111", "889");
	}
}
