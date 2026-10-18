class Q30PrintProductOfDivisiblebyFour
{
	public static void main(String[] args) 
	{
		int[] a = {14, 27, 35, 42, 50, 67, 89};
		System.out.println(productNumbyFour(a));
	}
	public static int productNumbyFour(int [] num){
		int product =1;
		
		for (int i =0 ; i< num.length ;i++ )
		{
			if (num[i]%3 == 0)
		{
			product = product * num[i];
		}
		}
		return product ;
	}
}