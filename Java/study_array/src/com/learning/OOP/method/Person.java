package com.learning.OOP.method;

/**
 * ClassName: Person
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/22 17:00
 * @version: 1.0
 */
public class Person {
    // 姓名  默认值为null
    String name;
    // 年龄  默认值为0
    int age;
    // 性别  默认值为ASCII的0
    char gender;

    // 定义方法
    public void eat() {
        System.out.println("人在吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人每天需要睡" + hour + "小时");
    }
}
