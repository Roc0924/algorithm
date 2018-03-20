package learing.algorithm.simple.addTwoNumber;


/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/20
 * Time                 : 下午3:07
 * Description          : 两数相加
 * leetcode查看他人code：https://leetcode-cn.com/submissions/detail/70389/
 */

public class Solution {

    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode pointer = null;

        int val = 0;
        do {
            int i = 0;
            int j = 0;
            int mod = 0;
            if (null != l1){
                i = l1.val;
                l1 = l1.next;
            }
            if (null != l2) {
                j = l2.val;
                l2 = l2.next;
            }
            int sum = i + j + val;
            val = sum / 10;
            mod = sum % 10;
            ListNode modNode = new ListNode(mod);
            if (null == result) {
                result = modNode;
                pointer = modNode;
            } else {
                pointer.next = modNode;
                pointer = modNode;
            }


        } while(l1 != null || l2 != null);
        if (val != 0) {
            pointer.next = new ListNode(val);
        }
        return result;

    }
}
