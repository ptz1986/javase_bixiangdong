class ArrayDemo {
	static void swap(int[] arr, int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
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

		for (int i = 0; i < len; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
