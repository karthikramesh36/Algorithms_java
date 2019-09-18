package miscellaneous;

import org.junit.Test;

import miscellaneous.Demo;

public class DemoTest{


    @Test
    public void testDemo() {
        Demo d = new Demo();
        d.topKFrequent(new int[] {1,1,3,3,5,5,5,5,16}, 2 );

    }
}
