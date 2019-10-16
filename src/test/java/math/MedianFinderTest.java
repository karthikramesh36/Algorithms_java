package math;

import org.junit.Test;

public class MedianFinderTest {
	@Test
	public void test() {
		
		MedianFinder mf = new MedianFinder();
		
		mf.addNum(1);
		mf.addNum(2);
		double m = mf.findMedian();
		
	}

}
