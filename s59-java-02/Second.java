public class Second
{


	public static void main(String[] args)
	{
		//求1-100所有数字之和
		/*
		方法一：
		int sum = 0;
		for(int i = 1; i <= 100; i++)
			sum+=i;
		System.out.println("1-100数字之和为：" + sum);
		*/

		/*
		方法二：
		int sum = 0;
		int i = 1;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("1-100数字之和为：" + sum);
		*/
		int number = 100;

		System.out.println(sum(100));
		//sum(100) = 100 + sum(99) = 100 + 99 + sum(98)

		
		

	}

	public static int sum(int number)		
	{
		 
		if(number - 1 > 0)
			return number + sum(number-1);
		else
			return number;
	}

	
}