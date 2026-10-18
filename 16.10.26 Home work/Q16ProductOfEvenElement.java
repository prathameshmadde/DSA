class Q16ProductOfEvenElement 
{
	public static void main(String[] args) 
	{	int [] a = {10,20,31,41,50};
		
		System.out.println("Procut of Even Elements = "+prodcut(a) );
	
	}
	public static int prodcut(int [] num ){
		int product = 1; 
		for ( int i =0 ; i< num.length ; i++ )
		{
			if (num[i]%2==0)
			{
				product = product * num [i];
			}
		}
		return product ;
	}
	
}

