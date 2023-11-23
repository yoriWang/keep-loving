package com.learning.OOP.encapsulation.exper3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Description: 封装-对象数组遍历
 * 1、声明员工类
 * - 包含属性，姓名、性别、年龄、电话，属性私有化
 * - 提供getter/setter方法
 * - 提供String getInfo()方法
 *
 * 2、在测试类的main方法中创建员工数组，并从键盘输入员工对象信息，最后遍历输出。
 *
 * @author: yurenwang
 * @create: 2023/10/7 15:39
 * @version: 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("----------添加第" + (i + 1) +"个员工----------");
            Employee employee = new Employee();

            System.out.print("姓名：");
            employee.setName(scan.next());

            System.out.print("性别：");
            employee.setGender(scan.next().charAt(0));

            System.out.print("年龄：");
            employee.setAge(scan.nextInt());
            
            System.out.print("电话：");
            employee.setTel(scan.next());

            employees[i] = employee;
        }
        
        // 遍历
        System.out.println("----------员工列表----------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            System.out.println((i + 1) + "\t\t" + e.getInfo());
        }
        System.out.println("----------员工列表完成----------");
    }
}
