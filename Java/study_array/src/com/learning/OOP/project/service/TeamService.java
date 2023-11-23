package com.learning.OOP.project.service;

import com.learning.OOP.project.domain.Architect;
import com.learning.OOP.project.domain.Designer;
import com.learning.OOP.project.domain.Employee;
import com.learning.OOP.project.domain.Programmer;

/**
 * ClassName: TeamService
 * Description:
 * 关于开发团队成员的管理：添加、删除等
 *
 * @author: yurenwang
 * @create: 2023/11/17 15:45
 * @version: 1.0
 */
public class TeamService {
    // 给memberid自动赋值
    private static int counter = 1;

    // 表示当前团队能接收的最大成员数
    private final int MAX_MEMBER = 5;

    // 开发团队成员数组
    private Programmer[] team = new Programmer[MAX_MEMBER];

    // 记录开发团队中总人数
    private int total = 0;

    /**
     * 向团队中添加成员
     *
     * @param e 待添加成员的对象
     * @throws TeamException 添加失败，TeamException中包含了失败原因
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满， 无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满， 无法添加");
        }

        //该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        Programmer p = (Programmer) e;

        //该员工已是某团队成员，无法添加
        if (p.getStatus() == Status.BUSY) {
            throw new TeamException("该员工已是某团队成员，无法添加");
        }

        //该员工正在休假，无法添加
        if (p.getStatus() == Status.VOCATION) {
            throw new TeamException("该员工正在休假，无法添加");
        }

        // 该员工已在开发团队中
        boolean isExist = isExist(e);
        if (isExist) {
            throw new TeamException("该员工已是团队成员，无法添加");
        }

        int architectCount = 0;
        int designerCount = 0;
        int programmerCount = 0;
        for (int i = 0; i < total; i++) {
            //团队中至多只能有一名架构师
            if (team[i] instanceof Architect) {
                architectCount++;
            } else if (team[i] instanceof Designer) {
                //团队中至多只能有两名设计师
                designerCount++;
            } else {
                //团队中至多只能有三名程序员
                programmerCount++;
            }
        }

        if (p instanceof Architect) {
            if (architectCount >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (designerCount >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {
            if (programmerCount >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //可以正常添加
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    /**
     * 移除团队中的成员
     *
     * @param memberId 待移除的成员Id
     * @throws TeamException 找不到指定的memberId成员，删除失败
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        //没找到对应的成员
        if (i == total) {
            throw new TeamException("找不到指定的memberId成员，删除失败");
        }

        // 找到对应的成员，移动数组元素
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        //total总数要变化
        team[--total] = null;
    }

    /**
     * 返回当前团队的所有对象
     *
     * @return 包含所有成员对象的数组，数组大小与成员的人数一致
     */
    public Programmer[] getTeam() {
        Programmer[] programmers = new Programmer[total];
        for (int i = 0; i < total; i++) {
            programmers[i] = team[i];
        }
        return programmers;
    }

    /**
     * 判断当前员工是否存在团队中
     *
     * @param e 待判断员工
     * @return true表示存在，false表示不存在
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (e.getId() == team[i].getId()) return true;
        }
        return false;
    }
}
