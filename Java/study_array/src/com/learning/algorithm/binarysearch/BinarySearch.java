package com.learning.algorithm.binarysearch;

/**
 * ClassName: BinarySearch
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/22 11:20
 * @version: 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        // 定义有序的一维数组
        int[] nums = new int[]{3, 21, 25, 26, 27, 38, 40, 41, 43, 65, 82, 89, 90, 92, 96};
        // 起始索引
        int startIndex = 0;
        // 终止索引
        int endIndex = nums.length - 1;
        // 目标数
        int targetNum = 82;

        int midIndex = (startIndex + endIndex) / 2;

        // 目标索引
        int targetIndex = -1;

        while (startIndex <= endIndex) {
            midIndex = (endIndex + startIndex) / 2;
            if (targetNum < nums[midIndex]) {
                endIndex = midIndex - 1;
            } else if (targetNum > nums[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                targetIndex = midIndex;
                break;
            }
        }
        if (targetIndex != -1) {
            System.out.println("目标索引为：" + targetIndex);
        } else {
            System.out.println("未找到目标数" + targetNum + "的索引");
        }

    }
}
