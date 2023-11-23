package com.learning.OOP._exception.exper2;

import org.junit.Test;

/**
 * ClassName: Exper2Test
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 11:28
 * @version: 1.0
 */
public class Exper2Test {

    @Test
    public void test2() {
        try {
            Person p = new Person();
            p.setName("奥特曼");
            p.setLifeValue(-100);
            System.out.println(p);
        } catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
