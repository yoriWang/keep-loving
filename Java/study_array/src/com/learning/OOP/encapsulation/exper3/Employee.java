package com.learning.OOP.encapsulation.exper3;

/**
 * ClassName: Employee
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/7 15:35
 * @version: 1.0
 */
public class Employee {

    private String name;

    private char gender;

    private int age;

    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInfo() {
        return this.name + "\t" + this.gender + "\t\t" + this.age + "\t\t" + this.tel;
    }
}
