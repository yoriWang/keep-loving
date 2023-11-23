package com.learning.OOP.project.domain;

/**
 * ClassName: PC
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 15:42
 * @version: 1.0
 */
public class PC implements Equipment {
    // 设备型号
    private String model;

    // 显示器名称
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
