package learing.algorithm.difficult.zConvert;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2018/3/20
 * Time                 : 下午5:30
 * Description          : Z型转换
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

        int baseRoad = (numRows * 2 - 2) * groupCount;
        index = numColumn % 2 == 0 ? baseRoad + numRow : baseRoad + numRows - 1 + numRows - numRow - 1;

        return index < input.length() ? index : -1;
    }

}
