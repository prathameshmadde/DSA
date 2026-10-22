package Day2;
public class Pb5 {
public static void main(String[] args) {
	char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
	lower(ch);
	}
	public static void lower(char ch []) {
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='a'&&ch[i]<='z') {
				System.out.println(ch[i]);
			}
		}
	}
}
