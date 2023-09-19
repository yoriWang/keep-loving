package com.learning.two.exer1;

/**
 * ClassName: ArrayExper1
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/19 16:09
 * @version: 1.0
 */
public class ArrayExper1 {
    public static void main(String[] args) {
        // 静态初始化
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.print("输出元素为：");
        // 二维数组的遍历
        for (int i = 0; i < arr.length; i++) {
            int[] tempArr = arr[i];
            for (int j = 0; j < tempArr.length; j++) {
                System.out.print(tempArr[j] + "\t");
            }
        }
        System.out.println();

        int[][] arr2 = new int[2][];
        arr2[0] = new int[3];
        System.out.println(arr2[0][0]);
    }
}
