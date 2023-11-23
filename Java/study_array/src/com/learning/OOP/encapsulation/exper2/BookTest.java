package com.learning.OOP.encapsulation.exper2;

/**
 * ClassName: BookTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/7 14:39
 * @version: 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.setBookName("Java程序设计");
        b.setAuthor("张三");
        b.setPrice(20.35);
        System.out.println(b.showBookInfo());
    }
}
