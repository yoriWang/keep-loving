package com.learning.OOP.encapsulation.exper2;

/**
 * ClassName: Book
 * Description: 封装案例2
 * 自定义图书类
 * 书名bookName,
 * 作者author,
 * 价格price;
 *
 * 方法包括：
 * 相应属性的getter/setter方法
 * 图书信息介绍等
 *
 * @author: yurenwang
 * @create: 2023/10/7 14:33
 * @version: 1.0
 */
public class Book {

    private String bookName;

    private String author;

    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("您输入的图书价格有误。");
            return;
        }
        this.price = price;
    }

    public String showBookInfo() {
        return "书名为：" + this.bookName + ", 作者是：" + this.author + ", 价格为：" + this.price + "元";
    }
}
