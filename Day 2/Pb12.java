package Day2;

public class Pb12 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		eIndex(ch);
	}
	public static void eIndex(char [] ch) {
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'||
					ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U'	)
			{
				System.out.println(i);
			}
		}
	}
}
