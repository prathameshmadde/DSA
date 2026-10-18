class  Q19PrintEven
{
	public static void main(String[] args) 
	{	int [] a = {10,21,30,40};
		printEven(a);
	}
	public static void printEven(int [] num){
		for (int i = num.length -1 ; i>= 0 ; i-- )
		{
			if (num[i] %2 == 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
