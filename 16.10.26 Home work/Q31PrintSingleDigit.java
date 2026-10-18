class  Q31PrintSingleDigit
{
	public static void main(String[] args) 
	{	int [] a = {5, 12, 7, 145, 99, 3, 456};
		printSingle(a);
	}
	public static void printSingle(int [] num){
		
		for (int i = 0 ; i < num.length ; i++ )
		{
			int count =0;
			for (int j = num[i] ; j>0  ; j/=10 )
			{
				int last = j%10;
				count++;
			}
				
			if (count==1)
			{
			System.out.println(num[i]);
			}
		}
	}
}
