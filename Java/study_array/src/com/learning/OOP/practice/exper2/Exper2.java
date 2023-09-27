package com.learning.OOP.practice.exper2;

/**
 * ClassName: Exper2
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/9/24 18:36
 * @version: 1.0
 */
public class Exper2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2.3;

//        System.out.println("圆的面积为：" + circle.circleArea());
        circle.findArea();
    }
}
