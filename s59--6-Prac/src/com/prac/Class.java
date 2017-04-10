package com.prac;


public class Class implements Cloneable{

	int age = 19;
	/**
	 * @author SiVan
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	/*ʵ��clone������Ҫע������
	1. ����clone()����������Object
	2. ����clone()��Ҫ����CloneNotSupportedException
	3. ����clone()������Ҫʵ��Cloneable�ӿ�	 
	
	ʹ��clone �������ɵĶ��󣬵�ַ��ͬ(ͨ��hashcode()�����ж�)������������ͬ
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Class class1 = new Class();
		System.out.println(class1.age);
		Class class2 = (Class) class1.clone();
		System.out.println(class2.age);
		System.out.println(class2.hashCode());
		System.out.println(class1.hashCode());
		
		System.out.println(class1.equals(class2));
		//equals��object�����ǱȽϵ�ַ�������װ���бȽ����ݣ����
		//��д�˸��࣬��������
		System.out.println(class2 == class1);	//��Զ���Ƚϵ�ַ
		
		
	}
}
