package com.learning.OOP.singleton;

/**
 * ClassName: CarTest
 * Description: 单例模式之懒汉式
 *
 * 优点是节省内存空间，在需要的时候加载
 * 缺点是线程不安全的
 *
 * @author: yurenwang
 * @create: 2023/10/20 11:20
 * @version: 1.0
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();

        System.out.println(car1 == car2);
    }
}

class Car {
    private static Car instance = null;

    private Car() {
    }

    public static Car getInstance() {
        if (instance == null) {
            instance = new Car();
        }
        return instance;
    }
}
