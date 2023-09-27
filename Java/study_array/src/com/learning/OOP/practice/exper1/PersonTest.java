package com.learning.OOP.practice.exper1;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/24 18:32
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();

        p.name = "张三";
        p.age = 15;
        p.gender = '男';

        p.study();

        System.out.println("当前年龄为：" + p.showAge());

        p.addAge(2);

        System.out.println("当前年龄为：" + p.showAge());
    }
}
