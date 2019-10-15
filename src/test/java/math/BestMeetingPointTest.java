package math;

import org.junit.Test;

import math.BestMeetingPoint;


public class BestMeetingPointTest {
    @Test
    public void test() {
        BestMeetingPoint d = new BestMeetingPoint();
        int[][] array = new int [][] {{1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}};
        int res = d.minTotalDistance(array);
        
    }
}
