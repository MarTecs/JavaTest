public class Test2
{

	//  ����������    ͬһ������  ��������ͬ  ������ͬ�ķ���   �����ĸ���  ����������  ������˳��


	//��������ķ������Ͳ���void  һ��Ҫ��return���
	// ��������ķ���������void ���Լ�Ҳ���Բ���  reutrn ;


	//�ӷ�   ����������Ӳ��ҷ��ؽ��
	public static  int add(int a , int b){
		return a + b ;
	}

	public static String add(String a , String b){
		return a + b ;
	}

	public static String add(String a , int b ){
		return a + b ;
	}

	public static String add(int a , String b ){
		return a + b ;
	}

	
	public static void main(String[] args){
		//���÷���  
		int c = add(2,4);
		System.out.println(c);

		String s = add("a" , 10);
		System.out.println(s);

		/*
		String s2 = add(10 , "a");
		System.out.println(s2);
		*/
	}

}