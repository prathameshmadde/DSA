class Q32PrintTwoDigit
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,40,33,52};
		printTwodigit(arr);
	}
	public static void printTwodigit(int [] num ){
		int count = 0; 
		for (int a : num)
		{	
			if ( a >9 && a <100)
			{
				count ++ ;
				System.out.println( a);
			}
			
		}
		if(count==0){
			System.out.println("NO Two digit.");
		}
		
	}
}