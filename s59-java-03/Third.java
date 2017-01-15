public class Third
{



		public static  int  sum(int i ){

			int s = 0 ;
			if(i>=1){
				s = i-- + sum(i);
			}

			return s ;

		}



		public  static void main(String[] args){
			
				/*
				int sum = 0 ;

				for (int i = 1 ;i<=100 ;i++ )
				{
					sum = sum + i ;
				}


				System.out.println(sum);
				
				*/

				System.out.println(sum(100));
				
		}



}