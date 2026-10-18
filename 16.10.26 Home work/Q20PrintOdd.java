class  Q20PrintOdd
{
	public static void main(String[] args) 
	{	int [] a = {10,21,31,40};
		printOdd(a);
	}
	public static void printOdd(int [] num){
		for (int i = num.length -1 ; i>= 0 ; i-- )
		{
			if (num[i] %2 != 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
