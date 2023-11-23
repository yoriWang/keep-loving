package com.learning.OOP.project.domain;

/**
 * ClassName: Employee
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 16:07
 * @version: 1.0
 */
public class Employee {
    // 员工id
    private int id;
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 工资
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected String getDetails() {
        return id + "\t" + name + "\t" + age + "\t\t" + salary;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
