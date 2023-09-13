/*
求100以内的所有质数（素数），求100000以内的素数
质数：只能被1和自身整除的数
*/
class PrimeTest1 {
	public static void main(String[] args) {
		// 定义一个标识符
		boolean flag = true;
		// 记录质数个数
		int primeCount = 0;
		// 记录开始时间
		long startTime = System.currentTimeMillis();
		// 遍历
		for (int i = 2; i <= 100000; i++) {
			// 遍历从2到i的所有数，是否能整除i
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					// 说明i不是质数
					flag = false;
					break;  // 添加这行，可以有效的提升性能
				}
			}
			if (flag) {
				primeCount++;
				// System.out.println(i);
			}
			// 重置标识符
			flag = true;
		}
		// 记录结束时间
		long endTime = System.currentTimeMillis();

		// 打印结果
		System.out.println("质数个数为：" + primeCount);
		System.out.println("耗时：" + (endTime - startTime));

	}
}