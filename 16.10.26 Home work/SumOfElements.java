public class  SumOfElements
{
	public static void main(String[] args) 
	{	int[] a = {10,20,30,40};
		System.out.println("Sum of Elements = "+ sumElements(a) );
	}
	public static int sumElements(int[] num){
		
		int sum = 0; 
		
		for (int i = 0; i<num.length ; i++ )
		{
			sum = sum + num[i];
		}
		return sum;//100
	}
	
}
