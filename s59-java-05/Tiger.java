public  class Tiger extends Animal
{

	private int age ;
	public String name ="Tiger" ;

	public static int foot = 4 ;

	public void sayHello(){
		super.sayHello();
	}


	public Tiger(){
		super();//���ø����޲εĹ��췽��  ������ڹ��췽���ĵ�һ��
	}

	//  get/set

	public void setAge(int age){
		this.age =age ;
	}

	public int getAge(){
		return this.age ;
	}


}