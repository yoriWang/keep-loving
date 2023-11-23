package com.learning.OOP._final;

/**
 * ClassName: FinalTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/23 16:31
 * @version: 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        A a = new A();
//        a.age = 20;  // final修饰的成员变量不可被修改
        System.out.println(a.age);

        A a2 = new A(20);
        System.out.println(a2.age);
    }
}

final class A {
    // 显式赋值
    final int age;

    // 代码块赋值
    {
//        age = 20;
    }

    public A() {
        this.age = 18;
    }

    public A(int age) {
        this.age = age;
    }
}

//class B extends A {}  // 不能继承final修饰的类

/* final修饰的方法不能被重写
class C {
    public final void method() {
        System.out.println("hello");
    }
}

class D extends C {
    @Override
    public void method() {
        System.out.println("override");
    }
}
 */


