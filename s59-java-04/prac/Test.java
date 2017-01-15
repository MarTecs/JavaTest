public class Test
{
	public static void main(String[] args)
	{
		//父类引用指向子类，方法调用子类的，属性调用父类的
		Animal dog2 = new Dog();
		dog2.sayHello();
		System.out.println(dog2.name);
		System.out.println(dog2.age);
		
		Animal dog3 = new Dog("小黄",100);
		System.out.println(dog3.name);
		System.out.println(dog3.age);

		Animal dog4 = new Dog("大黄",100);
		dog3.sayHello();
		System.out.println(dog3.name);
		System.out.println(dog3.age);
		
		//静态方法不能使用this
	}

	//子类父类之间构造函数如何调用，例如dog3 dog2 在调用子构造函数之前如何调用父类构造函数
	//父类引用指向子类，调用子类的方法，父类的属性
}