package com.learning.OOP.encapsulation.exper4.test1;

/**
 * ClassName: Order
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/7 17:14
 * @version: 1.0
 */
public class Order {

    // 声明不同权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;
//    protected int orderProtected;

    // 声明不同权限的方法
    private void methodPrivate() {

    }

    void methodDefault() {

    }

    public void methodPublic() {

    }

    public void test() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        methodPrivate();
        methodDefault();
        methodPublic();
    }
}
