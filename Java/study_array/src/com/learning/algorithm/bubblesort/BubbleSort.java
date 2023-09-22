package com.learning.algorithm.bubblesort;

/**
 * ClassName: BubbleSort
 * Description: 冒泡排序
 *
 * @author: yurenwang
 * @create: 2023/9/22 15:10
 * @version: 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        // 定义一个无序的一维数组
        int[] nums = new int[]{38, 40, 25, 82, 27, 21, 89, 96, 90, 92, 43, 3, 65, 26, 41};
        boolean isSorted = false;  // 经过一轮的遍历后，判断原数组是否发生交换
        // 遍历和排序
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    isSorted = true;  // 如果进入到这里，则表示元素发生交换
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            // 在进行完一轮排序后，判断元素是否发生交换
            // 如果没有发生交换，则说明数组是有序的
            if (!isSorted) {
                break;
            } else {
                // 如果发生交换了，在进行下一轮排序之前，将isSorted设置为false
                // 方便记录下一轮排序的时候是否发生交换
                isSorted = false;
            }
        }
        // 遍历排序后的结果
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }
}
