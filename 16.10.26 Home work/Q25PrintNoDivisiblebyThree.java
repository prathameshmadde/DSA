class Q25PrintNoDivisiblebyThree
{
	public static void main(String[] args) 
	{
		int[] a = {14, 27, 35, 42, 50, 67, 89};
		printNumbyThree(a) ;
	}
	public static void printNumbyThree(int [] num){
		
		for (int i =0 ; i< num.length ;i++ )
		{
			if (num[i]%3 == 0)
		{
			System.out.println(num[i]);
		}
		}
	}
}