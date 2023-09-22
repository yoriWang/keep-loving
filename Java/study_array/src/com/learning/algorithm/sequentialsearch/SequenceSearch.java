package com.learning.algorithm.sequentialsearch;

/**
 * ClassName: SequenceSearch
 * Description: 顺序查找
 *
 * @author: yurenwang
 * @create: 2023/9/22 11:14
 * @version: 1.0
 */
public class SequenceSearch {
    public static void main(String[] args) {
        // 定义一维数组
        int[] nums = new int[]{2, 3, 5, 1, 7, 0, 9, 34, 65, 72, 89, 18};
        // 查找34对应的索引
        int targetNum = 34;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == targetNum) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("目标数对应的索引值为：" + index);
        } else {
            System.out.println("目标数不存在！");
        }
    }
}
