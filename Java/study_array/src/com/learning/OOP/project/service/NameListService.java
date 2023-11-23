package com.learning.OOP.project.service;

import com.learning.OOP.project.domain.*;

import static com.learning.OOP.project.service.Data.*;

/**
 * ClassName: NameListService
 * Description:
 *      负责将data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 *
 * @author: yurenwang
 * @create: 2023/11/10 16:21
 * @version: 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        // 根据项目提供的Data类构建相应大小的Employees数组
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {

            int type = Integer.parseInt(EMPLOYEES[i][0]);

            // 读取通用属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            double bonus;
            int stock;
            Equipment equipment;

            // 再根据Data中的数据构建不同的对象，包括Employee、Programmer、Designer、Architect，以及相关联的Equipment
            // 子类的对象，将对象存于数组中。

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;

                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;

                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;

                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 获取指定id对应的员工
     * @param id 员工id
     * @return 返回对应的员工
     * @throws TeamException
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        // 执行到此处，表示没找到
        throw new TeamException("找不到指定员工。");
    }

    private Equipment createEquipment(int index) {
        if (EQUIPMENTS[index].length == 0) return null;

        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);

        String modelOrName = EQUIPMENTS[index][1];
        String priceOrDisplayOrType = EQUIPMENTS[index][2];

        switch (equipmentType) {
            case PC:
                return new PC(modelOrName, priceOrDisplayOrType);

            case NOTEBOOK:
                return new NoteBook(modelOrName, Double.parseDouble(priceOrDisplayOrType));

            case PRINTER:
                return new Printer(modelOrName, priceOrDisplayOrType);
        }
        return null;
    }
}
