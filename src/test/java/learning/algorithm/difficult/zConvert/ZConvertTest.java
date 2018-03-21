package learning.algorithm.difficult.zConvert;

import learing.algorithm.difficult.zConvert.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/20
 * Time                 : 下午5:47
 * Description          : Z型转换测试
 */

public class ZConvertTest {

    @Test
    public void zConvertTest() {
        String input = "PAYPALISHIRING";

        Solution solution = new Solution();
        String output = solution.convert(input, 3);

        assertEquals("PAHNAPLSIIGYIR", output);
    }
}
