public class Test
{
	public static void main(String[] args){
	                   
		int[] a = new int[]{1,2,3,4};
		System.out.println(a[2]);

		int[] b = new int[5];
		System.out.println(b[1]);

		//char[] ch = new char[5]{1,2,3,4,5};   错误

		System.out.println(b.length);//  数组可以放多少个内容

		// 表示把10 放在数组的2号位置
		b[2] = 10 ;
		System.out.println(b[2]);

		int[][] s = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(s[2][3]);

	}
}