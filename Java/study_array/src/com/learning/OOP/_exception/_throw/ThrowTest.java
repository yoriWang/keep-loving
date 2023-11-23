package com.learning.OOP._exception._throw;

import org.junit.Test;

/**
 * ClassName: ThrowTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/8 11:10
 * @version: 1.0
 */
public class ThrowTest {
    @Test
    public void test1() {

        try {
            Student s1 = new Student();
            s1.regist(10);
            s1.regist(-10);
            System.out.println(s1);
        } catch (BelowZeroException e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
    }
}

class Student  {
    int id;

    public void regist(int id) throws BelowZeroException {
        if (id > 0) {
            this.id = id;
        } else {
            throw new BelowZeroException("输入id非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
