package com.learning.OOP._abstract.Geometric;

/**
 * ClassName: Rectangle
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/24 16:58
 * @version: 1.0
 */
public class Rectangle extends Geometric {

    // 矩形的高
    double height;
    // 矩形的底边长
    double bottom;

    public Rectangle() {
    }

    public Rectangle(double height, double bottom) {
        this.height = height;
        this.bottom = bottom;
    }

    @Override
    public void findArea() {
        System.out.println("底边长为：" + bottom + ", 高为" + height + "的矩形的面积为：" + (height * bottom));
    }

    @Override
    public void findCircumference() {
        System.out.println("底边长为：" + bottom + ", 高为" + height + "的矩形的周长为：" + (height + bottom) * 2);
    }
}
