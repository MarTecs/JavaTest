public class Test
{
	public static void main(String[] args)
	{
		//��������ָ�����࣬������������ģ����Ե��ø����
		Animal dog2 = new Dog();
		dog2.sayHello();
		System.out.println(dog2.name);
		System.out.println(dog2.age);
		
		Animal dog3 = new Dog("С��",100);
		System.out.println(dog3.name);
		System.out.println(dog3.age);

		Animal dog4 = new Dog("���",100);
		dog3.sayHello();
		System.out.println(dog3.name);
		System.out.println(dog3.age);
		
		//��̬��������ʹ��this
	}

	//���ุ��֮�乹�캯����ε��ã�����dog3 dog2 �ڵ����ӹ��캯��֮ǰ��ε��ø��๹�캯��
	//��������ָ�����࣬��������ķ��������������
}