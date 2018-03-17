package learing.algorithm.simple;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/17
 * Time                 : 下午12:54
 * Description          : 快速排序
 */

public class QuickSort {
    public static void quickSort(int[] input, int start, int end) {
        int base = input[start];
        int lo = start;
        int hi = end;
        while(lo < hi) {
            while(input[hi] >= base && hi > lo) {
                hi--;
            }
            input[lo] = input[hi];

            while(input[lo] <= base && hi > lo) {
                lo++;
            }
            input[hi] = input[lo];
        }
        input[hi] = base;

        if (hi - 1 > start) {
            quickSort(input, start, hi - 1);
        }

        if (hi + 1 < end) {
            quickSort(input, hi + 1, end);
        }
    }
}
