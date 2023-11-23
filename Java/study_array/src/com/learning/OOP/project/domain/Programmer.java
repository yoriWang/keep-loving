package com.learning.OOP.project.domain;

import com.learning.OOP.project.service.Status;

/**
 * ClassName: Programmer
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 16:10
 * @version: 1.0
 */
public class Programmer extends Employee {
    // 开发团队中的tid
    private int memberId;
    // 状态
    private Status status = Status.FREE;
    // 设备
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    protected String getTeamDetail() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t\t" + getSalary() + "\t";
    }

    public String getDetailsForTeam() {
        return getTeamDetail() + "程序员";
    }
}
