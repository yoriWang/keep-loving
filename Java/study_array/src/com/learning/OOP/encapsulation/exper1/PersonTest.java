package com.learning.OOP.encapsulation.exper1;

/**
 * ClassName: PersonTest
 * Description: 封装的练习
 * 创建程序，在其中定义两个类，Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象p，调用setAge()和getAge()方法，体会Java的封装性。
 *
 * @author: yurenwang
 * @create: 2023/10/7 14:17
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(180);
        int age = p.getAge();
        System.out.println("设置的年龄为：" + age);
    }
}
