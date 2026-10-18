class  Q22PrintNegative
{	public static void main(String[] args) 
	{	int[] a = {-10, 20, -30, 40, 50, -60};;
		printNegative(a);
	}
	public static void printNegative(int [] num){
		for (int i = num.length -1 ; i>= 0 ; i-- )
		{
			if (num[i] < 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
