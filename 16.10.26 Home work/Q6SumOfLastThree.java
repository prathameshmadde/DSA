class  	Q6SumOfLastThree
{
	public static void main(String[] args) 
	{	
		int[] a = {10, 20, 30, 40, 50};
		
		System.out.println("Sum of first three elements = " + SumofThree(a) );
		
	}
	public static int SumofThree(int [] num){
		int sum = 0; 
		for (int i = num.length-1 ; i>=num.length - 3 ; i-- )
		{sum = sum + num[i];
		}
		return sum ;
	}
	
}