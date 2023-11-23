package com.learning.OOP.project.junit;

import com.learning.OOP.project.domain.Employee;
import com.learning.OOP.project.service.NameListService;
import com.learning.OOP.project.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 14:19
 * @version: 1.0
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees() {
        NameListService listService = new NameListService();
        Employee[] employees = listService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee() {
        try {
            NameListService listService = new NameListService();
            System.out.println(listService.getEmployee(3));
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
