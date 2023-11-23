package com.learning.OOP.project.domain;

/**
 * ClassName: Designer
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 16:16
 * @version: 1.0
 */
public class Designer extends Programmer {

    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + getBonus() + "\t\t\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return getTeamDetail() + "设计师\t" + getBonus();
    }
}
