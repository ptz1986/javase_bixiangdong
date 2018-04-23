class ArrayToolDemo {
	public static void main(String[] args)
	{
		int[] arr = {5, 10, 7, 9, 6, 12, 3};

		//ArrayTool at = new ArrayTool();
		System.out.println("index = " + ArrayTool.getIndex(arr, 9));
		System.out.println("max = " + ArrayTool.getMax(arr));

	}
}
