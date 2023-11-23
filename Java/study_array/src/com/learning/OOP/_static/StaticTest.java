package com.learning.OOP._static;

/**
 * ClassName: StaticTest
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/10/24 16:13
 * @version: 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        // 可以将main方法当做普通的静态方法访问
//        String[] strs = new String[]{"java", "python", "C#", "Ruby"};
//        Animal.main(strs);

        // 静态成员变量在类被加载的时候完成初始化且在内存中只有一份
        System.out.println(Animal.type);
        Animal.type = "两栖动物";
        System.out.println(Animal.type);
        System.out.println("小鸟属于" + Bird.type + "吗？");

        // 静态成员方法在类被加载的时候完成加载且内存中只有一份
        // 静态成员方法不可被重写
        System.out.print("print-----");
        Animal.breath();
        Bird.breath();

    }
}

class Animal {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//    }

    String name;
    int footerNum;

    // 静态代码块
    static String type = "哺乳动物";

    static {
        System.out.println("静态代码块无法调用非静态成员属性或方法");

    }

    public void sleep() {
        System.out.println("动物睡觉");
    }

    public void eat() {
        System.out.println("动物觅食");
        System.out.println("非静态方法可以调用静态成员变量或方法");
    }

    public static void breath() {
        System.out.println("所有动物都需要呼吸");
        System.out.println("静态方法无法调用非静态方法或属性");
    }

}

class Bird extends Animal {

}
