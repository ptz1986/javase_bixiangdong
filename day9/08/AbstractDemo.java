abstract class Employee {
	private String name;
	private String id;
	private int pay;

	Employee(String name, String id, int pay) 
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	abstract void work();
}

class Programmer extends Employee {
	Programmer(String name, String id, int pay)
	{
		super(name, id, pay);
	}

	void work()
	{
		System.out.println("program");
	}
}

class Manager extends Employee {
	private int bonus;

	Manager(String name, String id, int pay, int bonus)
	{
		super(name, id, pay);
		this.bonus = bonus;
	}

	void work()
	{
		System.out.println("manager");
	}
}

class AbstractDemo {
	public static void main(String[] args)
	{
		new Programmer("abc", "111", 123).work();
		new Manager("cd", "222", 321, 56).work();
	}
}
