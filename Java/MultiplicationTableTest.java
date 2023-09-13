/*
打印一个九九乘法表
*/
class MultiplicationTableTest {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" + (endTime - startTime));
	}
}