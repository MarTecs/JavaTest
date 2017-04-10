public class Hello{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		
		double num = 1.0/0;
		System.out.println(num);

		int millSeconds = 365 * 24 * 60 * 60 * 1000 * 1000;
		int seconds = 365 * 24 * 60 * 60 * 1000;
		System.out.println(millSeconds);
		System.out.println(seconds);
		System.out.println(millSeconds/seconds);
		System.out.println(millSeconds + java.lang.Integer.MIN_VALUE - java.lang.Integer.MAX_VALUE  );		
		int a = 20;
		int b = 10;
		
		// a = a + b;
		// b = a - b;
		// a = a - b;
		// System.out.println( "a:" + a + " b:" + b);

		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println( "a:" + a + " b:" + b);

		byte m = (byte)130;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(m);		

	}
}