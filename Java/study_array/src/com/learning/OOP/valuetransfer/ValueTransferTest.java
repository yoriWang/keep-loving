package com.learning.OOP.valuetransfer;

/**
 * ClassName: ValueTransferTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/26 11:29
 * @version: 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        /*
        int m = 10;
        System.out.println("m = " + m);

        m++;
        System.out.println("m = " + m);
        */

        /*
        int m = 10;
        int n = m;

        System.out.println("m = " + m);

        m++;

        System.out.println("m = " + m + ", n = " + n);
         */

        ValueTransferTest vt = new ValueTransferTest();
        int m = 10;

        vt.test(m);

        System.out.println("m = " + m);

    }

    public void test(int m) {
        m++;
    }
}
