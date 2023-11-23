package com.learning.OOP._abstract;

/**
 * ClassName: AbstractTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/24 15:19
 * @version: 1.0
 */
public class AbstractTest {
    public static void main(String[] args) {
//        Person p = new Person();  // 抽象类不可以创建实例对象
//        p.eat();

        /**
         * 抽象类：如果类中有方法使用abstract修饰，那么该类就必须声明为抽象类
         * 抽象类不可以被实例化
         * 抽象类中的抽象方法只需要写声明，不需要写方法体
         * 子类重写抽象类声明的方法，称为"实现"
         */
        Student s = new Student();
        s.eat();
    }
}
