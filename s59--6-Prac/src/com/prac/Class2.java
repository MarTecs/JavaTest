package com.prac;

import java.lang.*;

public class Class2 {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("������������");
		super.finalize();
		
		//finalize():�ͷŶ��󣬻����ڴ�
	}
	public static void main(String[] args)
	{
		Class2 class1 = new Class2();
		class1 = null;
		/*������ִ�У�ʲô���������
		 * ԭ���� JAVA�е������ռ���ͨ��һ���߳������еģ�����ʱ�Ľ����ռ�
		 */
		System.gc();
		//System.out.println();
		
	}
}
