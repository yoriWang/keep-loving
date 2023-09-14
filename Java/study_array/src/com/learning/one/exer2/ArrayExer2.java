package com.learning.one.exer2;

/**
 * ClassName: ArrayExer2
 * Description:
 * 案例：解密手机号码
 * 给定号码数字数组{8, 2, 1, 0, 3}
 * 给定11位索引
 * {2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3}
 *
 * @author: yurenwang
 * @create: 2023/9/14 15:21
 * @version: 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        // 定义一个空号码字符串
        String tel = "";
        int[] arrs = new int[]{8, 2, 1, 0, 3};
        int[] indexs = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        for (int i = 0; i < indexs.length; i++) {
            int index = indexs[i];
            tel += arrs[index];
        }
        System.out.println("解密后的号码为：" + tel);
    }
}
