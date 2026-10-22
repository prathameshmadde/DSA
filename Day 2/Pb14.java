package Day2;

public class Pb14 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};

		print(ch);
	}
	public static void print(char [] ch) {
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>'a'&& ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z') {
			
				if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'||
					ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U')) {
				System.out.println(i);
			}
		}
	}
}}
