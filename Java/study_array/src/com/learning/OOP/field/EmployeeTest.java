package com.learning.OOP.field;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/22 16:38
 * @version: 1.0
 */
public class EmployeeTest {
    // 类的方法存放在堆中的方法区内
    public static void main(String[] args) {
        /**
         * 栈内存：存储局部变量。只要是在方法中定义的变量都是局部变量，一旦变量的生命周期结束，该变量就会被释放
         * 堆内存：存放的是实体，即在堆内存中开辟出一片内存区存放new关键字创建的实例对象，每一个实体都有一个首地址，
         *        堆内存的变量都有默认初始化值。堆内存中存放指向方法区对应方法的地址，当调用堆内存中的方法时，会在
         *        栈内存开辟对应的方法空间，入栈后，内存运行结束后会进行出栈，释放内存
         * 方法区：存放的是类文件，即.class文件与字符串常量池
         *
         */
        // 员工类对象的实例化
        // emp 存放在栈中，存放指向Employee的内存地址  (变量名存放在栈中)
        // new Employee() 是在堆中开辟出一个内存空间存放，即类对象存放在堆中
        Employee emp = new Employee();
        // 对象的成员变量同对象一样存放在堆中
        emp.name = "张三";
        emp.age = 30;
        emp.gender = '男';

        System.out.println("姓名：" + emp.name + "， 年龄：" + emp.age + "， 性别：" + emp.gender);
    }
}
