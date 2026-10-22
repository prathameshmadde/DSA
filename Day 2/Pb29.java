package Day2;

public class Pb29 {
	public static void main(String [] args) {
	char[] ch = {'#', 'T', 'm', 'E', '7', 'a'};
	vov(ch);
	}
	public static void vov(char [] ch)
	{
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U'||
					ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u') 
			{
				System.out.println(ch[i]);
				break;
			}

		}
	}
}
