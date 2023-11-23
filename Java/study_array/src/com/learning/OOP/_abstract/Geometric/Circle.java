package com.learning.OOP._abstract.Geometric;

/**
 * ClassName: Circle
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/24 16:58
 * @version: 1.0
 */
public class Circle extends Geometric {

    // 定义圆的半径
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void findArea() {
        System.out.println("半径为：" + radius + "的圆的面积为：" + (3.14 * radius * radius));
    }

    @Override
    public void findCircumference() {
        System.out.println("半径为：" + radius + "的圆的周长为：" + (2 * 3.14 * radius));
    }
}
