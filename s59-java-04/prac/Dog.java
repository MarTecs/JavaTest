public class Dog extends Animal
{
	String name = "Dog";
	int age = 10;


	public void sayHello()
	{
		System.out.println("Dog sayHello");
	}

	public Dog()
	{
		System.out.println("�������๹�췽����");
	}

	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	
}