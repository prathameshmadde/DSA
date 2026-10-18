class  Q13CheckMiddelElement
{
	public static void main(String[] args) 
	{	int []a ={10,20,30};
	
		System.out.println(checkMiddle(a) );
	
	}
	public static boolean checkMiddle(int [] num){
		if (num.length % 2 !=0)
		{
			return true;
		}
		else{
			return false;
		}
	}
}
