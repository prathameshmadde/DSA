class  	Q5SumOfFristThree
{
	public static void main(String[] args) 
	{	
		int[] a = {10, 20, 30, 40, 50};
		
		System.out.println("Sum of first three elements = " + SumofThree(a) );
		
	}
	public static int SumofThree(int [] num){
		int sum = 0; 
		for (int i = 0 ; i< 3 ; i++ )
		{sum = sum + num[i];
		}
		return sum ;
	}
	
}
