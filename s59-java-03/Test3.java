public class Test3
{

	// + - * / %   i++  ++i

	// ��ϵ����   >  <  >= <= !=

	//�߼�Ԫ��    && ||  ��  &  |   ^

	// ��Ԫ����    ?  :


	
	
	public static void main(String[] args){

		/*
		int i =10 ;
		//i = i++ ;							//�����ұ����I�൱��һ���������������Ҫ����д
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