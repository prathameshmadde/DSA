class Q25PrintNoDivisiblebyFour
{
	public static void main(String[] args) 
	{
		int[] a = {14, 27, 35, 44, 50, 67, 80};
		printNumbyFour(a) ;
	}
	public static void printNumbyFour(int [] num){
		
		for (int i =0 ; i< num.length ;i++ )
		{
			if (num[i]%4 == 0)
		{
			System.out.println(num[i]);
		}
		}
	}
}