package com.learning.OOP.project.domain;

/**
 * ClassName: Printer
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 15:42
 * @version: 1.0
 */
public class Printer implements Equipment {
    // 设备名称
    private String name;
    // 设备类型
    private String type;

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
