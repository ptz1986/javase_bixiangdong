class Fu {
	Fu()
	{
		super();
		show();
	}

	void show()
	{
		System.out.println("fu show");
	}
}

class Zi extends Fu {
	int num = 8;

	Zi()
	{
		super();
		System.out.println("zi ..." + num);

	}

	void show()
	{
		System.out.println("zi show " + num);
	}
}

class ExtendsDemo {
	public static void main(String[] args)
	{
		Zi z = new Zi();
		z.show();
	}
}
