class ArrayDemo {
	public static void main(String[] args)
	{
		int[] arr = {43, 40, 32, 5, 90, 70, 100, 97};

		int len = arr.length;

		for (int i = 0; i < (len - 1); i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
