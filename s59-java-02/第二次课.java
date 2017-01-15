public class Second
{

	//  mian  main
	public static void main(String[] args){
		/*  java的数据类型 */

	
		/*
		byte a = 1 ;
		byte b = 1 ;
		byte c = (byte)(a + b) ;//  byte c = (byte)a + (byte)b;
		System.out.println(c);
		*/


		
		/*
		short s = 10 ;
		short s2 = 20 ;
		char ch = s + s2 ;
		System.out.println(ch);
		*/
		

		/*
		byte b = 10 ;
		short s = b ;
		System.out.println(s);
		byte b2 = (byte)s ;
		System.out.println(b2);
		
		*/


		/*
		byte b = -10 ;
		char ch = b ; 
		System.out.println(ch);
		*/

		//  a-z  A-Z


		/*
		short s = 10 ;
		char ch = (char)s ;
		System.out.println(ch+1-1);
		*/

		/*
		char ch = 'a';
		System.out.println(ch-1+1);
		*/

		// int(4)  long(8)
		
		/*
		long l = 100;
		float f = l ;
		System.out.println(f);
		*/

		/*
		float f = 10.0f/0 ;
		System.out.println(f);
		*/


		/*
		long a = 10 ;
		int b = 20 ;
		int c = (int)(a + b) ;
		System.out.println(c);
		*/


		//boolean   true / false


		/*
		if(true){
			System.out.println(10);
		}
		*/

		/*

		int score = 70 ;

		if(score>=60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}

		if(score>=60){
			System.out.println("及格");
		}

		if(score<60){
			System.out.println("不及格");
		}

		*/

		
		//   switch  条件只能是int或者int以下的数据类型  jdk7.0开始支持字符串


		
		/*

		byte season = 8 ;

		switch (season)
		{
			case 1 :
				System.out.println("春");break;
			case 2 :
				System.out.println("夏");break;
			case 3 :
				System.out.println("秋");break;
			case 4 :
				System.out.println("冬");break;
			default :
				System.out.println("季节有误");
		
		}

		*/

		/*
		for (; ; )
		{	
			System.out.println(1);
		}
		*/


		/*
		for (int i = 1 ;i<10 ;i++ )
		{
			System.out.println(i);
		}

		*/


		/*

		
		for (int i =1;i<=9 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}

		System.out.println(1+"2");

		*/

		
		// 输出1-100之间的所有偶数


		/*
		int i =1;
		while (i<=100)
		{
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
		*/
		
		int i = 1 ;
		while(i<=100){
			if(++i%2!=0){
				continue ;
			}
			System.out.println(i);
		}
		//   1-100  所有数字的和   递归
	}
}