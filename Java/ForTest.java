class ForTest {
	public static void main(String[] args) {
		int num = 1;
		for (System.out.print("a"); num < 3; System.out.print("c"), num++) {
			System.out.print("b");
		}
		System.out.println("");

		/*
		遍历1-100的所有偶数，获取偶数个数，获取所有偶数的和
		*/
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
				count += 1;
				sum += i;
			}
		}
		System.out.println("偶数的个数为：" + count + "，所有偶数的和为：" + sum);
	}
}