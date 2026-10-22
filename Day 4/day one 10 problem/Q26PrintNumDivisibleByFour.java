class Q26PrintNumDivisibleByFour
{
	public static void main(String[] args) 
	{
		int [] arr = {10,21,40,33,52};
		printbyThree(arr);
	}
	public static void printbyThree(int [] num ){
		
		for (int a : num)
		{
			if ( a % 4 == 0)
			{
				System.out.println(a);
			}
		}
	}
}