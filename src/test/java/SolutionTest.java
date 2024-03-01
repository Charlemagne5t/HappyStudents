import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1(){
        List<Integer> nums = new ArrayList<>(List.of(1,1));
        int expected = 2;
        int actual = new Solution().countWays(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        List<Integer> nums = new ArrayList<>(List.of(6,0,3,3,6,7,2,7));
        int expected = 3;
        int actual = new Solution().countWays(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        List<Integer> nums = new ArrayList<>(List.of(2,2,7,1,2,2,4,7));
        int expected = 3;
        int actual = new Solution().countWays(nums);

        Assert.assertEquals(expected, actual);
    }
}
