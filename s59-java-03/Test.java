public class Test
{
	public static void main(String[] args){
	                   
		int[] a = new int[]{1,2,3,4};
		System.out.println(a[2]);

		int[] b = new int[5];
		System.out.println(b[1]);

		//char[] ch = new char[5]{1,2,3,4,5};   ����

		System.out.println(b.length);//  ������ԷŶ��ٸ�����

		// ��ʾ��10 ���������2��λ��
		b[2] = 10 ;
		System.out.println(b[2]);

		int[][] s = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(s[2][3]);

	}
}