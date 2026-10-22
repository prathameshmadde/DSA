package Day2;

public class Pb36 {
public static void main(String[] args) {
	char[] ch = {'A', 'k', 'e', 'M', 'o', 't'};
	print(ch);
	}
public static void print(char[] ch) {
	for (int i =ch.length-1; i >= 0; i--) {
		if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'||
				ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='I'||ch[i]=='U') ){
			System.out.println(ch[i]);
			break;
		}
	}
}

}

