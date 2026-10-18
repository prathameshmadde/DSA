class  Q18ReverseOrder
{
	public static void main(String[] args) 
	{	int [] a = {10,20,30,40};
		printReverse(a);
	}
	public static void printReverse(int [] num){
		for (int i = num.length -1 ; i>= 0 ; i-- )
		{
			System.out.println(num[i]);
		}
	}
}
