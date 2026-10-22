package Day2;

public class Pb3 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printcon(ch);
	}
	public static void printcon(char ch[]) {
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z'||ch[i]>=0&&ch[i]<=9)
			{ 
				if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'||
				ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U')) 
				{
				System.out.println(ch[i]);
		}
	}
}
}}