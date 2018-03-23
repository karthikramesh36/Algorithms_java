package java_algos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string text, int nRows);
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

public class ZigZagString {


	public String Convert(String s , int numberOfRows) {
		
		if(numberOfRows == 1 || s.length() == 1) {
			return s;
		}
		
		List<String> zigZagString = new ArrayList<String>();
		int stepOver = (2 * numberOfRows) - 2 ;
		for(int row = 0; row < numberOfRows; row++) {
			if (row == 0 || row == numberOfRows -1 ) {
				for(int j=row; j< s.length(); j = j+ stepOver) {
					zigZagString.add(String.valueOf((s.charAt(j))));
				}
			}
			else {
				Boolean flag = true;
				int stepOver1 = 2 * (numberOfRows -1 - row);
				int stepOver2 = stepOver - stepOver1;
				int j = row;
				while(j<s.length()) {
					if(flag) {
						zigZagString.add(String.valueOf(s.charAt(j)));
						j += stepOver1;
					}
					else {
						zigZagString.add(String.valueOf(s.charAt(j)));
						j += stepOver2;	
					}
					flag = !flag;
				}
			}
		}
		
		return zigZagString.toString();
	}


	@Test
	public void testZigZagString() {
		ZigZagString z = new ZigZagString();
		System.out.println(z.Convert("THISISATESTSOKILLIT", 6));
		
	}
}