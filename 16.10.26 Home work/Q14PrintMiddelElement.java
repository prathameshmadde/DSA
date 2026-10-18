class  Q14PrintMiddelElement
{
	public static void main(String[] args) 
	{	int []a ={10,20,30,40};
	
		System.out.println(printMiddle(a) );
	
	}
	public static int  printMiddle(int [] num){
		if (num.length % 2 !=0)
		{
			return num[num.length / 2] ;
		}
		else{
			return 0 ;
		}
	}
}