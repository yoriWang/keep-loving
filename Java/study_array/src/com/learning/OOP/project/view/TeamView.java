package com.learning.OOP.project.view;

import com.learning.OOP.project.domain.Employee;
import com.learning.OOP.project.domain.Programmer;
import com.learning.OOP.project.service.NameListService;
import com.learning.OOP.project.service.TeamException;
import com.learning.OOP.project.service.TeamService;

/**
 * ClassName: TeamView
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 14:20
 * @version: 1.0
 */
public class TeamView {

    private NameListService listService = new NameListService();

    private TeamService teamService = new TeamService();

    /**
     * 主菜单视图
     */
    public void enterMainMenu() {
        // 循环标识
        boolean loopFlag = true;
        // 键盘输入
        char key = 0;

        do {
            if (key != '1') {
                // 打印所有客户信息
                listAllEmployees();
            }
            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员  4-退出    请选择(1~4)：");
            key = TSUtility.readMenuSelection();
            System.out.println();

            switch (key) {
                case '1':
                    listTeam();
                    break;

                case '2':
                    addMember();
                    break;

                case '3':
                    deleteMember();
                    break;

                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char yn = TSUtility.readConfirmSelection();
                    if (yn == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);
    }

    /**
     * 遍历所有客户信息
     */
    private void listAllEmployees() {
        System.out.println("\n---------------------------开发团队调度系统---------------------------");
        Employee[] employees = listService.getAllEmployees();
        if (employees.length == 0) {
            System.out.println("没有客户记录");
        } else {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println(" " + employees[i]);
        }

        System.out.println("-----------------------------------------------------------------------");
    }

    /**
     * 遍历开发团队成员的信息
     */
    private void listTeam() {
        Programmer[] team = teamService.getTeam();
        if (team.length == 0) {
            System.out.println("开发团队目前没有成员！");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t\t股票");
        }
        for (int i = 0; i < team.length; i++) {
            System.out.println(" " + team[i].getDetailsForTeam());
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    //添加成员到团队
    private void addMember() {
        System.out.println("-------------------------添加成员-----------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();

        try {
            Employee e = listService.getEmployee(id);
            teamService.addMember(e);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    //从团队中删除成员
    private void deleteMember() {
        System.out.println("-------------------------删除成员-----------------------");
        System.out.print("请输入要删除的员工ID：");
        int id = TSUtility.readInt();
        System.out.print("确认是否删除(Y/N)：");
        char yn = TSUtility.readConfirmSelection();

        if (yn == 'N') return;

        try {
            teamService.removeMember(id);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }

        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
