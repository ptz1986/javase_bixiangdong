class Single {
	private static Single s = new Single();

	private Single() {}

	public static Single getInstance(int n)
	{
		if (n == 10)
			return s;
		else
			return null;
	}

}

class SingleDemo {
	public static void main(String[] args)
	{
		Single s1 = Single.getInstance(10);
		Single s2 = Single.getInstance(10);

		System.out.println(s1 == s2);
	}
}
