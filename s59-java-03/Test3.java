public class Test3
{

	// + - * / %   i++  ++i

	// 关系运算   >  <  >= <= !=

	//逻辑元算    && ||  ！  &  |   ^

	// 三元运算    ?  :


	
	
	public static void main(String[] args){

		/*
		int i =10 ;
		//i = i++ ;							//这里右边这个I相当于一个副本，因此我们要这样写
		i = ++i ;
		System.out.println(i);
		*/

		
		System.out.println(true && false);
		System.out.println(true & false);

		//System.out.println(1 && 2);
		System.out.println(5 & 8);       //101    1000


		int i =10 ;
		if(i++>10 & i++>10){
			System.out.println(i);
		}

		System.out.println(i);
	
		System.out.println(true ^ false);

		System.out.println(1>2 ? 1:2);

		System.out.println(!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!true);


	}

}