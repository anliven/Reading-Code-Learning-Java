package pers.anliven.learningjava.chapter06;

public class T02Double {

	public static void main(String[] args) {
		// 二维数组的创建及使用
		int arr1[][] = new int[5][8]; // 定义int类型的二维数组，并分配内存
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println(); // 换行
		}

		String arr2[][] = { { "A", "A", "A" }, { "B", "B", "B" }, { "C", "C", "C" } }; // 初始化二维String数组
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println(); // 换行
		}
		
		int[][] arr3 = new int [3][]; // 定义一个三行的二维数组
		arr3[0] = new int[2];
		arr3[1] = new int[2];		
		arr3[0][0] = 1; // 第一行第一列赋值
		arr3[1][0] = 2;
		arr3[2] = new int[5]; // 为第三行分配5列	
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]);
			}
			System.out.println(); // 换行
		}
		
	}

}

/*
 * 如果一个一维数组中的各个元素仍然是数组，这个数组就是一个二维数组。 
 * 二维数组常用于表示表，第一个下标表示元素所在的行，第二个下标表示元素所在的列。
 * 
 * 定义二维数组时可以只指定行的个数，然后再为每一行分别指定列的个数。如果每行的列数不同，则创建的是不规则的二维数组
 * 
 * 对于整型二维数组，默认数组中每个元素初始值为0。
 * 数组的length属性以获取数组的长度。例如，arr1.length获取数组行的长度，arr1[i].length获取数组列的长度。
 * 
 */