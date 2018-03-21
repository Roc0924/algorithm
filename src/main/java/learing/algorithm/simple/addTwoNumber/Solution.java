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
        int sum;
        int val1;
        int val2;
        int tmp = 0;
        while(null != l1 || null != l2 || 0 != tmp) {
            val1 = null == l1 ? 0 : l1.val;
            val2 = null == l2 ? 0 : l2.val;
            sum = val1 + val2 + tmp;
            if (null == result) {
                result = new ListNode(sum % 10);
                pointer = result;
            } else {
                pointer.next= new ListNode(sum % 10);
                pointer = pointer.next;
            }
            tmp = sum / 10;
            l1 = null == l1 ? null : l1.next;
            l2 = null == l2 ? null : l2.next;
        }
        return result;

    }

    /*

    ListNode result = null;
    ListNode cur = null;
    int temp = 0;
    int val_1;
    int val_2;
    int sum;
        while (l1!=null || l2!=null || temp!=0){
        val_1 = l1==null?0:l1.val;
        val_2 = l2==null?0:l2.val;
        sum = val_1+val_2+temp;
        if (cur==null){
            cur = new ListNode(sum % 10);
            result = cur;//记录头节点
        }else {
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        temp = sum/10;
        l1 = l1==null?null:l1.next;
        l2 = l2==null?null:l2.next;
    }
        return result;
        */
}
