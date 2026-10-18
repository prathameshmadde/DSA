class  Q21Printpositive
{
	public static void main(String[] args) 
	{	int[] a = {-10, 20, -30, 40, 50, -60};;
		printpositive(a);
	}
	public static void printpositive(int [] num){
		for (int i = num.length -1 ; i>= 0 ; i-- )
		{
			if (num[i] >= 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
