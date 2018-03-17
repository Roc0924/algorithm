package learning.algorithm.simple.twoSum;

import learing.algorithm.simple.twoSum.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/17
 * Time                 : 下午3:47
 * Description          : 测试两数之和
 */

public class TwoSumTest {
    int[] input = {3, 2, 4};
    int target = 6;
    int[] output = new int[2];

    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        output = solution.twoSum(input, target);
        assertEquals(output[0], 1);
        assertEquals(output[1], 2);

        System.out.println("[" + output[0] + "," + output[1] + "]");

    }
}
