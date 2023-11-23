package com.learning.OOP.encapsulation.exper1;

/**
 * ClassName: Person
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/7 14:17
 * @version: 1.0
 */
public class Person {

    // 定义私有年龄属性
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 130 || age < 0) {
            System.out.println("您输入的年龄不合法。");
            return;
        }
        this.age = age;
    }


}
