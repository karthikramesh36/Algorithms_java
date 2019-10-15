package binarysearch;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindKClosestElementsToXTest {
	
	@Test
	public void test() {
		FindKClosestElementsToX fx = new FindKClosestElementsToX();
        List<Integer> arr = new ArrayList<>(); 
        arr.add(2);
        arr.add(3);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(15);

		var res =  fx.findClosestElements(arr, 4,9);
		
		
	}

}
