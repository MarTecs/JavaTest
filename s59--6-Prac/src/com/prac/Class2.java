package com.prac;

import java.lang.*;

public class Class2 {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("垃圾被回收了");
		super.finalize();
		
		//finalize():释放对象，回收内存
	}
	public static void main(String[] args)
	{
		Class2 class1 = new Class2();
		class1 = null;
		/*到这里执行：什么都不会输出
		 * 原因是 JAVA中的垃圾收集是通过一个线程来进行的，不定时的进行收集
		 */
		System.gc();
		//System.out.println();
		
	}
}
