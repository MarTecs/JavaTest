public class Test
{

	int a = 10 ;

	//����ص�ʱ��ִ��
	static{
		System.out.println("aa");
	}



	public static void main(String[] args){

		Tiger tiger = new Tiger();
		tiger.sayHello();
		//tiger.age = 10 ;
		tiger.setAge(10);
		tiger.name="�ϻ�";
		System.out.println(tiger.getAge());
		System.out.println(Tiger.foot);

		
		Tiger tiger2 = new Tiger();
		tiger2.foot = 3 ;

		Tiger tiger3 = new Tiger();
		System.out.println(tiger3.foot);


	}
}