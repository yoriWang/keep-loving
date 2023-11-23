package com.learning.OOP._exception.exper3;

/**
 * ClassName: DivisionDemo
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 11:46
 * @version: 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = divide(a, b);
            System.out.println("结果为：" + result);
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("除0了");
        } finally {
            System.out.println("执行了finally");
        }
    }

    public static int divide(int a, int b) throws BelowZeroException {
        if (a < 0 || b < 0) {
            throw new BelowZeroException("输入不能为负数。");
        }
        return a / b;
    }
}
