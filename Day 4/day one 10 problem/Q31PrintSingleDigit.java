class Q31PrintSingleDigit
{
	public static void main(String[] args) 
	{
		int [] arr = {10,2,40,33,52};
		printSingel(arr);
	}
	public static void printSingel(int [] num ){
		int count = 0; 
		for (int a : num)
		{	
			if ( a >=0 && a <10)
			{
				count ++ ;
				System.out.println("Single digit = "+ a);
			}
			
		}
		if(count==0){
			System.out.println("NO singel digit.");
		}
		
	}
}