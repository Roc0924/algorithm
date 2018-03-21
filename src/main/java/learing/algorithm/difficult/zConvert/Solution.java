package learing.algorithm.difficult.zConvert;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/20
 * Time                 : 下午5:30
 * Description          : Z型转换
 * https://leetcode-cn.com/submissions/detail/72810/
 */

public class Solution {
    public String convert(String s, int numRows) {

        StringBuffer sb = new StringBuffer();

        if (s.length() <= 0) {
            return sb.toString();
        }

        if (numRows <= 1) {
            return s;
        }
        //////////////////////
        // 计算逻辑二维数组列数
        int groupNum = numRows * 2 - 2;
        //完整分组个数
        int groupCount = s.length() / groupNum;
        // 不完整分组长度
        int mod = s.length() % groupNum;
        // 列数
        int numColumns = mod <= numRows ? groupCount * 2 + 1 : groupCount * 2 + 2;


        //////////
        // 循环输出
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                // 处理第一行和最后一行
                if ((i == 0 || i == numRows - 1) && j % 2 != 0) {
                    continue;
                }
                int index = generateIndex(s, i,j,numRows);
                if (index >= 0) {
                    sb.append(s.charAt(index));
                }
            }
        }
        return sb.toString();

    }

    int generateIndex(String input, int numRow, int numColumn, int numRows) {

        int index;

        int groupCount = numColumn / 2;

        int groupNum = numRows * 2 - 2;

//        int baseRoad = (numRows * 2 - 2) * groupCount;
//        index = numColumn % 2 == 0 ? baseRoad + numRow : baseRoad + numRows - 1 + numRows - numRow - 1;
        index = numColumn % 2 == 0 ? groupCount * groupNum + numRow : (groupCount + 1) * groupNum - numRow;

        return index < input.length() ? index : -1;
    }

}

/**


 class Solution {
 public String convert(String s, int numRows) {
 if (s == null || s.length() == 0 || numRows <= 1) {
 return s;
 }
 StringBuilder res = new StringBuilder();
//
//a   e
//b d f
//c   g
//从a到d为一个zig，size: 一个zig的大小
//
int size = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
        // 外层循环i表示第几行（从0开始）
        // 内层序号j表示第几个zig（从0开始）
        for (int j = i; j < s.length(); j += size) {
        res.append(s.charAt(j));
        // zig的第一行和最后一行中间的行
        // 每一个zig有两个元素在同一行，如：b和d在同一行
        // 同一行中的两个元素之间的距离是：size-2*i(size一个zig的大小，i当前是第几行，从0开始）
        // 同一个zig中的第一个元素在s中的位置是j，第二个元素在s中的位置是：j+size-2*i
        if (i > 0 && i < numRows - 1) {
        int mid = j + size - 2 * i;
        if (mid < s.length()) {
        res.append(s.charAt(mid));
        }
        }
        }
        }
        return res.toString();
        }
        }


 */