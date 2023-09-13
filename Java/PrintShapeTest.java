/*
	使用*打印一些形状
					行数			列数
	----*			1	4		1
	---***			2	3		3
	--*****			3	2		5
	-*******		4	1		7
	*********		5	0		9    2 * i - 1
	-*******		6	1		7
	--*****			7	2		5
	---***			8	3		3
	----*			9	4		1
	*
	**
	***
	****
	*****
	******
*/
class PrintShapeTest {
	public static void main(String[] args) {

		// 开始时间
		long startTime = System.currentTimeMillis();

		// 空格数
		int spaceNum = 1;
		// 星星数
		int starNum = 1;
		// 循环
		for (int i = 1; i <= 9; i++) {
			spaceNum = (i <= 5) ? (5 - i) : (i - 5);
			for (int j = 1; j <= spaceNum; j++) {
				System.out.print(" ");
			}

			starNum = (i < 5) ? (2 * i - 1) : (2 * (10 - i) - 1);
			for (int k = 1; k <= starNum; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 结束时间
		long endTime = System.currentTimeMillis();
		System.out.println("总耗时：" + (endTime - startTime));
	}
}