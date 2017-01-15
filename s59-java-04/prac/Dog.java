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
		System.out.println("调用子类构造方法！");
	}

	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	
}