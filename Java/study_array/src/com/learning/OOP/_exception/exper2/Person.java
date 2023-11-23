package com.learning.OOP._exception.exper2;

/**
 * ClassName: Person
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 11:25
 * @version: 1.0
 */
public class Person {
    // 姓名
    private String name;
    // 生命值
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0) {
            throw new NoLifeValueException("生命值不能为负数：" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
