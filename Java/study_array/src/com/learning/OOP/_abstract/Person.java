package com.learning.OOP._abstract;

/**
 * ClassName: Person
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/24 15:19
 * @version: 1.0
 */
public abstract class Person {

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("人睡觉");
    }
}
