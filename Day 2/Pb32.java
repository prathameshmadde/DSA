package Day2;

public class Pb32 {
	public static void main(String[] args) {
		char[] ch = {'@', 'A', '7', 'n', 'B'};
		printLower(ch);
	}
	public static void printLower(char [] ch) {
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				System.out.println(ch[i]);
			}
		}
	}
}
