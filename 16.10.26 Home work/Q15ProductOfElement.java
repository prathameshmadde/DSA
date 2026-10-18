class Q15ProductOfElement 
{
	public static void main(String[] args) 
	{	int [] a = {10,20,30,40,50};
		
		System.out.println("Procut of Elements = "+prodcut(a) );
	
	}
	public static int prodcut(int [] num ){
		int product = 1; 
		for ( int i =0 ; i< num.length ; i++ )
		{
			product = product * num [i];
		}
		return product ;
	}
	
}


