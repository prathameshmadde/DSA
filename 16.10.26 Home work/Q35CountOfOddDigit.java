class  Q35CountOfOddDigit
{
	public static void main(String[] args) 
	{	int[] a = {5, 12, 7, 145, 99, 3, 456};
		CountOddDigit(a);
	}
	
	public static void CountOddDigit(int []num){
		int count = 0;
		
		for (int i = 0 ;i<num.length ; i++ )
		{
			for (int j= num[i]; j>0 ;j/=10 )
			{ 
				int last = j%10;
				if (last%2 != 0)
				{
					count++;
				}
				
			}
		}
		
		System.out.println("Total no of Odd digits in array = " + count );
	}
}
