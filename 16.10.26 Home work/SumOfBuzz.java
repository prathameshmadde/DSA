class SumOfBuzz 
{
	public static void main(String[] args) 
	{	int [] a= {49,7,14,8,56,63};
		
		System.out.println("Sum of Buzz Elements = " + sumEven(a) );
	}
	
	public static int sumEven(int[] num){
		int sum =0;
		for (int i =0 ; i< num.length ; i++ )
		{
			if (num[i]%7 == 0 || num[i]%10 ==7) 
			{sum = sum + num[i];
			}
		}
		return sum; //189
	}
}

