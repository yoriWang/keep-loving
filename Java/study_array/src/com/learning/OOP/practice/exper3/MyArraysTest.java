package com.learning.OOP.practice.exper3;

/**
 * ClassName: MyArraysTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/24 19:33
 * @version: 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 21, 46, 19, 92, 62, 32, 8, 6, 93, 97, 27, 40, 88, 59};
        MyArrays myArrays = new MyArrays();
//        最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、数组排序（默认从小到大排序）、查找等
        System.out.println("数组的最大值为：" + myArrays.max(arr));

        System.out.println("数组的最小值为：" + myArrays.min(arr));

        System.out.println("数组的总和为：" + myArrays.sum(arr));

        System.out.println("数组的平均数为：" + myArrays.avg(arr));

        // 遍历数组
        myArrays.showArray(arr);

        // 复制数组
        System.out.println("原数组的内存地址为:" + arr);
        int[] newArr = myArrays.copy(arr);
        System.out.println("复制后的内存地址为：" + newArr);
        // 遍历复制后的数组
        myArrays.showArray(newArr);

        // 数组查找
        System.out.println("元素92在数组中的索引为：" + myArrays.findIndex(arr, 92));

        // 数组反转
        myArrays.reverse(arr);
        myArrays.showArray(arr);

        // 数组排序
        myArrays.sort(arr);
        myArrays.showArray(arr);


    }
}
