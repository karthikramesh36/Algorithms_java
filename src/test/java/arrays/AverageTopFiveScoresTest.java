package arrays;

import org.junit.Test;

public class AverageTopFiveScoresTest {
	
	@Test
	public void test() {
		AverageTopFiveScores avg = new AverageTopFiveScores();
		var res = avg.highFive(new int[][] {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}});
	}
	

}
