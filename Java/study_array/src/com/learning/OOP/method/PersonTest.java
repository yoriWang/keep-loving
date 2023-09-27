package com.learning.OOP.method;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/22 17:00
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Jack";
        p.age = 20;
        p.gender = '男';

        p.eat();
        p.sleep(8);

        Employee emp = new Employee();
        emp.name = "rose";
        emp.age = 18;
        emp.gender = '女';

        emp.birthDay = new MyDate();
        emp.birthDay.year = 2005;
        emp.birthDay.month = 10;
        emp.birthDay.day = 1;

        System.out.println("姓名：" + emp.name + ", 年龄：" + emp.age + ", 性别：" + emp.gender +
                ", 出生日期：[" + emp.birthDay.year + "年" + emp.birthDay.month + "月" + emp.birthDay.day + "日]");
    }
}
