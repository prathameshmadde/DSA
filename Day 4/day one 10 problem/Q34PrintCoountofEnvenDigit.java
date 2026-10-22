class Q34PrintCoountofEnvenDigit
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,40,333,52};
		printThreedigit(arr);
	}
	public static void printThreedigit(int [] num ){
		int count = 0; 
		for (int a : num)
		{	
			if (a % 2 == 0)
			{
				count ++ ;
				
			}
			
		}
		
			System.out.println("Count of even digit="+ count);
		
		
	}
}