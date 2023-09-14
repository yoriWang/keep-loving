package com.learning.one.exer1;

import java.util.Scanner;

/**
 * 案例：学生考试等级划分
 *
 * 从键盘录入学生成绩，找出最高分，并输出学生成绩等级
 *
 *     成绩 >= 最高分-10     等级为'A'
 *     成绩 >= 最高分-20     等级为'B'
 *     成绩 >= 最高分-20     等级为'C'
 *     其余                 等级为'D'
 */
public class ArrayExer1 {

    public static void main(String[] args) {
        // 定义输入变量
        Scanner scan = new Scanner(System.in);

        // 定义存储最高分的变量
        int maxScore = 0;
        // 定义学生成绩等级变量
        String scoreLevel = "";

        // 录入学生人数
        System.out.print("请输入学生数：");
        int count = scan.nextInt();

        // 定义存储学生成绩的数组
        int[] scores = new int[count];

        System.out.println("请输入" + count + "名学生成绩：");
        // 录入成绩
        for (int i = 0; i < count; i++) {
            scores[i] = scan.nextInt();
            maxScore = maxScore > scores[i] ? maxScore : scores[i];
        }
        System.out.println("最高分为：" + maxScore);

        for (int i = 0; i < count; i++) {
            // 打印学生的成绩等级
            if (scores[i] >= maxScore - 10) {
                scoreLevel = "A";
            } else if (scores[i] >= maxScore - 20) {
                scoreLevel = "B";
            } else if (scores[i] >= maxScore - 30) {
                scoreLevel = "C";
            } else {
                scoreLevel = "D";
            }
            System.out.println("学生" + (i + 1) + "的分数为：" + scores[i] + "，等级为：" + scoreLevel);
        }

        // 关闭
        scan.close();
    }

}
