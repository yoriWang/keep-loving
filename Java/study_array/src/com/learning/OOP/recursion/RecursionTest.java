package com.learning.OOP.recursion;

/**
 * ClassName: RecursionTest
 * Description: 递归的使用
 *
 * @author: yurenwang
 * @create: 2023/9/27 13:39
 * @version: 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        // 斐波那契数列的实现
        RecursionTest test = new RecursionTest();
        System.out.println(test.fibo(50));
    }

    public long fibo(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
