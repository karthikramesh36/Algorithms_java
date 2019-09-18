package recursion;

import org.junit.Test;


public class NumberOfIslandsTest {
    @Test
    public void test() {
        NumberOfIslands d = new NumberOfIslands();
        char[][] array = new char [][] {{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        d.numberOfIslands(array);
        
    }
}
