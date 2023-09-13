/*
输出所有水仙花数， 水仙花数是指一个三位数，其各个位上的数字立方和等于其本身。
例如：153 = 1*1*1 + 5*5*5 + 3*3*3
*/

class ForTest1 {
	public static void main(String[] args) {
		int firstNum = 0; // 定义个位数
		int secondNum = 0; // 定义十位数
		int thirdNum = 0; // 定义百位数
		System.out.println("所有的水仙花数有：");
		for (int i = 100; i < 1000; i++) {
			thirdNum = i / 100;
			secondNum = (i % 100) / 10;
			firstNum = i % 10;
			int sum = firstNum * firstNum * firstNum + secondNum * secondNum * secondNum + thirdNum * thirdNum * thirdNum;
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}