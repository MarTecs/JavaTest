public class Prac
{
	//第三次课练习题
	public static void main(String[] args)
	{
		System.out.println(sum(100));
	}
/*
	自己写的递归实现：
	public static int sum(int number)
	{
		if(number>=1)
			return sum(number-1) + number;
		return number;
	}
	*/

//老师递归实现
	public static int sum(int number)
	{
		int s = 0;
		if(number >= 1)
			s = number-- + sum(number);
		return s;
	}
}