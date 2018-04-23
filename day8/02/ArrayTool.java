class ArrayTool {
	public static int getMax(int[] arr)
	{
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex])
				maxIndex = i;
		}

		return arr[maxIndex];
	}

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

	private static void swap(int[] arr, int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static int getIndex(int[] arr, int num)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				return i;
		}

		return -1;
	}

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
