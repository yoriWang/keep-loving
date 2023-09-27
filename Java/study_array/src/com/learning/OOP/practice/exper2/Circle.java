package com.learning.OOP.practice.exper2;

/**
 * ClassName: Circle
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/24 18:37
 * @version: 1.0
 */
public class Circle {

    // 定义圆的半径
    double radius;

    public double circleArea() {
        return 3.14 * radius * radius;
    }

    public void findArea() {
        System.out.println("圆的面积为：" + (3.14 * radius * radius));
    }
}
