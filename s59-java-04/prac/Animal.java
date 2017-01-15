public class Animal
{
	String name = "Animal";
	int age = 0;

	public void sayHello()
	{
		System.out.println("Animal sayHello");
	}
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Animal()
	{
		System.out.println("调用父类构造方法！");
	}

	public void sleep()
	{
		System.out.println("Animal sleep");
	}

	public void eat()
	{
		System.out.println("Animal eat");
	}

	public void say()
	{
		System.out.println("say: " + this);
	}
	

	
}