public class Test2
{

	//  方法的重载    同一个类中  方法名相同  参数不同的方法   参数的个数  参数的类型  参数的顺序


	//如果方法的返回类型不是void  一定要加return语句
	// 如果方法的返回类型是void 可以加也可以不加  reutrn ;


	//加法   两个整数相加并且返回结果
	public static  int add(int a , int b){
		return a + b ;
	}

	public static String add(String a , String b){
		return a + b ;
	}

	public static String add(String a , int b ){
		return a + b ;
	}

	public static String add(int a , String b ){
		return a + b ;
	}

	
	public static void main(String[] args){
		//调用方法  
		int c = add(2,4);
		System.out.println(c);

		String s = add("a" , 10);
		System.out.println(s);

		/*
		String s2 = add(10 , "a");
		System.out.println(s2);
		*/
	}

}