package Day2;

public class Pb10 {
	public static void main(String [] args) {
	char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
	oddIndex(ch);
	}
	public static void oddIndex(char [] ch) {
		for (int i = 0; i < ch.length; i++) {
			if(i % 2 != 0) {
				System.out.println(ch[i]);
			}
		}
	}
}
