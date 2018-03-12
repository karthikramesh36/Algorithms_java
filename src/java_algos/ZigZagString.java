package java_algos;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ZigZagString {

	// given a string , once written in zigzag formet , print it out again
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