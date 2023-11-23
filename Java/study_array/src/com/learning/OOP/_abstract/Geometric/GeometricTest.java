package com.learning.OOP._abstract.Geometric;

/**
 * ClassName: GeometricTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/24 16:57
 * @version: 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.5;
        c1.findArea();
        c1.findCircumference();

        Rectangle r1 = new Rectangle();
        r1.bottom = 5.0;
        r1.height = 3.2;
        r1.findArea();
        r1.findCircumference();
    }
}
