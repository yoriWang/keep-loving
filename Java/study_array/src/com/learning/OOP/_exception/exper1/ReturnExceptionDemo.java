package com.learning.OOP._exception.exper1;

/**
 * ClassName: ReturnExceptionDemo
 * Description:
 *
 *
 * @author: yurenwang
 * @create: 2023/11/8 14:11
 * @version: 1.0
 */
public class ReturnExceptionDemo {

    public static void methodA() throws Exception {
        try {
            System.out.println("进入方法A");
            throw new Exception("制造异常");
        } finally {
            System.out.println("调用A方法的finally");
        }
    }

    public static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
    }
}
