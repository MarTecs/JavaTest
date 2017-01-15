public class Test
{

	public static void main(String[] args){
		//  .  的    animal 对象名
		Animal animal = new Animal();
		animal.age = 10 ;
		animal.name="旺财";
		System.out.println(animal.age);
		System.out.println(animal.name);
		animal.sleep();

		Animal animal2 = new Animal();
		animal2.age = 20 ;
		animal2.name="来福";
		System.out.println(animal2.age);
		System.out.println(animal2.name);

		Dog dog = new Dog();
		dog.name="大黄";
		System.out.println(dog.name);
		dog.eat();
		dog.sayHello();


		Animal animal3 = new Animal(10);
		System.out.println(animal3.age);

	}

}