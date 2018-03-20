package learning.algorithm.simple.addTwoNumber;


import learing.algorithm.simple.addTwoNumber.Solution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/20
 * Time                 : 下午3:24
 * Description          : 测试两数相加
 */

public class AddTwoNumberTest {

    Solution.ListNode l1;
    Solution.ListNode l2;


    @Before
    public void pre() {
        l1 = new Solution.ListNode(5);
//        l1.next = new Solution.ListNode(4);
//        l1.next.next = new Solution.ListNode(3);


        l2 = new Solution.ListNode(5);
//        l2.next = new Solution.ListNode(6);
//        l2.next.next = new Solution.ListNode(4);
    }



    @Test
    public void addTwoNumberTest() {
        Solution solution = new Solution();
        Solution.ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
//        assertEquals(8, result.next.next.val);
    }

}
