public class Prac
{
	//�����ο���ϰ��
	public static void main(String[] args)
	{
		System.out.println(sum(100));
	}
/*
	�Լ�д�ĵݹ�ʵ�֣�
	public static int sum(int number)
	{
		if(number>=1)
			return sum(number-1) + number;
		return number;
	}
	*/

//��ʦ�ݹ�ʵ��
	public static int sum(int number)
	{
		int s = 0;
		if(number >= 1)
			s = number-- + sum(number);
		return s;
	}
}