package arrays;

import org.junit.Test;

public class IntervalListIntersectionsTest {
	
	@Test
	public void test() {
		IntervalListIntersections i = new IntervalListIntersections();
				
		i.intervalIntersection(new int[][] {{0,2},{5,10},{13,23},{24,25}} , new int [][]{{1,5},{8,12},{15,24},{25,26}} );
	}

}
