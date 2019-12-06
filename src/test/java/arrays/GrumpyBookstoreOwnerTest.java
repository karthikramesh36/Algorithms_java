package arrays;

import org.junit.Test;

public class GrumpyBookstoreOwnerTest {
	
	@Test
	public void test() {
		GrumpyBookstoreOwner g = new GrumpyBookstoreOwner();
		var ans = g.maxSatisfied(new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1},3);
	}

}
