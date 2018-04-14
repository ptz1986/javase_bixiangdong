class Car {
	int num;
	String colour;

	void run()
	{
		System.out.println("run...");
	}
}

class CarDemo {
	public static void main(String[] args) 
	{
		Car ca = new Car();
		ca.run();
	}
}
