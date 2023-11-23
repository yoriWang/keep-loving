package com.learning.OOP.project.domain;

/**
 * ClassName: Architect
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 16:19
 * @version: 1.0
 */
public class Architect extends Designer {
    // 股票
    int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" +
                getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return getTeamDetail() + "架构师\t" + getBonus() + "\t\t" + getStock();
    }
}
