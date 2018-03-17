package learing.algorithm.simple.twoSum;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/17
 * Time                 : 下午3:44
 * Description          : 两数之和
 */

public class Solution {

    class Node {
        public int index;
        public int value;
    }


    public void quickSort(Solution.Node[] input, int start, int end) {
        Solution.Node base = input[start];
        int lo = start;
        int hi = end;

        while(lo < hi) {
            while(input[hi].value >= base.value && lo < hi) {
                hi--;
            }
            input[lo] = input[hi];
            while(input[lo].value <= base.value && lo < hi) {
                lo++;
            }
            input[hi] = input[lo];

        }

        input[hi] = base;

        if (hi - 1 >= start) {
            quickSort(input, start, hi - 1);
        }
        if (hi + 1 <= end) {
            quickSort(input, hi + 1, end);
        }

    }


    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Solution.Node[] nodes = new Solution.Node[nums.length];


        // format
        for (int i = 0; i < nums.length; i++) {
            nodes[i] = new Solution.Node();
            nodes[i].index = i;
            nodes[i].value = nums[i];
        }


        // sort
        quickSort(nodes, 0, nodes.length - 1);



        // find
        for (int i = 0; i < nodes.length; i++) {
            int delta = target - nodes[i].value;

            for (int j = i + 1; j < nodes.length && delta >= nodes[j].value; j++) {
                if (nodes[j].value == delta) {
                    result[0] = nodes[i].index;
                    result[1] = nodes[j].index;
                }
            }

        }

        return result;
    }




}
