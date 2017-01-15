public  class Tiger extends Animal
{

	private int age ;
	public String name ="Tiger" ;

	public static int foot = 4 ;

	public void sayHello(){
		super.sayHello();
	}


	public Tiger(){
		super();//调用父类无参的构造方法  必须放在构造方法的第一句
	}

	//  get/set

	public void setAge(int age){
		this.age =age ;
	}

	public int getAge(){
		return this.age ;
	}


}