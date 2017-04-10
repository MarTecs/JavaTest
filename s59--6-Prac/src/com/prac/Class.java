package com.prac;


public class Class implements Cloneable{

	int age = 19;
	/**
	 * @author SiVan
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	/*实现clone方法需要注意的事项：
	1. 调用clone()返回类型是Object
	2. 调用clone()需要声明CloneNotSupportedException
	3. 调用clone()的类需要实现Cloneable接口	 
	
	使用clone 方法生成的对象，地址不同(通过hashcode()进行判断)，但是内容相同
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Class class1 = new Class();
		System.out.println(class1.age);
		Class class2 = (Class) class1.clone();
		System.out.println(class2.age);
		System.out.println(class2.hashCode());
		System.out.println(class1.hashCode());
		
		System.out.println(class1.equals(class2));
		//equals在object类中是比较地址，如果包装类中比较内容，如果
		//重写了该类，则具体而定
		System.out.println(class2 == class1);	//永远都比较地址
		
		
	}
}
