package com.learning.OOP.project.domain;

/**
 * ClassName: NoteBook
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 15:42
 * @version: 1.0
 */
public class NoteBook implements Equipment {
    // 设备型号
    private String model;
    // 价格
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
