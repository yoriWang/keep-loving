package com.learning.OOP.practice.exper1;

/**
 * ClassName: Person
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/24 18:30
 * @version: 1.0
 */
public class Person {

    String name;

    int age;

    char gender;

    public void study() {
        System.out.println("studying");
    }

    public int showAge() {
        return age;
    }

    public void addAge(int addAge) {
        age += addAge;
    }
}
