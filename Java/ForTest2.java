/*
输入两个正整数m和n，求其最大公约数和最小公倍数
比如：12和20的最大公约数为4，最小公倍数为60
*/

import java.util.Scanner;

class ForTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入第一个数：");
		int m = sc.nextInt();

		System.out.print("请输入第二个数：");
		int n = sc.nextInt();

		System.out.println("输入的m为：" + m + "，输入的n为：" + n);

		// 获取两个数中的最小值
		// 方式一
		int min = m < n ? m : n;
		for (int i = 1; i <= min; i++) {
			// 获取所有公约数
			if (m % i == 0 && n % i == 0) {
				System.out.println(i);
				// 每次赋值给同一个变量，最后打印的变量值就是最大的那个
			}
		}

		// 方式二
		int result = 1;
		for (int i = min; i >= 1; i--) {
			if (m % i == 0 && n % i == 0) {
				// 第一次进入判断的就是最大公约数，结束循环
				result = i;
				break;
			}
		}
		System.out.println("获取到的最大公约数为：" + result);

		// 计算最小公倍数
		// 最小公倍数 = 两个正整数的乘积 / 最大公约数  m * n / result
		System.out.println("最小公倍数为：" + ((m * n) / result));
	}
}