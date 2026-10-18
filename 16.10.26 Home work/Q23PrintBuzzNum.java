class Q23PrintBuzzNum 
{
	public static void main(String[] args) 
	{
		int[] a = {14, 27, 35, 42, 50, 67, 89};
		System.outprint(buzzNumberPrint(a) );
	}
	public static void buzzNumberPrint(int [] num){
		for (int i =0 ; i< num.length[] ;i++ )
		{
			if (num[i] % 7 =0 || num[i]%10=7)
		{
			System.out.println(num[i]);
		}
		}
	}
}
