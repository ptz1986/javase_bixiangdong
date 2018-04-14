class ArrayDemo {
	static void swap(int[] arr, int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	static void printArray(int[] arr)
	{
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	static int find(int[] arr, int num)
	{
		int len = arr.length;

		int index = 0;
		int min = 0;
		int max = len - 1;
		
		while (min <= max) {
			index = (min + max) / 2;

			System.out.println("min = " + min + ": " + arr[min] + ", max = " + max + ": " + arr[max] + ", index = " + index + ": " + arr[index]);

			if (arr[index] == num) {
				return index;
			} else if (num < arr[index]) {
				max = index - 1;
			} else if (num > arr[index]) {
				min = index + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int[] arr = {43, 40, 32, 5, 90, 70, 100, 97};

		int len = arr.length;

		for (int i = 0; i < (len - 1); i++) {
			int index = i;
			int num = arr[index];

			for (int j = i + 1; j < len; j++) {
				if (num > arr[j]) {
					num = arr[j];
					index = j;
				}
			}

			if (i < index) {
				swap(arr, i, index);
			}
		}

		printArray(arr);

		int f = 0;

		if ((f = find(arr, 100)) != -1) {
			System.out.println("index = " + f + ", num = " + arr[f]);
		} else {
			System.out.println("none");
		}

		//for (int i = 0; i < len; i++) {
			//System.out.println("arr[" + i + "]=" + arr[i]);
		//}


	}
}
