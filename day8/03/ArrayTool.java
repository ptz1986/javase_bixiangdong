/**
 * 建立一个用于操作数组的类，其中包含常见对数组操作的函数如：最值，排序等.
 * @author ptz
 * @version V1.0
 */

public class ArrayTool {
	/** 
	 * 获取整形数组的最大值
	 * @param arr 接收一个元素为 int 类型的数组
	 * @return 该数组的最大元素
	 */
	public static int getMax(int[] arr)
	{
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex])
				maxIndex = i;
		}

		return arr[maxIndex];
	}

	/**
	 * 对数组进行排序
	 * @param arr 接收一个元素为 int 类型的数组
	 */
	public static void selectSort(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) 
					min = j;
			}

			swap(arr, i, min);
		}
	}

	/**
	 * 用于给数组进行元素的互换
	 * @param arr
	 * @param x
	 * @param y
	 */
	private static void swap(int[] arr, int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	/**
	 * 获取制定元素在制定数组中的索引
	 * @param arr int 类型的数组
	 * @param num 要找的元素
	 * @return 返回该元素第一次出现的位置，如果找不到返回 -1
	 */
	public static int getIndex(int[] arr, int num)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				return i;
		}

		return -1;
	}

	/**
	 * 将 int 类型的数组转化为字符串，格式是：[]
	 */
	public static String arrayToString(int[] arr)
	{
		String str = "[";

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length -1)
				str += arr[i] + ",";
			else
				str += arr[i] + "]";
		}

		return str;
	}
}
