package Day2;

public class Pb4 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		cap(ch);
	}
	public static void cap(char [] ch) {
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&& ch[i]<='Z') {
				System.out.println(ch[i]);
			}
		}
	}
}
