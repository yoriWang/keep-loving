import java.util.Scanner;

/*
    爱记账
    实现功能
    1、查询收支明细
    2、记录收入
    3、记录支出
    4、退出
 */
public class LoveAccount {
    public static void main(String[] args) {
        // 初始化余额
        int balance = 10000;
        String detail = "";
        // 定义输入
        Scanner scan = new Scanner(System.in);
        // 定义标识符
        boolean isFlag = true;

        while (isFlag) {
            System.out.println("--------------------欢迎使用爱记账系统----------------------");
            System.out.println("--------------------请选择操作----------------------");
            System.out.println("\t\t\t\t1、查询明细");
            System.out.println("\t\t\t\t2、记录收入");
            System.out.println("\t\t\t\t3、记录支出");
            System.out.println("\t\t\t\t4、退\t出");
            System.out.print("\t\t\t\t请选择：");

            int selectAction = scan.nextInt();
            switch (selectAction) {
                case 1:
                    System.out.println("余额\t收支类型\t金额\t说明");
                    System.out.print(detail);
                    break;

                case 2:
                    System.out.print("请输入收入金额：");
                    int money = scan.nextInt();
                    System.out.print("请输入说明：");
                    String des = scan.next();
                    balance += money;
                    detail += balance + "\t收入\t" + money + "\t\t" + des + "\n";
                    break;

                case 3:
                    System.out.print("请输入支出金额：");
                    int zhi = scan.nextInt();
                    System.out.print("请输入说明：");
                    String remark = scan.next();
                    balance -= zhi;
                    detail += balance + "\t支出\t-" + zhi + "\t\t" + remark + "\n";
                    break;

                case 4:
                    System.out.print("确定退出本次操作(Y/N)：");
                    while (true) {
                        char option = scan.next().toUpperCase().charAt(0);
                        if (option == 'Y' || option == 'N') {
                            if (option == 'Y') {
                                // 结束程序
                                isFlag = false;
                                System.out.println("谢谢使用，欢迎下次再来");

                            }
                            break;
                        } else {
                            System.out.print("输入错误，请重新输入：");
                        }
                    }
                    break;

                default:
                    System.out.println("输入错误，请重新选择！");
                    break;
            }
        }

        // 关闭输入
        scan.close();
    }
}
