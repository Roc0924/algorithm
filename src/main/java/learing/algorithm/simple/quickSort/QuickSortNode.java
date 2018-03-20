package learing.algorithm.simple.quickSort;


/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/17
 * Time                 : 下午1:24
 * Description          :
 */

public class QuickSortNode<T extends Node> {

    public void quickSort1(T[] input, int start, int end) {
        T base = input[start];
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
            quickSort1(input, start, hi - 1);
        }
        if (hi + 1 <= end) {
            quickSort1(input, hi + 1, end);
        }

    }
}
