package com.learning.two.exer2;

/**
 * ClassName: YangHuiTriangleExper
 * Description: 杨辉三角练习
 * 每一行元素的收尾元素都为1
 * 第一行和第二行元素都为1
 * 每一行的元素个数等于行数
 * 从第三行起，除收尾元素，其他元素等于前一行元素相邻2个元素的和
 *
 * 1
 * 1    1
 * 1    2   1
 * 1    3   3   1
 * 1    4   6   4   1
 * 1    5   10  10  5   1
 * ...
 *
 * @author: yurenwang
 * @create: 2023/9/19 16:28
 * @version: 1.0
 */
public class YangHuiTriangleExper {
    public static void main(String[] args) {
        testTriangle();
        // 最大行数
        final int MAX = 11;
        long startTime = System.currentTimeMillis();
        int[][] arr = new int[MAX][];
        for (int i = 0; i < arr.length; i++) {
            // 二维数组元素初始化值
            arr[i] = new int[i + 1];
            // 每行元素的首元素赋值
            arr[i][0] = 1;
            // 每行元素的最后一个元素赋值
            arr[i][arr[i].length - 1] = 1;
            // 给每行除收尾元素的其他元素赋值
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        // 遍历杨辉三角
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("方式1总耗时：" + (endTime - startTime));
    }

    /**
     * 此算法来自网络
     */
    public static void testTriangle() {
        final int NMAX = 10;

        long startTime = System.currentTimeMillis();
        // allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // print triangular array
        for (int[] row : odds)
        {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("方式2总耗时：" + (endTime - startTime));
    }
}
