package Day2;

public class Pb2 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printVovel(ch);

	}
	public static void printVovel(char []ch) {
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'||
				ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U'	)
			{
				System.out.println(ch[i]);
			}
		}
	}
}
