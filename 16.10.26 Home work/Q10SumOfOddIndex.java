class Q10SumOfOddIndex 
{
	public static void main(String[] args) 
	{	int[] a = {10, 20, 30, 40, 50};
		System.out.println("Sum of Odd Indexes = " + sumOfOddind(a) );
	}
	public static int sumOfOddind (int [] num ){
		int sum = 0 ; 
		for (int i = 0 ; i < num.length ; i++ )
		{
			if(i%2!=0){
				sum = sum + num[i];
			}
		}
		return sum  ;
	}
}