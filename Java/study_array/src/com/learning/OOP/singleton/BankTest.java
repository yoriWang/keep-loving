package com.learning.OOP.singleton;

/**
 * ClassName: BankTest
 * Description: 单例模式之饿汉式
 *
 * 饿汉式是线程安全的
 * 优点是线程安全的，
 * 缺点是过早加载，占用空间
 *
 * @author: yurenwang
 * @create: 2023/10/20 11:13
 * @version: 1.0
 */
public class BankTest {

    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}

// 饿汉式
class Bank {

    private static Bank instance = new Bank();

    private Bank() {
    }

    public static Bank getInstance() {
        return instance;
    }
}
