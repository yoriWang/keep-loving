package com.learning.OOP._abstract;

/**
 * ClassName: Student
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/24 15:21
 * @version: 1.0
 */
public class Student extends Person {

    String schoolName;

    public Student() {
    }

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    @Override
    public void eat() {
        System.out.println("学生要吃的有营养");
    }

    @Override
    public void sleep() {
        System.out.println("学生要保证每天八小时睡眠");
    }
}
