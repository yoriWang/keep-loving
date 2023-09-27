package com.learning.OOP.practice.exper3;

/**
 * ClassName: MyArrays
 * Description: int[]的工具类
 * 求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、数组排序（默认从小到大排序）、查找等
 *
 * @author: yurenwang
 * @create: 2023/9/24 18:43
 * @version: 1.0
 */
public class MyArrays {

    /**
     * 求整型数组的最大值
     * @param arr 传入的数组
     * @return 返回数组中的最大值
     */
    public int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 求整型数组的最小值
     * @param arr 传入的数组
     * @return 返回数组中的最小值
     */
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 求整型数组的各元素总和
     * @param arr 传入待求和的数组
     * @return 返回总和
     */
    public int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * 求数组的平均数
     * @param arr 待求平均数的数组
     * @return 返回平均值
     */
    public double avg(int[] arr) {
        return sum(arr) * 1.0 / arr.length;
    }

    /**
     * 遍历数组元素，输出格式为[num1, num2, num3, ...]
     * @param arr 待遍历的数组
     */
    public void showArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }

    /**
     * 将传入的数组复制一份
     * @param arr 待复制数组
     * @return 返回新的数组内存起始地址
     */
    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 将数组元素反转
     * @param arr 待反转数组
     */
    public void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 将数组从小到大排序 使用冒泡排序法
     * @param arr 传入待排序数组
     */
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 查找目标元素的索引值
     * @param arr 传入的数组
     * @param target 目标元素
     * @return 返回索引值
     */
    public int findIndex(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}
